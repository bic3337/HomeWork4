public class Main {
    public static void main(String[] args) {
        int clientAndroid = 0;
        if (clientAndroid == 1) {
            System.out.println("Установите приложение для Android по ссылке .");
        } else {
            System.out.println("Установите приложение для IOS по ссылке ");
        }

        int clientOS = 1;
        int clientDevaysYear = 2007;
        if (clientOS == 0 && clientDevaysYear >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке.");
        }

        if (clientOS == 1 && clientDevaysYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке.");
        }

        if (clientOS == 0 && clientDevaysYear < 2015) {
            System.out.println("Установите облегченную версию для IOS по ссылке.");
        }

        if (clientOS == 1 && clientDevaysYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке.");
        }

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Год являеться высокосным .");
        } else {
            System.out.println(year + " Не являеться высокосным .");
        }


        int deliveryDisance = 95;
        int deliveryTaem = 1;
        if (deliveryDisance <= 20) {
            System.out.println("Потребуется : " + deliveryTaem + " сутки чтоб доставить Вам карту .");
        } else if (deliveryDisance >= 20 && deliveryDisance <= 60) {
            System.out.println("Потребуеться : " + (deliveryTaem + 1) + " суток чтобы доставить Вам карту .");
        } else if (deliveryDisance >= 60 && deliveryDisance <= 100) {
            System.out.println("Потребуеться : " + (deliveryTaem + 2) + " суток чтобы доставить Вам карту .");
        } else {
            System.out.println("Доставки нет.");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это месяц Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц Осень ");
                break;
            default:
                System.out.println("Такого месяца не сущестувует !!!");

        }
    }
}
