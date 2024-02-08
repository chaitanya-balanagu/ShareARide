package com.vc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.vc.model.AdminMessage;
import com.vc.repository.AdminMessageRepository;
import com.vc.service.AdminMessageService;


@SpringBootTest
class NotificationSarApplicationTests {
	@MockBean
	AdminMessageRepository vRepo;

	@Autowired
	AdminMessageService vServ;
	@Test
	public void getAdminTest(){
		List<AdminMessage> v=new ArrayList<>();
		AdminMessage c= new AdminMessage(101,"hii user");
		v.add(c);
		when(vRepo.findAll()).thenReturn(v);
		assertEquals(1,vServ.getAllAdminMessages().size());

	}

}





