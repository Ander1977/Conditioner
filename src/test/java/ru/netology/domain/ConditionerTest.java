package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }


    @Test
    void MinTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(conditioner.getCurrentTemperature(), 0);
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    void MaxTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(conditioner.getCurrentTemperature(), 0);
        conditioner.setName("Samsung");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(31);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}

