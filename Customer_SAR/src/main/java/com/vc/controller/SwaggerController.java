package com.vc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Configuration
@EnableSwagger2
public class SwaggerController {

    public static final String AUTHORIZATION_HEADER = "Authorization";

    private ApiKey apiKeys(){
        return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
    }
   
    private List<SecurityContext> securityContexts()
    {
    return Arrays.asList(SecurityContext.builder().securityReferences(sf()).build());
    }
    private List<SecurityReference> sf()
    {
    AuthorizationScope scope=new AuthorizationScope("global", "accessEverything");
    return Arrays.asList(new SecurityReference("JWT",new AuthorizationScope[] {scope}));
    }
@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securityContexts(securityContexts())
                .securitySchemes(Arrays.asList(apiKeys()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Spring Boot Blog REST APIs",
                "Spring Boot Blog REST API Documentation",
                "1",
                "Terms of service",
                new Contact("Kajal Singh", "www.google.co.in", "kj@gmail.com"),
                "License of API",
                "API license URL",
                Collections.emptyList()
        );
    }
}


