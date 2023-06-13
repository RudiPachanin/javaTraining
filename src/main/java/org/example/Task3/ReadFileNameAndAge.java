package org.example.Task3;

import org.example.Exceptions.IncorrectFile;
import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ReadFileNameAndAge implements Task {
    @Override
    public void run() {
        try {
            File file = new File("C:\\javaAgain\\brightFuture\\src\\test");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringsFromFile = line.split(", ");
            List<String> nameAndAgeList = new ArrayList<>();
            for (String string : stringsFromFile) {
                nameAndAgeList.add(string);
            }
            int number;
            for (String string : nameAndAgeList) {
                String[] s = string.split(" ");
                number = Integer.parseInt(s[1]);
                if (number < 0) {
                    throw new IncorrectFile("Не корректный файл");
                }
            }
            System.out.println(nameAndAgeList);
        } catch (FileNotFoundException e) {
            System.out.println("ЭЭЭЭЭ НАЙХ, ТЫЫЫЫ дУУРРАК НАХ? ФАЙЛ ГИДЭЭЭЭ?");
        } catch (IncorrectFile e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override
    public TaskName returnName() {
        return TaskName.READ_FILE_NAME_AND_AGE;
    }
}
