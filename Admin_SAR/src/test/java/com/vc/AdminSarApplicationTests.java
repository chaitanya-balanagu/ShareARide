package com.vc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.vc.model.Vehicle;
import com.vc.repository.VehicleRepository;
import com.vc.service.VehicleService;


@SpringBootTest
class AdminSarApplicationTests {
	@MockBean
	VehicleRepository vRepo;

	@Autowired
	VehicleService vServ;
	@Test
	public void getVehicleTest(){
		List<Vehicle> v=new ArrayList<>();
		Vehicle c= new Vehicle(101,"tvs","jupiter","ad123",2,"booked",123,"false");
		v.add(c);
		when(vRepo.findAll()).thenReturn(v);
		assertEquals(1,vServ.getAllVehicles().size());

	}

}
