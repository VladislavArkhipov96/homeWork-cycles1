//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        //Task 1
        System.out.println("Task 1");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

        //Task 3
        System.out.println("Task 3");

        for (int i = 0; i <= 17 ; i+=2) {
            System.out.println(i);
        }

        //Task 4
        System.out.println("Task 4");

        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i);
        }

        //Task 5
        System.out.println("Task 5");

        for (int i = 1904; i <= 2096 ; i+=4) {
            System.out.println( + i + " год является високосным");
        }

        //Task 6
        System.out.println("Task 6");

        for (int i = 7; i <= 98 ; i+=7) {
            System.out.println(i);
        }

        //Task 7
        System.out.println("Task 7");

        for (int i = 1; i <=512 ; i*=2) {
            System.out.println(i);
        }

        //Task 8
        System.out.println("Task 8");

        int money = 0;
        for (int i = 1; i <= 12 ; i++) {
            money += 29_000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }

        //Task 9
        System.out.println("Task 9");

        money = 0;
        for (int i = 1; i <= 12 ; i++) {
            money += 29_000;
            money *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }

        //Task 10
        System.out.println("Task 10");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(" 2 * " + i + " = " + (2 * i));
        }





    }
}

