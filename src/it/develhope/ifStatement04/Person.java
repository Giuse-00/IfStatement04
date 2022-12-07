package it.develhope.ifStatement04;

public class Person {

    private int age;
    private int min = 5;
    private int max = 80;

    public Person(){

        int x = (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("The random number generated is: " + x);
        age = x;
        System.out.println("The age is: " + age);
    }

    public String getLifeStage(){
        return age<=12 ? "child" : age >=13 && age <= 19 ? "teen" :
                age >= 20 && age <= 59 ? "adult" : "senior adult";
    }
}

