package org.example.Task9;

import org.example.Task;
import org.example.TaskName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PersonService implements Task {
    @Autowired
    private PersonConfig personConfig;

    @Override
    public void run() {
        System.out.println("Введите все (Показ всех пользователей) или добавить (добавление нового пользователя)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("все")){
            personConfig.allPerson();
        }
        if (str.equals("добавить")){
            personConfig.addPerson();
        }else System.out.println("Введенно некорректное слово");
    }

    @Override
    public TaskName returnName() {
        return TaskName.PERSON_SERVICE;
    }
}
