package com.company;

public class HomeWork {
    public int numExercises;
    public String exercise;
    public String subject;

    public HomeWork(int num,String exer, String subject){
        this.subject = subject;
        this.numExercises = num;
        this.exercise = exer;
    }
    public void print(){
        System.out.println("You did "+this.numExercises+" form " + this.subject );
    }
}
