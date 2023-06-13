package org.example.Task4;

import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
@Component
public class ListCar implements Task {
    @Override
    public void run() {
        List<String> stringList = new LinkedList<>();
        stringList.add("ЛАДА");
        stringList.add("ВОЛЬВО");
        stringList.add("ОПЕЛЬ");
        stringList.add("СУБАРУ");
        stringList.add("ХОНДА");
        System.out.println(stringList);
        stringList.add(3, "МЕРСЕДЕС");
        stringList.remove(0);
        System.out.println(stringList);
    }

    @Override
    public TaskName returnName() {
        return TaskName.LIST_CAR;
    }
}
