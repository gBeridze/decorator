package com.maxinai.testproblems.decorator.logic;

import org.springframework.stereotype.Component;


public class MainManagerImpl implements MainManager {
    @Override
    public void doGreatJob() {
        // doing great job
        System.out.println("I'm doing great job");
    }
}
