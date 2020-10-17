package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStation() {
        radio.newCurrentStation(2);
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        radio.newCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void maxStation() {
        radio.newCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void aboveMaxStation() {
        radio.newCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void anyCurrentStation() {
        radio.newCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }


    @Test
    public void nextVolume() {
        radio.setCurrentVolume(1);
        radio.nextVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        radio.setCurrentVolume(2);
        radio.prevVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void MaxVolume() {
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void MinVolume() {
        radio.setCurrentVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void anyCurrentVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentStation());
    }
}