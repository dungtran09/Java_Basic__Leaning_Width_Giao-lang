package com.java.basicarray;

import java.util.ArrayList;
import java.util.List;

public class BasicArray {
    public static void main(String[] args) {
        // playWithPritiveArray();         
        // playWithStudent();
        Student[] listStudentV1 = new Student[5];
        listStudentV1[0] = new Student("SE2547","Thanh Ha Nguyen", 2004, 7.5);
        listStudentV1[1] = new Student("SE2548","Vu Cat Tuong", 2005, 8.9);
        listStudentV1[2] = new Student("SE2549","Phan Quoc Thai", 2004, 9.5);
        listStudentV1[3] = new Student("SE2550","Nguyen Viet Long", 2003, 8.5);
        listStudentV1[4] = new Student("SE2551","Tran Xuan Dung", 1996, 6.5);
        // playWithObjectArray(listStudentV1);
        sortObjectArray(listStudentV1);

        // List<Student> listStudentV2 = new ArrayList<>();
        // listStudentV2.add(new Student("SE2547","Thanh Ha Nguyen", 2004, 7.5));
        // listStudentV2.add(new Student("SE2548","Vu Cat Tuong", 2005, 8.9));
        // listStudentV2.add(new Student("SE2549","Phan Quoc Thai", 2004, 9.5));
        // listStudentV2.add(new Student("SE2550","Nguyen Viet Long", 2003, 8.5));
        // listStudentV2.add(new Student("SE2551","Tran Xuan Dung", 1996, 6.5));
        
    }

    public static void playWithPritiveArray() {
        double vol[] = {55.5, 54.6, 78.5, 115.5};
            
        System.out.println("NUMBER OF RAIN: ");
        for (int i = 0; i < vol.length; i++) {
            System.out.println(vol[i]);
        }
    }

    public static void playWithStudent() {
        Student s1 = new Student("SE0103", "Ha Thi", 2006, 8.8);
        s1.showProfile();
    }

    public static void playWithObjectArray(Student[] listStudentV1) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            try {
                for (; i < listStudentV1.length; i++) {
                    System.out.print("listStudentV1[" + i +  "] = ");
                    listStudentV1[i].showProfile();
                }
                flag = false;
            } catch (NullPointerException e) {
                System.out.println(listStudentV1[i]);
                i++;
            }
        }
    }

    public static void sortObjectArray(Student[] listStudentV1) {
       System.out.println("Before sorting: ");
        for (int i = 0; i < listStudentV1.length; i++) {
            listStudentV1[i].showProfile();
            // System.out.println(listStudentV1[i]);
        }
        System.out.println("-------------------------");
        System.out.println("After sorting: ");
        
    }

    public static void sortPrimitives(Student[] listStudentV1) {
        
    }
}
