package com.caio.demo.repositories;

import com.caio.demo.config.mongo.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category , String> {

}
