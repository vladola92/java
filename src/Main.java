import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
        int x = scanez.nextInt();
        Dogs rex = new Dogs();
        rex.culoare="verde";
        rex.greutate=25.5f;

        rex.nume=scanez.next();
        rex.rasa="Ciobanesc";
        rex.varsta=3;
        System.out.println(rex.greutate);
        System.out.println(rex.culoare);
        System.out.println(rex.nume);
        System.out.println(rex.rasa);
        System.out.println(rex.varsta);

        Dogs rex = new Dogs();
        rex.culoare="verde";
        rex.greutate=25.5f;

        rex.nume=scanez.next();
        rex.rasa="Ciobanesc";
        rex.varsta=3;
        System.out.println(rex.greutate);
        System.out.println(rex.culoare);
        System.out.println(rex.nume);
        System.out.println(rex.rasa);
        System.out.println(rex.varsta);

        // 1.Write a Java program to print 'Hello' on screen and then print your
        //name on a separate line;
//
//        System.out.println("Hello");
//
//
//        // 2.Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
//        //sum of the two numbers;
//
//        int x = 7;
//        int y = 8;
//
//        int scadere = x - y;
//
//        System.out.println("The addition of  and 8 is = " + scadere );
//
//        double impartire = x/y ;
//        System.out.println(impartire);  // aici inca nu inteleg de ce am rezultatul 0.0
//
//        double impartirea2 = 1.5/78;
//        System.out.println("Aceastea este adoua inercare de a impartii doua numere = " +  impartirea2);
//
//        //4.Write a Java program to print the result of the following operations:
//        //a. -5 + 8 * 6
//        //b. (55+9) % 9
//        //c. 20 + -3*5 / 8
//        //d. 5 + 15 / 3 * 2 - 8 % 3
//        System.out.println("puncutl a este = " + (-5 + 8 * 6));
//        System.out.println("puncutl b este = " + ((55+9) % 9));
//        System.out.println("puncutl c este = " + (20 + -3*5 / 8));
//        System.out.println("puncutl d este = " + (5 + 15 / 3 * 2 - 8 % 3));
//        // sau;
//
//        int Q = 5;
//        int W = 8;
//        int E = 6;
//        int a = -Q + W * E;
//        System.out.println("rezultatul operatiei 'a' = " + a );
//        byte b= (55+9) % 9;
//        System.out.println("rezultatul operatiei 'b' = " + b);
//        byte c= 20 + -3*5 / 8;
//        System.out.println("rezultatul operatiei 'c' = " + c);
//        byte d= 5 + 15 / 3 * 2 - 8 % 3;
//        System.out.println("rezultatul operatiei 'c' = " + d);


//        int res = scadere(2, 3);
//        System.out.println(res);
//        System.out.println(scadere(456, 123));
//        int rez = impartire(4, 2);
//        System.out.println(rez);
//        System.out.println(inmultire(4, 8));
//
//       int primulNumar = 2;
//       int alDoileaNumar = 3;
//       System.out.println(scadere(primulNumar,alDoileaNumar));
//        System.out.println(impartire(primulNumar,alDoileaNumar));
//        System.out.println(inmultire(primulNumar,alDoileaNumar));
    }

    public static int scadere(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar - alDoileaNumar;
        return resultat;
    }

    public static int impartire(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }

    public static int inmultire(int primulNumar,int alDoileaNumar) {
        int resultat = primulNumar * alDoileaNumar;
        return resultat;

    }

}
