package com.example.demo;

import java.util.List;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CATALOG")
public record Catalog(@JacksonXmlProperty List<CD> CD) {
}
