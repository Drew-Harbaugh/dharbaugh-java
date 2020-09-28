package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;




    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }


    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String getLetterGrade(){
        if(((1.0 * earnedMarks / possibleMarks) * 100) >= 90){
            return "A";
        } else if(((1.0 * earnedMarks / possibleMarks) * 100) >= 80){
            return "B";
        } else if(((1.0 * earnedMarks / possibleMarks) * 100) >= 70){
            return "C";
        } else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 60){
            return "D";
        } else {
            return "F";
        }
    }





}
