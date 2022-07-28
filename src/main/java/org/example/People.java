package org.example;

class Person{
    // Classes can contain...
    //Data
    //Instance variable
    String name;
    int age;

    //Methods (Subroutines)
    void speak(String text){
        System.out.println(text);
    }

    void yearsLeftToRetirement(){
        int yearsLeft = 65 - age;
        System.out.println("Years till retirement: " + yearsLeft);
    }
    //Another way to calculate yearsLeft
    int calculateYearsLeftToRetirement(){
        return 65 - age;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

}

class Robot{
    public void speak(String word){
        System.out.println(word);
    }

    public void jump(int height){
        System.out.println("Jumping; " + height);
    }

    public void move(String direction, double distance){
        System.out.println("moving " + distance + " metere in direction " + direction);
    }
}

class Machine{
    private String name;
    private int code;
    public Machine() {
        System.out.println("Ist Constructor running!");
        name = "Arnie";
        System.out.println(name);
    }

    public Machine(String name){
        this.name = name;
        System.out.println("Second constructor running!");
        System.out.println(name);
    }
}

class Thing{
    private String name;
    static String description;

    public final static int LUCKY_NUMBER = 7;

    public Thing(String name) {
        this.name = name;
        System.out.println(name);
    }

    void showName(){
        System.out.println(name);
    }

    static void getInfo(){
        System.out.println("This is thing store");
    }
}

public class People {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bob Fanny";
        person1.age = 37;

        person1.speak("Im Bob");
        person1.yearsLeftToRetirement();

        //Another way to calculate yearsLeft
        int years = person1.calculateYearsLeftToRetirement();
        System.out.println("Years till retirement: " + years);

        int ageP1 = person1.getAge();
        System.out.println(ageP1);

        String nameP1 = person1.getName();
        System.out.println(nameP1);

        Person person2 = new Person();
        person2.name = "Sarah Hamir";
        person2.age = 22;

        person2.speak("Im Sarah");
        person2.yearsLeftToRetirement();

        //Another way to calculate yearsLeft
        int year = person2.calculateYearsLeftToRetirement();
        System.out.println("Years till retirement: " + year);

        int ageP2 = person2.getAge();
        System.out.println(ageP2);

        String nameP2 = person2.getName();
        System.out.println(nameP2);

        //////////////////////////////////////////

        Robot sam = new Robot();
        sam.speak("Hi, I am Sam");
        sam.jump(7);
        sam.move("South", 45.3);

        new Machine();
        new Machine("Bernie");

        /////////////////////////////////////////

        Thing toy = new Thing("Teddy Bear");
        Thing biscuit = new Thing("GoodDay biscuit"); // needs variable to access class instance variable

        Thing.description = "I am a thing"; // directly access by class.
        System.out.println(Thing.description);

        toy.showName();biscuit.showName();
        Thing.getInfo();

        System.out.println(Thing.LUCKY_NUMBER);

    }
}