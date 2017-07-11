package com.rahul.Dao;

import com.rahul.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by rahul on 11/7/17.
 */

@Transactional
@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public User getUserById(int id){
        return entityManager.find(User.class, id);
    }

//   User(id, email, name, role)
//   Role(id, name)
//   Contact(id, type, value, userId)
//   Subject(id, name)
//   UserSubject(id, userId, subjectId)
//   student is being taught by which teachers?
}
