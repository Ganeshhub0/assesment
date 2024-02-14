package com.example.asses3.services;

import com.example.asses3.dao.PolicyDaoImpl;
import com.example.asses3.entities.Coverage;
import com.example.asses3.entities.Policy;
import com.example.asses3.entities.Rate;
import com.example.asses3.entities.State;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    PolicyDaoImpl policyDao;

    @Transactional
    @Override
    public void insert(Policy policy) {
        policyDao.insert(policy);
    }

    @Transactional
    @Override
    public Policy update(Policy policy) {
        return policyDao.update(policy);
    }

    @Override
    public Policy findbyid(int id) {
        return policyDao.findbyid(id);
    }

    @Override
    public List<Policy> findall() {
        return policyDao.findall();
    }

    @Override
    public List<Coverage> findcoverage() {
        return policyDao.findcoverage();
    }

    @Override
    public Coverage findcoveragebtid(int id) {
        return policyDao.findcoveragebtid(id);
    }

    @Transactional
    @Override
    public void addcoverage(Coverage coverage) {
        policyDao.addcoverage(coverage);
    }

    @Transactional
    @Override
    public void addstate(State state) {
        policyDao.addstate(state);
    }

    @Override
    public List<State> findstate() {
        return policyDao.findstate();
    }

    @Override
    public State findstateid(int id) {
        return policyDao.findstateid(id);
    }


    @Override
    public Rate findratebyid(int id) {
        return policyDao.findratebyid(id);
    }

    @Override
    public List<Rate> findrate() {
        return policyDao.findrate();
    }


}
