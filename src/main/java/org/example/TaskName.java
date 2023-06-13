package org.example;

public enum TaskName {
    ALL_BAND("все группы"),
    CREATE_FILE("Создание файла"),
    READ_FILE_NAME_AND_AGE("Чтение фала имя и возраст"),
    LIST_CAR("Список машин"),
    FACTORY("Производство"),
    DAY_NINE("День девять"),
    TWO_FILES("Два файла"),
    ARITHMETIC_MEAN("Среднее арифметическое"),

    PERSON_SERVICE("Работа с БД");

    private String name;

    TaskName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
