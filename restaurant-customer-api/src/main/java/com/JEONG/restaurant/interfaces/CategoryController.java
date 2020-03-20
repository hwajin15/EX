package com.JEONG.restaurant.interfaces;

import com.JEONG.restaurant.application.CategoryService;
import com.JEONG.restaurant.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> list(){
        List<Category> categories = categoryService.getCategories();

        return categories;
    }



}
