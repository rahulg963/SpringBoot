package com.rahul.Dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.DTO.UserResponseDTO;
import com.rahul.Entity.User;
import com.rahul.HibernateUtil;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by rahul on 11/7/17.
 */

@Transactional
@Repository
public class UserDao extends HibernateUtil{

    ModelMapper modelMapper = new ModelMapper();

    public UserResponseDTO getUserById(int id){
        User user = this.getEntityManager().find(User.class, id);
        return modelMapper.map(user, UserResponseDTO.class);
    }

//   User(id, email, name, role)
//   Role(id, name)
//   Contact(id, type, value, userId)
//   Subject(id, name)
//   UserSubject(id, userId, subjectId)
//   stu is being taught by which teachers?
}
