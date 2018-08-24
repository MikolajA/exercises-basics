package com.isa;

public class Main {

    public static void main(String[] args) {

        Prostokat kw = new Prostokat(5.2, 3.3);
        kw.print(kw);
        Trojkat tr = new Trojkat(5.2, 5.0, 6.3, 4.1);
        kw.print(tr);
        Kolo ko = new Kolo(2.2);
        ko.print(ko);
    }
}
