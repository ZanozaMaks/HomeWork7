public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + " Сумма накоплений равна " + total + " рублей");
            //     System.out.println("Месяц " + month);
            //     System.out.println("Сумма накоплений: " + total + " рублей");
            // Пишем код для задачи 1
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
            System.out.println();

            // Пишем код для задачи 2

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int people = 1000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            y = y + y / people * (fertility - mortality);
            System.out.println("Год " + year + " численность населения составляет: " + fertility);
            // Пишем код для задачи 3

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int depositAmount = 15_000;
        int total = 0;
        int month = 0;
        int percent = depositAmount + (depositAmount * 7) / 100;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + percent + depositAmount;
            System.out.println("Месяц № " + month + " Сумма накоплений = " + total);
            // Пишем код для задачи 4

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int depositAmount = 15_000;
        int total = 0;
        int month = 0;
        int percent = depositAmount + (depositAmount * 7) / 100;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + percent + depositAmount;
            if (total % 6 == 0 && month % 6 == 0) {
                System.out.println("Месяц № " + month + " Сумма накоплений = " + total);
                // Пишем код для задачи 5

            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int amountOfSavings = 15000;
        int month = 0;
        int total = 0;
        int percent = amountOfSavings + (amountOfSavings * 7) / 100;
        while (month < 108) {
            month = month + 1;
            total = total + percent + amountOfSavings;
            if (amountOfSavings % 6 == 0 && month % 6 == 0) {
                System.out.println("Месяц № " + month + " Сумма накоплений = " + total);
                // Пишем код для задачи 6
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int date = 5;
        int month = 31;
        for (; date < month; date = date + 7) {
            System.out.println("Сегодня пятница " + date + "е число");
            // Пишем код для задачи 7

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int comet = 79;
        int yearBefore = 1896;
        int yearAfter = 2055;
        for (; yearBefore < yearAfter; yearBefore = yearBefore + comet) {
        System.out.println("Год наблюдения кометы: " +yearBefore);
            // Пишем код для задачи 8

        }
    }
}



