package com.itschool;

import com.itschool.Classes.FullTimeWorker;
import com.itschool.Classes.PartTimeWorker;
import com.itschool.Classes.Staff;
import com.itschool.Classes.Worker;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        FullTimeWorker fullTimeWorker = new FullTimeWorker(1, 2000, "FullTime John");
        PartTimeWorker partTimeWorker = new PartTimeWorker(1, 10, "PartTime Paul", 120);
        System.out.println(fullTimeWorker);
        System.out.println(partTimeWorker);

        Staff staff = new Staff();
        staff.Add(fullTimeWorker);
        staff.Add(partTimeWorker);
        staff.Add(new PartTimeWorker(3, 60, "Bill Gates", 160));
        staff.Add(new PartTimeWorker(5, 30, "Amanda Gates", 100));

        System.out.println(staff);

        Collections.sort(staff.Staff(), new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o2.getId() - o1.getId();
            }
        });

        System.out.println(staff);

        Collections.sort(staff.Staff(), new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(staff);

        Collections.sort(staff.Staff(), Worker.ByNameASC());
        System.out.println(staff);

        Collections.sort(staff.Staff(), Worker.BySalaryASC);
        System.out.println(staff);

        System.out.println("\n\n");
        Collections.sort(staff.Staff(), Worker.BySalaryDESC);
        for (int i = staff.Staff().size() - 3; i < staff.Staff().size(); i++) {
            System.out.println(staff.Staff().get(i));
        }
    }
}