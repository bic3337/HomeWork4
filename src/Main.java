public class Main {
    public static void main(String[] args) {
        System.out.println("Home work !");
        int clientOS = 1;
        int clientDevaysYear = 2013;
        if (clientOS == 0 && clientDevaysYear >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке.");
        } if (clientOS == 1 && clientDevaysYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке.");
        } if (clientOS == 0 && clientDevaysYear < 2015) {
            System.out.println("Установите облегченную версию для IOS по ссылке.");
        } else
            System.out.println("Установите облегченную версию для Android по ссылке.");




    }
}
