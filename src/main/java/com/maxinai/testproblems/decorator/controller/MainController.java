package com.maxinai.testproblems.decorator.controller;

import com.maxinai.testproblems.decorator.logic.MainManager;
import com.maxinai.testproblems.decorator.logic.MainManagerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private MainManagerFactory mainManagerFactory;
    private MainManager mainManager;

    public MainController(MainManagerFactory mainManagerFactory) {
        this.mainManagerFactory = mainManagerFactory;
        this.mainManager = mainManagerFactory.createMainManager();
    }

    public void doGreatJob() {
        mainManager.doGreatJob();
    }
}
