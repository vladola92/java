public class Main {

    public static void main(String[] args) {
        // 1.Write a Java program to print 'Hello' on screen and then print your
        //name on a separate line;

        System.out.println("Hello");


        // 2.Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
        //sum of the two numbers;

        int x = 7;
        int y = 8;

        int scadere = x - y;

        System.out.println("The addition of  and 8 is = " + scadere );

        double impartire = x/y ;
        System.out.println(impartire);  // aici inca nu inteleg de ce am rezultatul 0.0

        double impartirea2 = 1.5/78;
        System.out.println("Aceastea este adoua inercare de a impartii doua numere = " +  impartirea2);

        //4.Write a Java program to print the result of the following operations:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println("puncutl a este = " + (-5 + 8 * 6));
        System.out.println("puncutl b este = " + ((55+9) % 9));
        System.out.println("puncutl c este = " + (20 + -3*5 / 8));
        System.out.println("puncutl d este = " + (5 + 15 / 3 * 2 - 8 % 3));
        // sau;

        int Q = 5;
        int W = 8;
        int E = 6;
        int a = -Q + W * E;
        System.out.println("rezultatul operatiei 'a' = " + a );
        byte b= (55+9) % 9;
        System.out.println("rezultatul operatiei 'b' = " + b);
        byte c= 20 + -3*5 / 8;
        System.out.println("rezultatul operatiei 'c' = " + c);
        byte d= 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("rezultatul operatiei 'c' = " + d);











    }
}
