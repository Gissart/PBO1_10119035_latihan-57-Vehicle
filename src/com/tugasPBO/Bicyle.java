package com.tugasPBO;

public class Bicyle extends Vehicle{
    private int myGearCount;

    public Bicyle(){
        System.out.println("Bicycle");
    }

    public int getMyGearCount(){
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
