package com.mustafa.model.jpaFactory.Impl;

import com.mustafa.model.jpaFactory.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements JpaFactory {

    private EntityManager entityManager=null;
    @Override
    public EntityManager getentityManager() {

        EntityManagerFactory factory= Persistence.createEntityManagerFactory("persistence-unit");
        this.entityManager= factory.createEntityManager();
        return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {
        EntityTransaction transaction=this.entityManager.getTransaction();
        return transaction;
    }
}
