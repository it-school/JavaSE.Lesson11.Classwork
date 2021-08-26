package com.itschool.Classes;

import com.itschool.Interfaces.IWorker;

import java.util.Comparator;

public class Worker implements IWorker {
    int id;
    double pay;
    String name;
    public Worker(int id, double pay, String name) {
        setId(id);
        setName(name);
        setPay(pay);
    }

    public Worker(Worker worker) {
        setId(worker.id);
        setName(worker.name);
        setPay(worker.pay);
    }

    public static Comparator<Worker> BySalaryASC = (o1, o2) -> (o1.GetSalary() < o2.GetSalary() ? -1 : (o1.GetSalary() > o2.GetSalary() ? 1 : 0));
    public static Comparator<Worker> BySalaryDESC = (o1, o2) -> (o1.GetSalary() > o2.GetSalary() ? -1 : (o1.GetSalary() < o2.GetSalary() ? 1 : 0));

    public static Comparator<Worker> ByNameASC() {
        return (o1, o2) -> o1.getName().compareTo(o2.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id > 0 ? id : -1;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double GetSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", pay=" + String.format("%10.2f", GetSalary()) + ", name='" + name + '\'' + "}";
    }
}
