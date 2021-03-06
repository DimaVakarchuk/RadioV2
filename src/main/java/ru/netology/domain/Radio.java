package ru.netology.domain;

public class Radio {
    int minStation = 0;
    int maxStation = 9;
    private int currentStation;
    int minVolume = 0;
    int maxVolume = 10;
    private int currentVolume;

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        this.currentStation = currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void nextVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void prevVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void newCurrentStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        this.currentStation = newStation;
    }
}