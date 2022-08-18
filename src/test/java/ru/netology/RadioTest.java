package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationNegative() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    public void previousStationNull() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void previousStationUnderTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        radio.previousStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNegative() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderTen() {
        Radio service = new Radio();

        service.setCurrentVolume(8);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNegative() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderTen() {
        Radio service = new Radio();

        service.setCurrentVolume(2);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

}