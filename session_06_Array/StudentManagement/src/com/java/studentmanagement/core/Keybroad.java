package com.java.studentmanagement.core;

import java.util.Scanner;

public class Keybroad {
    private Scanner in;

    public Keybroad () {
        this.in = new Scanner(System.in);
    }

    public int readInteger(String promptMsg, String errorrMsg) {
        int num = 0;
        boolean valid = false;
        String strInput;
        System.out.print(promptMsg);
        
        while (valid == false) {
            strInput = in.nextLine().trim();
            try {
                num = Integer.parseInt(strInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(errorrMsg);
                System.out.print(promptMsg);
            }
        }
        return num;
    }

    public double readDouble(String promptMsg, String errorrMsg) {
        double num = 0;
        boolean valid = false;
        String strInput;

        System.out.print(promptMsg);
        while (valid == false) {
            strInput = in.nextLine().trim();

            try {
                num = Double.parseDouble(strInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(errorrMsg);
                System.out.print(promptMsg);
            }
        }
        return num;
    }

    public int readInteger(String promptMsg, String errorrMsg, int low, int high) {
        int num = 0;
        String strInput;
        boolean valid = false;

        System.out.print(promptMsg);

        while (valid == false) {
            strInput = in.nextLine().trim();
            try {
                num = Integer.parseInt(strInput);
                if (num >= low && num <= high) {
                    valid = true;
                } else {
                    System.out.println(errorrMsg);
                    System.out.print(promptMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorrMsg);
                System.out.print(promptMsg);
            }
        }
        return num;
    }


    public Double readDouble(String promptMsg, String errorrMsg, int low, int high) {
        double num = 0;
        String strInput;
        boolean valid = false;

        System.out.print(promptMsg);

        while (valid == false) {
            strInput = in.nextLine().trim();
            try {
                num = Double.parseDouble(strInput);
                if (num >= low && num <= high) {
                    valid = true;
                } else {
                    System.out.println(errorrMsg);
                    System.out.print(promptMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorrMsg);
                System.out.print(promptMsg);
            }
        }
        return num;
    }
}
