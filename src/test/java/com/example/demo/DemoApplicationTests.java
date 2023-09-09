package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class DemoApplicationTests {

	@Value("classpath:data/store.yaml")
	Resource file;

	@Autowired
	ObjectMapper mapper;

	@Test
	void contextLoads() throws Exception {
		assertNotNull(mapper);

		Store store = 
			mapper.readValue(
					file.getInputStream(), 
					Store.class);

		System.out.println(store);
		
		assertEquals(2, store.products().size());
		assertNotEquals(3, store.products().size());
	}

}
