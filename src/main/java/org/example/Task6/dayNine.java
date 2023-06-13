package org.example.Task6;

import org.example.Task;
import org.example.Task6.InDayNine.Human;
import org.example.Task6.InDayNine.Student;
import org.example.Task6.InDayNine.Teacher;
import org.example.TaskName;
import org.springframework.stereotype.Component;

@Component
public class dayNine implements Task {
    @Override
    public void run() {
        Human human = new Human();
        Student student = new Student("группа", "Лёха");
        Teacher teacher = new Teacher("Математика", "Вася");
        System.out.println("группа " + student.getGroup() + "\n Предмет " + teacher.getLesson());
        student.printInfo();
        teacher.printInfo();
        human.printInfo();
    }

    @Override
    public TaskName returnName() {
        return TaskName.DAY_NINE;
    }
}
