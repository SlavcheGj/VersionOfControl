package com.company;

public class HomeWork {
    public int numExercises;
    public String exercise;

    public HomeWork(int num,String exer){
        this.numExercises= num;
        this.exercise=exer;
    }
    public void print(){
        System.out.println("Info"+numExercises+" "+ exercise);
    }
}
