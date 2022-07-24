
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class UserInterface {
    private Scanner scan;
    private ArrayList<Integer> points;
    
    public UserInterface(Scanner scanner) {
        this.scan = scanner;
        this.points = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
           int point = Integer.valueOf(this.scan.nextLine());
           if (point == -1) {
               System.out.println("Point average (all): " + this.average());
               if (!(this.averagePassing() == 0.0)) {
                   System.out.println("Point average (passing): " + this.averagePassing());
               } else {
                   System.out.println("Point average (passing): -");
               }
               System.out.println("Pass percentage: " + this.passPercentage());
               this.printGrades();
               break;
           }
           if (point > -1 && point < 101) {
               this.points.add(point);
           }
        }
    }
    
    public double average() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }
    
    public double averagePassing() {
        int sum = 0;
        int numOfPoints = 0;
        for (int point : this.points) {
            if (point > 49) {
                sum += point;
                numOfPoints++;
            }
        }
        return 1.0 * sum / numOfPoints;
    }
    
    public double passPercentage() {
        int numOfPassing = 0;
        for (int point : this.points) {
            if (point > 49) {
                numOfPassing++;
            }
        }
        return 100.0 * numOfPassing / this.points.size();
    }
    
    public void printGrades() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for (int point : this.points) {
            if (point >= 90) {
                System.out.print("*");
            }
        }
        System.out.print("\n4: ");
        for (int point : this.points) {
            if (point < 90 && point > 79) {
                System.out.print("*");
            }
        }
        System.out.print("\n3: ");
        for (int point : this.points) {
            if (point < 80 && point > 69) {
                System.out.print("*");
            }
        }
        System.out.print("\n2: ");
        for (int point : this.points) {
            if (point < 70 && point > 59) {
                System.out.print("*");
            }
        }
        System.out.print("\n1: ");
        for (int point : this.points) {
            if (point < 60 && point > 49) {
                System.out.print("*");
            }
        }
        System.out.print("\n0: ");
        for (int point : this.points) {
            if (point < 50) {
                System.out.print("*");
            }
        }
    }
}
