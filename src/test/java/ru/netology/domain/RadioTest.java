package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStation() {
        radio.newCurrentStation(2);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        radio.newCurrentStation(10);
        radio.prevStation();
        radio.prevStation();
        radio.prevStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void prevStation2() {
        radio.newCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void maxStation() {
        radio.newCurrentStation(9);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void aboveMaxStation() {
        radio.newCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void aboveMaxStation2() {
        radio.newCurrentStation(10);
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void anyCurrentStation() {
        radio.newCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }


    @Test
    public void nextVolume() {
        radio.setCurrentVolume(47);
        radio.nextVolume();
        assertEquals(48, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        radio.setCurrentVolume(25);
        radio.prevVolume();
        assertEquals(24, radio.getCurrentVolume());
    }

    @Test
    public void MaxVolume() {
        radio.setCurrentVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
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