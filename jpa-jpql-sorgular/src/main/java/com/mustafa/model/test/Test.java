package com.mustafa.model.test;

import com.mustafa.model.Brand;
import com.mustafa.model.Category;
import com.mustafa.model.Product;
import com.mustafa.model.repo.Impl.ProductRepoImpl;
import com.mustafa.model.repo.ProductRepo;

import java.util.Date;

public class Test {

    private  static ProductRepo productRepo=new ProductRepoImpl();

    public static void main(String[] args) {

        insertData();

    }

    public static void insertData(){

        Brand brand=new Brand("Apple");
        Brand brand1=new Brand("Samsung");
        Brand brand2=new Brand("LG");

        Category category=new Category("Bilgisayar");
        Category category1=new Category("Tablet");
        Category category2=new Category("Telefon");


        Product product=new Product("Iphone 12",15000,3,brand,category2,new Date());
        Product product1=new Product("Note 10",12000,4,brand1,category2,new Date());
        Product product2=new Product("LG-2",1000,5,brand2,category2,new Date());
        Product product3=new Product("MAC i7",14000,5,brand,category,new Date());
        Product product4=new Product("SamsungLeptop",1000,5,brand1,category,new Date());
        Product product5=new Product("LG-Leptop",1000,5,brand2,category,new Date());




        productRepo.saveBrand(brand);
        productRepo.saveBrand(brand1);
        productRepo.saveBrand(brand2);

        productRepo.saveCategory(category);
        productRepo.saveCategory(category1);
        productRepo.saveCategory(category2);

        productRepo.saveProduct(product);
        productRepo.saveProduct(product1);
        productRepo.saveProduct(product2);
        productRepo.saveProduct(product3);
        productRepo.saveProduct(product4);
        productRepo.saveProduct(product5);

    }
}
