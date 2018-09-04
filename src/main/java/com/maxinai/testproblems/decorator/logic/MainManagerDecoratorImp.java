package com.maxinai.testproblems.decorator.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class MainManagerDecoratorImp implements MainMangerDecorator {


    MainManager mainManager;

    public MainManagerDecoratorImp(MainManager mainManager) {
        this.mainManager = mainManager;
    }

    @Override
    public void doGreatJob() {
        System.out.println("from decorator");
        long startTime = System.nanoTime();
        mainManager.doGreatJob();
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) + " Nano seconds");
    }




}
