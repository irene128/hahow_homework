package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        System.out.println("Please enter object's length:");
        Scanner scanner=new Scanner(System.in);
        try {
            float len = scanner.nextFloat();
            System.out.println("Please enter object's width:");
            float wid = scanner.nextFloat();
            System.out.println("Please enter object's height:");
            int hei = scanner.nextInt();

            boolean foundFitBox = false;
            Box3 box3 = new Box3(23f, 14f, 13);
            if (box3.validate(len, wid, hei)) {
                System.out.println("Box3");
                foundFitBox = true;
            } else {
                Box5 box5 = new Box5(39.5f, 27.5f, 23);
                if (box5.validate(len, wid, hei)) {
                    System.out.println("Box5");
                    foundFitBox = true;
                }
            }
            if (!foundFitBox)
                System.out.println("No suitable box.");
        }catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
