public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_3.");
        System.out.println();

        System.out.println("Задача 1.");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать!)");
        }
        System.out.println();
        System.out.println("Задача 2.");
        short airTemp = 14;
        if (airTemp < 5) {
            System.out.println("На улице " + airTemp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemp + " градусов, можно идти без шапки.");
        }
        System.out.println();
        System.out.println("Задача 3.");
        short speed = 110;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задача 4.");
        int agePerson = 18;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println("Задача 5.");

        int ageChild = 9;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе, в сопровождении взрослого.");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе, без сопровождении взрослого.");
        }
        System.out.println();
        System.out.println("Задача 6.");

        int placeSeatFree = 9;
        int carriageSeat = 102;
        if (placeSeatFree < 102) {
            System.out.println("В вагоне осталось " + (carriageSeat - placeSeatFree) + " свободных мест.");
        } else {
            System.out.println("В вагоне свободных мест не осталось.");
        }
        System.out.println();
        System.out.println("Задача 7.");

        int one = 3;
        int two = 12;
        int three = 1;
        int max;

        if (one >= two) {
            if (one >= three) {
                max = one;
            } else {
                max = three;
            }
        } else {
            if (two >= three) {
                max = two;
            } else {
                max = three;
            }
        }
        System.out.println("Наибольшее число: (" + max + ").");
    }
}







