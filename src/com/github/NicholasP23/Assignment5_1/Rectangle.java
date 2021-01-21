package com.github.NicholasP23.Assignment5_1;

public class Rectangle {

    private static double height, width;

    Rectangle(){
        height = 6;
        width=4;
    }

    public double getWidth() {return width;}
    public double getHeight() {return height;}
    public double getArea() { return width * height;}
    public double getParameter(){return (2*(width)+2*(height));}
}
