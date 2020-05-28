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
}

