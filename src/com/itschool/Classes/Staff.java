package com.itschool.Classes;

import java.util.ArrayList;

public class Staff {
    ArrayList<Worker> staff;

    public Staff() {
        this.staff = new ArrayList<Worker>();
    }

    public ArrayList<Worker> Staff() {
        return staff;
    }

    public void Add(Worker worker) {
        Worker tempWorker = null;
        if (worker instanceof FullTimeWorker)
            tempWorker = new FullTimeWorker((FullTimeWorker) worker);
        else if (worker instanceof PartTimeWorker)
            tempWorker = new PartTimeWorker((PartTimeWorker) worker);

        for (Worker work : staff) {
            if (work.id == tempWorker.id) {
                int maxID = -1;
                for (Worker worker1 : staff) {
                    if (worker1.id > maxID)
                        maxID = worker1.id;
                }
                tempWorker.setId(maxID + 1);
            }
        }

        staff.add(tempWorker);
    }

    @Override
    public String toString() {
        String result = "Staff: ";

        for (Worker w : staff) {
            result += "\n" + w;
        }
        return result;
    }
}
