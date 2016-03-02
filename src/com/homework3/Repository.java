package com.homework3;

import java.util.*;

/**
 * Created by Lexo on 29.02.2016.
 */
public class Repository {
    HashMap<String, Uchastnik> _peopleHash;
    ArrayList<Uchastnik> _peopleArray;
    Scanner _scanner;

    Repository()
    {
        _peopleHash = new HashMap<>();
        _peopleArray = new ArrayList<>();
        _scanner = new Scanner(System.in);
    }

    void AddUchastnik(Uchastnik uchastnik)
    {
        uchastnik.SetData();
        _peopleHash.put(uchastnik._name, uchastnik);
        _peopleArray.add(uchastnik);
    }

    void Start()
    {
        int inputNumber;

        do
        {
            System.out.println("Введите команду (1 - добавление студента, 2 - добавление преподавателя, 3 - вывод HashMap, 4 - вывод ArrayList, 0 - выход):");
            inputNumber = _scanner.nextInt();

            switch (inputNumber)
            {
                case 0:
                    System.out.println("Работа программы завершена.");
                    return;
                case 1:
                    Student student = new Student();
                    AddUchastnik(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    AddUchastnik(teacher);
                    break;
                case 3:
                    ShowHashMap();
                    break;
                case 4:
                    ShowArrayList();
                    break;
            }
        }
        while (true);
    }

    private void ShowArrayList() {
        ArrayList<Uchastnik> tempCollection = new ArrayList<>(_peopleArray);
        Collections.sort(tempCollection);
        Iterator<Uchastnik> iterator = tempCollection.iterator();
        while (iterator.hasNext())
        {
            Uchastnik uchastnik = iterator.next();
            System.out.println(String.format("[%d] %s", _peopleArray.indexOf(uchastnik), uchastnik ));
        }
    }

    private void ShowHashMap() {
        for (String name: _peopleHash.keySet())
        {
            System.out.println(_peopleHash.get(name));
        }
    }
}