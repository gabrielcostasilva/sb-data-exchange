package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class DemoApplicationTests {

	@Value("classpath:data/CD.xml")
	Resource file;

	@Autowired
	ObjectMapper mapper;

	@Test
	void contextLoads() throws Exception {
		assertNotNull(mapper);

		CD aCD = 
			mapper.readValue(
					file.getInputStream(), 
					CD.class);

		System.out.println(aCD);
		
		assertEquals("Empire Burlesque", aCD.title());
		assertNotEquals("John Doe", aCD.title());
	}

}
