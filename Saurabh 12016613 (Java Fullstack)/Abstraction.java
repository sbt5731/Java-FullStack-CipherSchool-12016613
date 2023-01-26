package com.saurabhjava;
interface MusicSystem{
    void play();  //uncommon
    void pause();
}
abstract class Automobile{
    abstract void wheel();  //common
}
class Car extends Automobile implements MusicSystem{

    public void wheel() {System.out.println("i have 4 wheels");}

    @Override
    public void play() {
// TODO Auto-generated method stub
    }
    @Override
    public void pause() {
// TODO Auto-generated method stub
    }
}
class Truck extends Automobile implements MusicSystem{
    public void wheel() {System.out.println("i have 6 wheels");}
    @Override
    public void play() {
// TODO Auto-generated method stub
    }
    @Override
    public void pause() {
// TODO Auto-generated method stub
    }
}
class Bike extends Automobile{
    public void wheel() {System.out.println("I have 2 wheels");}
}
public class Abstraction {
}
