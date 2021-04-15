package com.mustafa.model.jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JpaFactory {
    EntityManager getentityManager();
    EntityTransaction getEntityTransaction();

}
