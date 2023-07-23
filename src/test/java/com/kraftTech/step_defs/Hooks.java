package com.kraftTech.step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before (order = 0)
    public void setUp(){
        System.out.println("Before Method");
    }
    @After(order = 0)
    public void tearDown(){
        System.out.println("After Method");
    }

    @Before(value = "@manager", order = 1)
    public void setUpManager(){
        System.out.println("Before Manager");
    }
    @After(value = "@manager", order = 1)
    public void tearDownManager(){
        System.out.println("After Manager");
    }
}
