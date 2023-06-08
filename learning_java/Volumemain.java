/*create an abstract class named Volume and in it an empty method called measure
   create 3 subclasses Cylinder,Sphere,and Cube and find thier respective volumes by using 2 sets of parameters in measure method.
 */

import java.util.*;

abstract class Volume {
    abstract double measure(double... args );
}

class Cylinder extends Volume {
    double measure(double... args) {
        double radius = args[0];
        double height = args[1];
        double vol = 3.14*radius*radius*height;
        return vol;
    }
}

class Cube extends Volume {
    double measure(double... args){
        double side = args[0];
        double vol = side*side*side;
        return vol;
    }
}

class Sphere extends Volume {
    double measure(double... args) {
        double radius = args[0];
        double vol = (4/3)*3.14*radius*radius*radius;
        return vol;
    }
}

class Volumemain {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose the 3d shape you want to measure volume for: \n 1.Cylinder \n 2.Sphere \n 3.Cube");
    int choice = sc.nextInt();

        switch (choice) {
            case 1: Cylinder c = new Cylinder();
                    System.out.println("Enter the radius of cylinder");
                    double radius = sc.nextDouble();
                    System.out.println("Enter the height of cylinder");
                    double height = sc.nextDouble();
                    System.out.println("The volume of cylinder is : "+c.measure(radius, height));
                    break;
            case 2: Sphere s = new Sphere();
                    System.out.println("Enter the radius of Sphere");
                    double radius2 = sc.nextDouble();
                    System.out.println("The volume of sphere is : "+s.measure(radius2));
                    break;
            case 3: Cube cu = new Cube();
                    System.out.println("Enter the side of Cube");
                    double side = sc.nextDouble();
                    System.out.println("The volume of cylinder is : "+cu.measure(side));
                    break;       
            default:System.out.println("Enter a valid option");
                    break;
        }
    
    }
}