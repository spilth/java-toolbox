package com.javatoolbox.categories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriesRepository extends CrudRepository<Category, Long> {
    List<Category> findAllByOrderByNameAsc();
}
