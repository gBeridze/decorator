package com.maxinai.testproblems.decorator.logic;

import org.springframework.stereotype.Component;

@Component
public class MainManagerFactory {

    public MainManager createMainManager() {
        return new MainManagerDecoratorImp(new MainManagerImpl());
    }
}
