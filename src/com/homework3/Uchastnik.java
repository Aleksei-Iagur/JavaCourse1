package com.homework3;

/**
 * Created by Lexo on 29.02.2016.
 */
public abstract class Uchastnik implements Comparable {
    String _name;
    int _age;

    public abstract void SetData();

    @Override
    public int hashCode() {
        return _name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Uchastnik)
            return ((Uchastnik) obj)._name.equals(_name);
        else
            return false;
    }

    public int compareTo(Object o)
    {
        Uchastnik uchastnik = (Uchastnik)o;
        if (uchastnik._age < this._age)
            return 1;

        if (uchastnik._age == this._age)
            return 0;

        return -1;
    }
}
