package PHONE;

import PHONE.Phone;

public class Phone1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = 89776667766L;
        phone1.model = "poco";
        phone1.weight = 0.6;
        phone1.name = "Anna";
        String res = phone1.receiveCall ();
        Long res1 = phone1.getNumber();

        Phone phone2 = new Phone();
        phone2.number = 89168888886L;
        phone2.model = "iphone";
        phone2.weight = 0.9;
        phone2.name = "Oleg";
        String res3 = phone2.receiveCall ();
        Long res4 = phone2.getNumber();

        Phone phone3 = new Phone();
        phone3.number = 89125559886L;
        phone3.model = "samsung";
        phone3.weight = 1;
        phone3.name = "Maria";
        String res5 = phone3.receiveCall ();
        Long res6 = phone3.getNumber();


        System.out.println ("Номер телефона: " + phone1.number);
        System.out.println("Название модели: " + phone1.model);
        System.out.println("Вес телефона: " + phone1.weight);
        System.out.println("Звонит " + res);
        System.out.println("Входящий номер  " + res1);
        System.out.println();
        System.out.println ("Номер телефона: " + phone2.number);
        System.out.println("Название модели: " + phone2.model);
        System.out.println("Вес телефона: " + phone2.weight);
        System.out.println("Звонит " + res3);
        System.out.println("Входящий номер  " + res4);
        System.out.println();
        System.out.println ("Номер телефона: " + phone3.number);
        System.out.println("Название модели: " + phone3.model);
        System.out.println("Вес телефона: " + phone3.weight);
        System.out.println("Звонит " + res5);
        System.out.println("Входящий номер  " + res6);
    }
}
