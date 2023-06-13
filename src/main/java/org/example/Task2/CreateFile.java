package org.example.Task2;

import org.example.Exceptions.NotTenItemException;
import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Component
public class CreateFile implements Task {
    @Override
    public void run() {
        try {
            File file = new File("numbers");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersFromFile = line.split(" ");
            int[] arrayNumbers = new int[numbersFromFile.length];
            int counter = 0;
            int sum = 0;
            if (numbersFromFile.length == 10) {
                for (String number : numbersFromFile) {
                    arrayNumbers[counter++] = Integer.parseInt(number);
                }
                for (int i = 0; i < arrayNumbers.length; i++) {
                    sum += arrayNumbers[i];
                }
                System.out.println("Answer" + sum);
            } else {
                throw new NotTenItemException("ЭЭЭЭЭ НАЙХ, ТЫЫЫЫ дУУРРАК НАХ? ЦИФЕРР НЕ ДЭСЯТЬ ДУУРРАК НАХХХ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("ЭЭЭЭЭ НАЙХ, ТЫЫЫЫ дУУРРАК НАХ? ФАЙЛ ГИДЭЭЭЭ?");
        } catch (NotTenItemException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public TaskName returnName() {
        return TaskName.CREATE_FILE;
    }
}
