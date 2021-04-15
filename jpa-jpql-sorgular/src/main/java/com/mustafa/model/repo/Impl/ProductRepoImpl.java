package com.mustafa.model.repo.Impl;

import com.mustafa.model.Brand;
import com.mustafa.model.Category;
import com.mustafa.model.Product;
import com.mustafa.model.jpaFactory.Impl.JpaFactoryImpl;
import com.mustafa.model.jpaFactory.JpaFactory;
import com.mustafa.model.repo.ProductRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class ProductRepoImpl implements ProductRepo {

    private JpaFactory jpaFactory=new JpaFactoryImpl();
    private EntityManager entityManager= jpaFactory.getentityManager();
    private EntityTransaction transaction= jpaFactory.getEntityTransaction();


    @Override
    public Product saveProduct(Product product) {
        this.transaction.begin();
        entityManager.persist(product);
        this.transaction.commit();
        return product;
    }

    @Override
    public Brand saveBrand(Brand brand) {
        this.transaction.begin();
        entityManager.persist(brand);
        this.transaction.commit();
        return brand;
    }

    @Override
    public Category saveCategory(Category category) {
        this.transaction.begin();
        entityManager.persist(category);
        this.transaction.commit();
        return category;
    }

    @Override
    public List<Product> findProducts() {
        Query query=this.entityManager.createQuery("select p from Product p");
        List<Product> products= query.getResultList();
        return products;
    }
}
