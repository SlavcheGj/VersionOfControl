package com.company;

public class HomeWork {
    public int numExercises;
    private String exercise;
    public String subject;

    public HomeWork(int num,String exer, String subject){
        this.subject = subject;
        this.numExercises = num;
        this.exercise = exer;
    }

    public String getExercise() {
        return exercise;
    }

    public void print(){
        System.out.println("You did "+this.numExercises+" form " + this.subject );
    }
}
