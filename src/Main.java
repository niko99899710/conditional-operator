public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека = " + age + " ,то возраст совершеннолетия наступил");
        } else {
            System.out.println("Если возраст человека = " + age + " ,то возраст совершеннолетия еще не наступил и нужно немного подождать");
        }

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки».");
        }

        int speed = 200;
        if (speed > 60) {
            System.out.println("Если скорость = " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость = " + speed + ", то можно ездить спокойно");
        }

        int ages = 15;
        if (ages >= 2 && ages < 6) {
            System.out.println(" Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
        } else if (ages >= 7 && ages < 18) {
            System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу");
        } else if (ages >= 18 && ages < 24) {
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете.");
        } else if (ages > 24) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + ages + "то ему нужно ходить");
        }

        int old = 19;
        if (old < 5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
        } else if (old > 5 && old < 14) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (old > 14) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + old + "то ему");
        }

        int humans = 102;
        int sitHumans = 60;
        int standHumans = 42;
        if (humans > 102) {
            System.out.println("Мест в вагооне нет!");
        } else if (sitHumans > 60) {
            System.out.println("Нет сидячих мест");
        } else if (standHumans > 42) {
            System.out.println("Нет стоячих мест");
        } else {
            System.out.println("В вагоне есть сидячие места " + sitHumans + " в вагоне есть стоячие места " + standHumans + " в вагоне есть места " + humans);
        }

        int one = 1;
        int two = 2;
        int three = 3;
        boolean threeBiggerThanOne = three < one;
        boolean threeBiggerThanTwo = three < two;
        if (threeBiggerThanOne) {
            System.out.println("Тройка не является большим числом");
        }  else if (threeBiggerThanTwo) {
            System.out.println(" 3 большe 2");
        } else  {
            System.out.println("3 является большим числом");
        }
    }
}