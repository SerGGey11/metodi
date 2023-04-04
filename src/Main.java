import java.time.LocalDate;

public class Main {
    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void checkOS(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (currentYear > year) {
                System.out.println("Нужна облегчённая версия для  IOS");
            } else {
                System.out.println("Установитя обычную версию для IOS");
            }
        } else if (os == 1) {
            if (currentYear > year) {
                System.out.println("Нужна облегчённая версия для  Android");
            } else {
                System.out.println("Установитя обычную версию для Android");
            }
        } else {
            System.out.println("Система не поддерживается");
        }
    }

    public static void main(String[] args) {
        int year = 2021;
        if (isYearLeap(year)) {
            System.out.println("Год являетсяя високосным");
        } else {
            System.out.println("Год не является високосным");
        }


    }

}


