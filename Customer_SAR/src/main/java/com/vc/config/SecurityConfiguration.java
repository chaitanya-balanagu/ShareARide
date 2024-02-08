package com.vc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.vc.filter.JwtFilter;
import com.vc.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter //Login
{

	@Autowired
	CustomUserDetailsService customUserDetailsService;

	@Autowired
	JwtFilter jwtFilter;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(customUserDetailsService);
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	public void configure(WebSecurity web) throws Exception
	{
		web.ignoring().antMatchers("/h2-console/**");
		web.ignoring().antMatchers("/v2/api-docs/**");
		web.ignoring().antMatchers("/swagger.json");
		web.ignoring().antMatchers("/swagger-ui.html");
		web.ignoring().antMatchers("/swagger-resources/**");
		web.ignoring().antMatchers("/webjars/**");  
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable().exceptionHandling().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().authorizeRequests().antMatchers("/v2/api-docs",
				"/swagger-resources/**",  
				"/swagger-ui.html/**",
				"/webjars/**" ,
				"/swagger.json",  
				"/configuration/**",      // swagger configuration
				"/*.html",
				"/favicon.ico",
				"/**/*.html",
				"/**/*.css",
				"/**/*.js",
				"/vehicle/getAllVehicles",
				"/vehicle/addVehicle",
				"/vehicle/updateVehicle",
				"/vehicle/deleteVehicle/{id}",
				"/vehicle/getVehicleById/{id}",
				"/customer/authenticate",
				"/vehicle/getAdminmsgs",
				"/customer/register",
				"/userride/getAllRides",
				"/userride/bookARide",
				"/userride/cancelRideById/{id}"

				).permitAll().anyRequest().authenticated();

		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	}

}