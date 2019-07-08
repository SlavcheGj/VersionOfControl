package com.company;

public class HomeWork {
    public int numExercises;
    private String exercise;
    private String subject;

    public HomeWork(int num,String exer, String subject){
        this.subject = subject;
        this.numExercises = num;
        this.exercise = exer;
    }
    public String getSubject(){
        return subject;
    }
    public String getExercise() {
        return exercise;
    }
    public void printExercise(){
        System.out.println("the name of your exercise is "+getExercise());
    }
    public void print(){
        System.out.println("You did "+this.numExercises+" form " + getSubject() );
    }
}
