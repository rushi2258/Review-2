package com.bridgelabz.review2;

public class Shape
{
    public void display()
    {
        System.out.println("Inside Display");
    }
}
class Rectangle extends Shape
{
 public void area()
 {
     System.out.println("Inside Area");
 }
}
class Cylinder extends Rectangle
{
    public void perimeter()
    {
        System.out.println("Inside Perimeter");
    }
}
class Cube extends Cylinder
{
    public void volume()
    {
        System.out.println("Inside Volume");
    }
}
    class Tester {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.perimeter();
        cube.volume();
    }
}

