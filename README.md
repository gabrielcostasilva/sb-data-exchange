# SPRING BOOT DATA EXCHANGE - YAML
Playground for managing different format files for data exchange with Spring Boot

Please visit the [main branch](https://github.com/gabrielcostasilva/sb-data-exchange.git) to check out related projects.

> This branch builds on top of the [json branch](https://github.com/gabrielcostasilva/sb-data-exchange/tree/json) to enabling managing YAML files

## Overview
As the JSON project, this project consists of a single JSON file ([`store.yaml`](./src/main/resources/data/store.yaml)) and a [test class](./src/test/java/com/example/demo/DemoApplicationTests.java) that loads the JSON file data.

To do so, we use [Jackson library](https://github.com/FasterXML/jackson), which is loaded in the `spring-boot-starter-web` dependency. In addition, we add `com.fasterxml.jackson.dataformat.jackson-dataformat-yaml` to enable managing YAML files with Jackson.

The main difference between managing JSON and YAML files is the need for a [configuration file](./src/main/java/com/example/demo/WebConfig.java). The configuration file sets two _Spring Beans_  for setting YAML as the default format.

> Please refer to the [JSON project](https://github.com/gabrielcostasilva/sb-data-exchange/tree/json) to understand the details of using Jackson.

## Further Reference

- [How to read in YAML data with Jackson in Spring Boot Applications](https://youtu.be/zy8slvenGxc?si=xegD8mRr_Hy242C8) is the base for this branch.