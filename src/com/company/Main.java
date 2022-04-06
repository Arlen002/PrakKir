package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int shet = 1;
        int counter = 1;
        int count = 3;
        for (int i = 1; i < 3; i++) {
            System.out.println("----    String game   ----");
            System.out.println("--------------" + counter++ + "------------");
            System.out.print("Predict amount of points(2..12): ");
            int user = scanner.nextInt();
            if (user <= 12 && user > 1) {
                int a = random.nextInt(1, 6);
                int b = random.nextInt(1, 6);
                rollTheDice(a);
                rollTheDice(b);
                int num = a + b;
                //System.out.println("On the dice fell " + num + " points.");
                int result = num - Math.abs(num - user) * 2;

                System.out.print("Predict amount of points(2..12): ");
                int computer = random.nextInt(2, 12);
                System.out.println(computer);
                int x = random.nextInt(1, 6);
                int y = random.nextInt(1, 6);
                rollTheDice(x);
                rollTheDice(y);
                int num2 = x + y;
                System.out.println("User: " + result + " points.");
                //  System.out.println("On the dice fell " + num2 + " points.");
                int result2 = num2 - Math.abs(num2 - computer) * 2;
                System.out.println("Computer: " + result2 + " points.");
                count--;
                System.out.println(count);

                if (count == 0) {
                    System.out.println("           ------ Finish game ------");
                    System.out.println("      Round  |      User       |    Computer");
                    System.out.println("  -----------+-----------------+---------------");
                    System.out.println("             | Predicted: " + user + "    | Predicted : " + computer);
                    System.out.println("   - " + shet++ + " -     | Dice:      " + a + "    | Dice:       " + x);
                    System.out.println("             | Result:    " + result + "   | Result:     " + result2);
                }
                if (result > result2) {
                    System.out.println(" User wins!");
                } else if (result == result2) {
                    System.out.println(" player draw! ");
                } else {
                    System.out.println("The player lost ");
                }

            }
        }
    }
        public static int rollTheDice ( int ran){
            switch (ran) {
                case 1:
                    System.out.println("+------+\n" + "|      |\n" + "|   #  |\n" + "|      |\n" + "+------+");
                    break;
                case 2:
                    System.out.println("\n+------+" + "\n| #    |" + "\n|      |" + "\n|    # |" + "\n+------+");
                    break;
                case 3:
                    System.out.println("\n+------+" + "\n| #    |" + "\n|  #   |" + "\n|   #  |" + "\n+------+");
                    break;
                case 4:
                    System.out.println("\n+------+" + "\n| #  # |" + "\n|      |" + "\n| #  # |" + "\n+------+");
                    break;
                case 5:
                    System.out.println("\n+------+" + "\n| #  # |" + "\n|   #  |" + "\n| #  # |" + "\n+------+");
                    break;
                case 6:
                    System.out.println("\n+------+" + "\n| #  # |" + "\n| #  # |" + "\n| #  # |" + "\n+------+");
            }
            return ran;
        }

}