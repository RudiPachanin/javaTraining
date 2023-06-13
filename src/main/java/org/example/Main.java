package org.example;

import org.example.Task9.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private List<Task> taskList;

    @Autowired
    PersonConfig personConfig;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Override
    public void run(String... args) throws Exception {
        personConfig.allPerson();
        System.out.print("Перечень доступных задач: ");
        for (Task task : taskList) {
            TaskName str = task.returnName();
            System.out.print(str.getName() + ", ");
        }
        System.out.println("\n" + "Введите Stop, кода закончите");
        while (true) {
            System.out.println("");
            System.out.print("Введите название задачи: ");
            Scanner scanner = new Scanner(System.in);
            String taskName = scanner.nextLine();
            for (Task task : taskList) {
                if (task.returnName().getName().equals(taskName)) {
                    task.run();
                }
                if (taskName.equals("Stop")) {
                    return;
                }
            }
        }
    }
}