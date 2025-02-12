package com.techelevator;

public class Elevator {

private int currentFloor = 1;
private int numberOfFloors;
private  boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public boolean isDoorOpen(){
        return doorOpen;
    }

    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;

    }
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if(doorOpen != true && desiredFloor <= numberOfFloors && desiredFloor > currentFloor){
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor){
        if(doorOpen != true && desiredFloor >= 1 && desiredFloor < currentFloor){
            currentFloor = desiredFloor;
        }
    }
}
