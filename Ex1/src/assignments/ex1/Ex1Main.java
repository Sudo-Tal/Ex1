package assignments.ex1;
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        int base = 0;

        while (!num1.equals(quit) && !num2.equals(quit)) {

            while (true) {
                System.out.println();
            System.out.println("Ex1 class solution:");

                System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
                num1 = sc.next();
                if (num1.equals("quit")) {
                    System.out.println("Quitting now...");
                    return;
                }

                if (Ex1.isNumber(num1)) {
                    System.out.println("num1= "+ num1 + "is number: true , value: "+ Ex1.number2Int(num1));
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                    num2 = sc.next();
                    if (num2.equals("quit")) {
                        System.out.println("Quitting now...");
                        return;
                    }

                    if (Ex1.isNumber(num2)) {
                        System.out.println("num1= "+ num1 + "is number: true , value: "+ Ex1.number2Int(num1));
                        System.out.println("Enter a base for output: (a number [2,16])");
                        base = Integer.parseInt(sc.next());
                        if (base < 2 || base > 16) {
                            System.out.println("ERR: wrong base, should be [2,16], got (" + base + ")");
                            break;
                        }
                        //Main code area Mark
                        int sumInt = 0;
                        int productInt=0;
                        String sumString = "";
                        String productString = "";

                        sumInt = Ex1.number2Int(num1) + Ex1.number2Int(num2);
                        productInt = Ex1.number2Int(num1) * Ex1.number2Int(num2);

                        sumString = Ex1.int2Number(sumInt, base);
                        productString= Ex1.int2Number(productInt, base);

                        System.out.println(num1 +" + "+ num2 +" = "+ sumString );
                        System.out.println(num1 +" * "+ num2 +" = "+ productString);















                    } else {
                        System.out.println("num2= "+ num2 + "is number: false , value: "+ Ex1.number2Int(num1));
                        System.out.println("ERR: num2 is in the wrong format! " + num2 + "\n");
                    }

                } else {
                    System.out.println("num1= "+ num1 + " is number: false , value: "+ Ex1.number2Int(num1));
                    System.out.println("ERR: num1 is in the wrong format! " + num1 + "\n");
                }


            }


        }

        System.out.println("quitting now...");
    }
}
