import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        checkLearYear(2022);
        applicationVerification(1, LocalDate.now().getYear());
        itWillTakeDays(21);
    }
    public static void checkLearYear(int year) {
        System.out.println("Домашнее задание 1");

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год высокосный!");
        } else {
            System.out.println(year + " " + "Год не высокосный!");
        }

    }

    public static void applicationVerification(int clientOs, int year) {
        System.out.println("Домашнее задание 2");
        int clientDeviceYear = 2015;
        if (year <= clientDeviceYear && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения Android");
        } else if (year > clientDeviceYear && clientOs == 1) {
            System.out.println("Установите  версию приложения Android");
        } else if (year <= clientDeviceYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения iOs");
        } else {
            System.out.println("Установите облегченную версию приложения iOs");
        }

    }

    public static void itWillTakeDays(int deliveryDistance) {
        System.out.println("Домашнее задание 3");
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryDay * 2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDay * 3);
        } else {
            System.out.println("Потребуется дней больше 3 ");
        }

    }
}


