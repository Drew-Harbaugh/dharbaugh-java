package com.techelevator;

public class Television {

    private boolean on;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn(){
        return on;
    }
    public int getCurrentChannel(){
        return currentChannel;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }

    public void turnOn(){
        on = true;
        currentChannel = 3;
        currentVolume = 2;
    }
    public void  turnOff(){
        on = false;
    }

    public void changeChannel(int newChannel){
        if (on && newChannel > 3 && newChannel < 18){
            currentChannel = newChannel;
        }
    }
    public void channelUp(){
        if (on){
            if(currentChannel < 18){
                currentChannel= currentChannel + 1;
            } else {
                currentChannel = 3;
            }
        }
    }
    public void channelDown(){
        if(on){
            if (currentChannel > 3){
                currentChannel = currentChannel - 1;
            } else {
                currentChannel = 18;
            }
        }
    }
    public void raiseVolume(){
        if(on && currentVolume < 10){
            currentVolume++;
            }
        }
        public void lowerVolume(){
        if(on && currentVolume > 0){
            currentVolume--;
            }
        }
    }


