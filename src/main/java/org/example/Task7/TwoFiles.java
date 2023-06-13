package org.example.Task7;

import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Component
public class TwoFiles implements Task {
    @Override
    public void run() {
        try {
            File file1 = new File("File1");
            PrintWriter pr1 = new PrintWriter(file1);
            File file2 = new File("File2");
            PrintWriter pr2 = new PrintWriter(file2);
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 1001);
                pr1.print(array[i] + " ");
            }
            pr1.close();
            Scanner scanner = new Scanner(file1);
            float[] arrayFile1 = new float[1000];
            for (int i = 0; i < arrayFile1.length; i++) {
                Integer line = scanner.nextInt();
                arrayFile1[i] = Float.parseFloat(String.valueOf(line));
            }
            float[] arrayFile2 = new float[50];
            int k = 0;
            for (int i = 0; i < arrayFile1.length; i += 20) {
                float sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += array[j];
                }
                arrayFile2[i / 20] = sum / 20;
            }
            for (int i = 0; i < arrayFile2.length; i++) {
                pr2.print(arrayFile2[i] + " ");
            }
            pr2.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List stringList = new ArrayList<>();
    }

    @Override
    public TaskName returnName() {
        return TaskName.TWO_FILES;
    }
}
