package org.example.Task5.InFactory;

public class Picker implements Worker{
    int salary;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        salary += 80;
        warehouse.countOrder++;
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.countOrder % 1500 == 0) {
            this.salary *= 3;
        }
    }
}
