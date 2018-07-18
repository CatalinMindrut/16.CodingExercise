package com.Catalin;

public class AreaCalculator {
    public static void main(String[] args) {

        area(-1);
        area(-1.0, 4.0);

    }
    public static double area(double radius){
        if(radius < 0){
            System.out.println("Invalid radius value.");
            return -1.0;
        }
        double pi = 3.14159;
        double area = radius * radius * pi;
        System.out.println("The area of a circle that has a radius of " + radius + " is " + area);
        return area;
    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            System.out.println("One of the parameters is invalid");
            return -1;
        }
        double area = x*y;
        System.out.println("The area of a rectangular with the sides of " +x+" and "+ y + " is "+ area);
        return area;
    }
}
