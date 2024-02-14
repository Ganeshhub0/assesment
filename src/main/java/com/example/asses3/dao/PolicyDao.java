package com.example.asses3.dao;

import com.example.asses3.entities.Coverage;
import com.example.asses3.entities.Policy;
import com.example.asses3.entities.Rate;
import com.example.asses3.entities.State;

import java.util.List;

public interface PolicyDao {
    public void insert(Policy policy);
    public Policy update(Policy policy);
    public Policy findbyid(int id);
    public List<Policy> findall();
    public List<Coverage> findcoverage();
    public Coverage findcoveragebtid(int id);
    public void addcoverage(Coverage coverage);
    public void addstate(State state);
    public List<State> findstate();
    public State findstateid(int id);
    public Rate findratebyid(int id);
    public List<Rate> findrate();
}
