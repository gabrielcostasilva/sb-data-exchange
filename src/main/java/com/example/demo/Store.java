package com.example.demo;

import java.util.List;

public record Store(
    String title,
    String description,
    List<Product> products) {}
