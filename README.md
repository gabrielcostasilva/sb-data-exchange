# SPRING BOOT DATA EXCHANGE - XML
Playground for managing different format files for data exchange with Spring Boot

Please visit the [main branch](https://github.com/gabrielcostasilva/sb-data-exchange.git) to check out related projects.

> This branch builds on top of the [yaml branch](https://github.com/gabrielcostasilva/sb-data-exchange/tree/yaml) to enabling managing XML files

## Overview
As other projects in this repository, this project consists of a single XML file ([`CD.xml`](./src/main/resources/data/CD.xml)) and a [test class](./src/test/java/com/example/demo/DemoApplicationTests.java) that loads the JSON file data.

As before, we use [Jackson library](https://github.com/FasterXML/jackson), which is loaded in the `spring-boot-starter-web` dependency. In addition, we add `com.fasterxml.jackson.dataformat.jackson-dataformat-xml` to enable managing XML files with Jackson.

In addition to set the proper XML Factory in the [configuration file](./src/main/java/com/example/demo/WebConfig.java), we also need to annotate `CD` attributes with `com.fasterxml.jackson.annotation.JsonProperty` as the XML use capitalized properties.

> Please refer to the [YAML project](https://github.com/gabrielcostasilva/sb-data-exchange/tree/yaml) to understand the details of using Jackson.
