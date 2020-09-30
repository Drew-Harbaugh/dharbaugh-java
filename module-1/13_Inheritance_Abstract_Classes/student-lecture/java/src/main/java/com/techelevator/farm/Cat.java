package com.techelevator.farm;

public final class Cat extends FarmAnimal {


    public Cat() {
        super("Cat", "Meow");
        asleep = true;
    }

    @Override
    public String eat() {
        return "Eating the mouse.";
    }


    //    @Override
//    public String getSound(){
//        return "purr purr meow purr purr";
//    }   cant do this!
}
