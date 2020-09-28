package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;


    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
        this.planeNumber = planeNumber;

    }

    public String getPlaneNumber(){
        return planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }
    public int getAvailableFirstClassSeats(){
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getTotalCoachSeats(){
        return totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }
    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        if(forFirstClass == true && totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats){
           bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
           return true;
        } else if (forFirstClass == true && totalFirstClassSeats - bookedFirstClassSeats < totalNumberOfSeats){
            return false;
        } else if (forFirstClass == false && totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats){
            bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
            return true;
        } else {
            return false;
        }
    }

}
