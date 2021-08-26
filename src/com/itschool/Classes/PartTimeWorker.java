package com.itschool.Classes;

public class PartTimeWorker extends Worker {
    int hoursWorked;

    public PartTimeWorker(int id, double pay, String name) {
        super(id, pay, name);
        setPay(pay);
    }

    public PartTimeWorker(PartTimeWorker worker) {
        this(worker.id, worker.pay, worker.name, worker.hoursWorked);
    }

    public PartTimeWorker(int id, double pay, String name, int hoursWorked) {
        super(id, pay, name);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked >= 0 ? hoursWorked : 0;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay > Constants.MIN_SALARY / (Constants.MONTH_WORK_DAYS * Constants.HOURS_PER_DAY) ? pay : Constants.MIN_SALARY / (Constants.MONTH_WORK_DAYS * Constants.HOURS_PER_DAY);
    }

    @Override
    public double GetSalary() {
        return hoursWorked * getPay();
    }

    @Override
    public String toString() {
        return "PartTime " + "Worker{" + "id=" + id + ", pay=" + String.format("%10.2f", GetSalary()) +
                ", name='" + name + '\'' + '}';
    }
}
