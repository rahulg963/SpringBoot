package com.rahul;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by rahul on 12/7/17.
 */

@Repository
public class HibernateUtil {

    private ThreadLocal<Session> currentSession = new ThreadLocal();
    @PersistenceContext
    EntityManager entityManager;

    public Session getCurrentSession() {
        Session session = this.currentSession.get();
        return null != session?session:this.entityManager.unwrap(Session.class);
    }

    public CriteriaBuilder getCriteriaBuilder() {
        return this.entityManager.getCriteriaBuilder();
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

}
