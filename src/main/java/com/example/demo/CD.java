package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CD(
    @JsonProperty("TITLE")
    String title,
    @JsonProperty("ARTIST")
    String artist,
    @JsonProperty("COUNTRY")
    String country,
    @JsonProperty("COMPANY")
    String company,
    @JsonProperty("PRICE")
    double price,
    @JsonProperty("YEAR")
    String year) {}
