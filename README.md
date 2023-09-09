# SPRING BOOT DATA EXCHANGE - JSON
Playground for managing different format files for data exchange with Spring Boot

Please visit the [main branch](https://github.com/gabrielcostasilva/sb-data-exchange.git) to check out related projects.

> This branch shows how to manage local JSON files

## Overview
This project consists of a single JSON file ([`users.json`](./src/main/resources/data/users.json)) and a [test class](./src/test/java/com/example/demo/DemoApplicationTests.java) that loads the JSON file data.

To do so, we use [Jackson library](https://github.com/FasterXML/jackson), which is loaded in the `spring-boot-starter-web` dependency.

The code below fully shows the test class.

```java

@JsonTest // (1)
class DemoApplicationTests {

	@Value("classpath:data/users.json") // (2)
	Resource userJson;

	@Autowired //(3)
	ObjectMapper mapper;

	@Test
	void contextLoads() throws Exception {
		assertNotNull(mapper);

		List<User> users = 
			mapper.readValue(
					userJson.getInputStream(), 
					new TypeReference<List<User>>() {}); // (4)

		assertEquals(10, users.size());
		assertNotEquals(9, users.size());
	}

}
```

1. Loads the test slice necessary for managing JSON files, instead of the entire app context;
2. Identifies the location of JSON file and maps it to the `Resource` object;
3. Injects the Jackson object responsible for managing the JSON file;
4. Loads the JSON file content.

Notice that we are loading a list of `User`. Therefore, we need a `TypeReference` instead of a single type.

## Further Reference

- [A Practical Guide to reading JSON and Persisting it to a database](https://youtu.be/EumLbf8WjnY?si=ly5FtxazeAYSdjws) is Dan Vega's introduction to the subject. In this video, he manages the file using nodes;
- [How to use it and when to turn to creating Custom Deserializers](https://youtu.be/cw0TfpcUkao?si=tGfd4-RR0okxKXf4) extends the previous video using custom deserializers. This creates an abstraction layer that simplifies the managing the related POJO's.
- [Jackson JSON Tutorial](https://www.baeldung.com/jackson) introduces Jackson features.