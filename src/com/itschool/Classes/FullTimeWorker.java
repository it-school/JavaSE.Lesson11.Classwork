package com.itschool.Classes;

public class FullTimeWorker extends Worker {
    public FullTimeWorker(int id, double pay, String name) {
        super(id, pay, name);
        setPay(pay);
    }

    public FullTimeWorker(FullTimeWorker worker) {
        this(worker.id, worker.pay, worker.name);
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay >= Constants.MIN_SALARY ? pay : Constants.MIN_SALARY;
    }

    @Override
    public double GetSalary() {
        return this.pay;
    }

    @Override
    public String toString() {
        return "FullTime " + super.toString();
    }
}
