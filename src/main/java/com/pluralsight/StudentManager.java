package com.pluralsight;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Students student1 = new Students("Bryan",213,2.7,true);
        Students student2 = new Students("Luis", 123, 3.5, true);
        Students student3 = new Students("Jessenia",456,3.2,false);

        System.out.println("----------Welcome to student profile manager---------- ");
        System.out.println("(1) Look up Profile");
        System.out.println("(2) Add Course");
        System.out.println("(3) Update Gpa");
        System.out.println("(4) Update Enrollment");
        System.out.println("(0) Exit");
        System.out.print("\nPick From Options Using Numerical Values: ");
        int options = userInput.nextInt();
        userInput.nextLine();
        //System.out.println(student1.profile());
s

    }

}
