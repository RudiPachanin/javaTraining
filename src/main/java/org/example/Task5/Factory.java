package org.example.Task5;

import org.example.Task;
import org.example.Task5.InFactory.Courier;
import org.example.Task5.InFactory.Picker;
import org.example.Task5.InFactory.Warehouse;
import org.example.TaskName;
import org.springframework.stereotype.Component;

@Component
public class Factory implements Task {
    @Override
    public void run() {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i <= 1501; i++) {
            picker.doWork();
        }
        for (int i = 0; i <= 10001; i++) {
            courier.doWork();
        }
        System.out.println(warehouse.toString());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
    }

    @Override
    public TaskName returnName() {
        return TaskName.FACTORY;
    }
}
