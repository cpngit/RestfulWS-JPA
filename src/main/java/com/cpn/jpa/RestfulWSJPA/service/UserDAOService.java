package com.cpn.jpa.RestfulWSJPA.service;

import com.cpn.jpa.RestfulWSJPA.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user)
    {
        entityManager.persist(user);
        return  user.getId();
    }
}
