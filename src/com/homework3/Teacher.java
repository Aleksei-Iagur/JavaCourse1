package com.homework3;

import java.util.Scanner;

/**
 * Created by Lexo on 29.02.2016.
 */
public class Teacher extends Uchastnik {
    private static int InstanceCount = 0;
    int _workYears;
    Scanner _scanner;

    Teacher()
    {
        _scanner = new Scanner(System.in);
        InstanceCount++;
    }

    @Override
    public void SetData() {
        System.out.println("Введите имя");
        _name = _scanner.next();
        System.out.println("Введите возраст:");
        _age = _scanner.nextInt();
        System.out.println("Введите количество полных лет стажа:");
        _workYears = _scanner.nextInt();
    }

    @Override
    public String toString()
    {
        return String.format("Имя: %s; Возраст: %d; Количество полных лет стажа: %d; Всего преподавателей: %d", _name, _age, _workYears, InstanceCount);
    }
}
