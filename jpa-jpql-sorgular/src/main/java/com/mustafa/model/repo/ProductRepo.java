package com.mustafa.model.repo;

import com.mustafa.model.Brand;
import com.mustafa.model.Category;
import com.mustafa.model.Product;

import java.util.List;

public interface ProductRepo {
    Product saveProduct(Product product);
    Brand saveBrand(Brand brand);
    Category saveCategory(Category category);
    List<Product> findProducts();


}
