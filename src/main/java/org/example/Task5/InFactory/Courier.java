package org.example.Task5.InFactory;

public class Courier implements Worker{
    int salary;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.balance += 1000;
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.balance % 1_000_000 == 0) {
            this.salary *= 2;
        }
    }
}
