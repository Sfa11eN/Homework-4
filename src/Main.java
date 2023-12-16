

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Homework-4");
        {
            System.out.println(" Условный оператор ");

            System.out.println("Задание 1");

            int age1 = 17;
            int age2 = 24;
            if (age1 < 18) {
                System.out.println("Если ваш возраст " + age1 + " - Вы не достигли совершеннолетия, нужно немного подождать.");
            } else {
                System.out.println("Если ваш возраст " + age1 + " - Вы совершеннолетний.");
            }

            if (age2 < 18) {
                System.out.println("Если ваш возраст " + age2 + " - Вы не достигли совершеннолетия, нужно немного подождать.");
            } else if (age2 >= 18 && age2 >= 23) {
                System.out.println("Если ваш возраст " + age2 + " ,вы можете курить и  даже покупать алкоголь.");
            } else {
                System.out.println("Если ваш возраст " + age2 + " ,вы можете курить, но не можете покупать алкоголь");
            }


            System.out.println("Задание 2");

            int weather1 = 3;
            int weather2 = 13;
            if (weather1 < 5) {
                System.out.println("На улице " + weather1 + " градуса , нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло" + weather1 + " , можно идти без шапки.");
            }

            if (weather2 >= 5) {
                System.out.println("На улице " + weather2 + " градусов , можно идти без шапки");
            } else {
                System.out.println("Сегодня холодно , нужно надеть шапку");
            }

            System.out.println("Задание 3");

            int speed = 95;
            int speed2 = 50;

            if (speed > 60) {
                System.out.println("Если ваша скорость " + speed + " , вам придется заплатить штраф.");
            } else {
                System.out.println("Если ваша скорость " + speed + " , можно ехать спокойно.");
            }
            if (speed2 <= 60) {
                System.out.println("Если ваша скорость " + speed2 + " , можно ехать спокойно.");
            } else {
                System.out.println("Если ваша скорость " + speed + " , вам придется заплатить штраф.");
            }
            System.out.println("Задание 4");
            int mansAge = 33;
            if (mansAge > 2 && mansAge <= 6) {
                System.out.println("Если возраст человека равен " + mansAge + ", то ему нужно ходить в детский сад.");
            } else if (mansAge >= 7 && mansAge < 18) {
                System.out.println("Если возраст человека равен " + mansAge + ", то ему нужно ходить в школу.");
            } else if (mansAge >= 18 && mansAge < 24) {
                System.out.println("Если возраст человека равен " + mansAge + ", то его место в университете.");
            }else if (mansAge>=24){
                System.out.println("Если возраст человека равен " + mansAge + ", то ему пора ходить на работу.");
            }else {
                System.out.println("Некорректно введены данные");
            }



        }
    }
}