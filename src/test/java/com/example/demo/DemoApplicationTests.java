package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
class DemoApplicationTests {

	@Value("classpath:data/users.json")
	Resource userJson;

	@Autowired
	ObjectMapper mapper;

	@Test
	void contextLoads() throws Exception {
		assertNotNull(mapper);

		List<User> users = 
			mapper.readValue(
					userJson.getInputStream(), 
					new TypeReference<List<User>>() {});

		assertEquals(10, users.size());
		assertNotEquals(9, users.size());
	}

}
