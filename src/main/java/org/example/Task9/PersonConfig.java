package org.example.Task9;

import org.example.Task;
import org.example.TaskName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.print.DocFlavor;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Component
@Configuration
@PropertySource("classpath:value.properties")
public class PersonConfig {
    @Value("${URL}")
    private String URL;
    @Value("${USER}")
    private String userName;
    @Value("${PASSWORD}")
    private String password;
    private static Connection connection;

    @PostConstruct
    public void init() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, userName, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> allPerson() {
        List<Person> people = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM person_t";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Person person = new Person();
                person.setName(resultSet.getString("Name"));
                person.setAge(resultSet.getString("Age"));
                person.seteMale(resultSet.getString("E-male"));
                people.add(person);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return people;
    }

    public void addPerson() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.print("Введите електронную почту: ");
        String male = scanner.nextLine();
        person.seteMale(male);
        System.out.print("Введите колличество лет: ");
        String age = scanner.nextLine();
        person.setAge(age);

        try {
            Statement statement = connection.createStatement();
            String SQL = String.format("INSERT INTO person_t (\"Name\",\"Age\",\"E-male\") VALUES ('%s','%s','%s')",
                    person.getName(), person.getAge(), person.geteMale());
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
