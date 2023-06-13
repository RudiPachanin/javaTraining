package org.example.Task8;

import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

@Component
public class ArithmeticMean implements Task {
    @Override
    public void run() {
        try {
            File file = new File("test");

            PrintWriter pr = new PrintWriter(file);
            boolean end = true;
            String str = "";
            while (end) {
                System.out.println("Ведите целое число или вещественное (разделительный знак \".\")." +
                        " Напишите слово Стоп, " +
                        "если вы закончили вписывать числа");
                Scanner scanner = new Scanner(System.in);
                String number = scanner.nextLine();
                if (number.equalsIgnoreCase("Стоп")) {
                    end = false;
                } else {
                    pr.print(number + ";");
                }
            }
            pr.close();

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringsFromFile = line.split(";");
            float[] arrayNumbers = new float[stringsFromFile.length];
            int sum = 0;
            int counter = 0;
            for (String strr : stringsFromFile) {
                arrayNumbers[counter++] = Float.parseFloat(strr);
            }
            int counterDivider = 0;
            for (float number : arrayNumbers) {
                sum += number;
                counterDivider++;
            }
            float answer = sum / counterDivider;
            System.out.println(answer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TaskName returnName() {
        return TaskName.ARITHMETIC_MEAN;
    }
}
