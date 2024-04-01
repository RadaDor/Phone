package PHONE;

public class Phone {
    //содержит переменные number, model, weight
    //создайте 3 экземпляра класса
    //выведите на консоль значения их переменных
    //добавить в класс методы: receiveCall, имеет один параметр - имя звонящего. Выводит на консоль сообщение Звонит (name).
    //метод getNumber  возвращает номер телефона.
    //Вызвать эти методы

    long number;
    String model;
    double weight;
    String name;

    public String receiveCall () {
        return name;
    }

    public long getNumber () {
        return number;
    }
    }
