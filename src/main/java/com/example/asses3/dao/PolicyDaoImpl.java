package com.example.asses3.dao;

import com.example.asses3.entities.Coverage;
import com.example.asses3.entities.Policy;
import com.example.asses3.entities.Rate;
import com.example.asses3.entities.State;
import jakarta.persistence.Access;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyDaoImpl implements PolicyDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void insert(Policy policy) {
        entityManager.persist(policy);
    }

    @Override
    public Policy update(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public Policy findbyid(int id) {
        return entityManager.find(Policy.class, id);
    }

    @Override
    public List<Policy> findall() {
        TypedQuery<Policy> typedQuery = entityManager.createQuery("from Policy", Policy.class);
        List<Policy> list = typedQuery.getResultList();
        return list;
    }

    @Override
    public List<Coverage> findcoverage() {
        TypedQuery<Coverage> typedQuery = entityManager.createQuery("from Coverage", Coverage.class);
        List<Coverage> list = typedQuery.getResultList();
        return list;
    }

    @Override
    public Coverage findcoveragebtid(int id) {
        return entityManager.find(Coverage.class, id);
    }

    @Override
    public void addcoverage(Coverage coverage) {
        entityManager.persist(coverage);
    }

    @Override
    public void addstate(State state) {
        entityManager.persist(state);
    }

    @Override
    public List<State> findstate() {
        TypedQuery<State> typedQuery = entityManager.createQuery("from State", State.class);
        List<State> list = typedQuery.getResultList();
        return list;
    }

    @Override
    public State findstateid(int id) {
        return entityManager.find(State.class, id);
    }


    @Override
    public Rate findratebyid(int id) {
        return entityManager.find(Rate.class, id);
    }

    @Override
    public List<Rate> findrate() {
        TypedQuery<Rate> typedQuery = entityManager.createQuery("from Rate", Rate.class);
        List<Rate> list = typedQuery.getResultList();
        return list;
    }
}
