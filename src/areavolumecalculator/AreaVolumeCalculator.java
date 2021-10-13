/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areavolumecalculator;

import static areavolumecalculator.AreaVolumeCalculator.area;
import java.util.Scanner;

public class AreaVolumeCalculator {

    static Scanner Maths = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here 
        
        String choice;
        
        System.out.println("Do you want to work out a rectangle or cylinder?");
        choice = Maths.next();
        
        if (choice.equals("rectangle")){
            
        area();

        volume();    
            
        }
        
        else{
            
           cylinder(); 
           
        }
        
        

    }

    public static void area() {

        double length;
        double width;
        double area;

        System.out.println("length");
        length = Maths.nextDouble();
        
        System.out.println("width");
        width = Maths.nextDouble();
        
        area = length * width;

        System.out.println("The Area of the shape is " + area);
    }

    public static void volume() {

        double width;
        double length;
        double height;
        double volume;

        System.out.println("Width");
        width = Maths.nextDouble();
        
        System.out.println("Length");
        length = Maths.nextDouble();
        
        System.out.println("Height");
        height = Maths.nextDouble();
        
        volume = width * length * height;

        System.out.println("The Volume of the shape is " + volume);
    }
    
    
    public static void cylinder() {
        
        double height;
        double radius;
        double volume;
        
        System.out.println("height");
        height = Maths.nextDouble();
        
        System.out.println("radius");
        radius = Maths.nextDouble();
        
        volume = radius * radius * 3.14 * height;
        System.out.println("The volume of the cylinder is " + volume );
    }
}
