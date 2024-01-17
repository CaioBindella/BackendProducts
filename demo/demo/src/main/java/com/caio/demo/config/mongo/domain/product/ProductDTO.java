package com.caio.demo.config.mongo.domain.product;

public record ProductDTO(String title, String description, String ownerId, Integer price, String categoryId) {
}
