package com.maxinai.testproblems.decorator;

import com.maxinai.testproblems.decorator.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DecoratorApplication {

    private final MainController mainController;

    @Autowired
    public DecoratorApplication(MainController mainController) {
        this.mainController = mainController;
    }

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
    }

    @PostConstruct
    public void post() {
        mainController.doGreatJob();
    }
}
