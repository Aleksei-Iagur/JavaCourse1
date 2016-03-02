package com.homework3;

import java.util.Scanner;

/**
 * Created by Lexo on 29.02.2016.
 */
public class Student extends Uchastnik {
    float _gpa;
    Scanner _scanner;

    Student()
    {
        _scanner = new Scanner(System.in);
    }

    @Override
    public void SetData() {
        System.out.println("Введите имя");
        _name = _scanner.next();
        System.out.println("Введите возраст:");
        _age = _scanner.nextInt();
        System.out.println("Введите средний балл:");
        _gpa = _scanner.nextFloat();
    }

    @Override
    public String toString()
    {
        return String.format("Имя: %s; Возраст: %d; Средний балл: %f", _name, _age, _gpa);
    }
}
