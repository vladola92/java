public class Main {
    public static int first = 125;       // from ex 5
    public static int second = 24;       // from ex 5
    public static float h = 2;
    public static float m = 200000;
    public static float s = 7200;

    public static void main(String[] args) {
        // 1.Write a Java program to print 'Hello' on screen and then print your
        //name on a separate line;

        System.out.println("Hello");


        // 2.Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
        //sum of the two numbers;

        int x = 7;
        int y = 8;

        int scadere = x - y;

        System.out.println("The addition of  and 8 is = " + scadere);

        double impartire = x / y;
        System.out.println(impartire);  // aici inca nu inteleg de ce am rezultatul 0.0

        double impartirea2 = 1.5 / 78;
        System.out.println("Aceastea este adoua inercare de a impartii doua numere = " + impartirea2);

        //4.Write a Java program to print the result of the following operations:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println("puncutl a este = " + (-5 + 8 * 6));
        System.out.println("puncutl b este = " + ((55 + 9) % 9));
        System.out.println("puncutl c este = " + (20 + -3 * 5 / 8));
        System.out.println("puncutl d este = " + (5 + 15 / 3 * 2 - 8 % 3));

        System.out.println("---------------------------------------------------------------------------------------------Puctul  1");
        int unu = adunare(17, 30, 3); //    ex 1
        System.out.println(unu);
        System.out.println("---------------------------------------------------------------------------------------------Punctul 2");
        System.out.println(afisareHelloNume());             //    ex 2
        System.out.println("---------------------------------------------------------------------------------------------Exercitiu random");
        scadere();
        System.out.println("---------------------------------------------------------------------------------------------Punctul 3");
        System.out.println(impartire(2, 3, 3));    //    ex 3
        System.out.println("---------------------------------------------------------------------------------------------Punctul 4");
        System.out.println(afisareManechin());
        System.out.println("---------------------------------------------------------------------------------------------Punctul 5");
        int cinci = operatii(125, 24);
        System.out.println(cinci);
        System.out.println("---------------------------------------------------------------------------------------------Punctul 5");
        int a = first + second;
        int b = first - second;
        int c = first * second;
        int d = first / second;
        int e = first % second;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("---------------------------------------------------------------------------------------------Punctul 6");
        float sase = convert(53);
        System.out.println(sase);
        System.out.println("---------------------------------------------------------------------------------------------Punctul 7");
        float sapte = convert2(5, 0.0254f);
        System.out.println(sapte);
        System.out.println("---------------------------------------------------------------------------------------------Punctul 8");
        float vms = m / s;
        float milesh = vms / h;
        float kmh = milesh / 1.6f;
        System.out.println(vms);
        System.out.println(milesh);
        System.out.println(kmh);

    }

    // 1. Write a Java program that takes two numbers  as input and display the product of two numbers.

    public static int adunare(int primulNumar, int alDoileaNumar, int trei) {
        int resultat = primulNumar + alDoileaNumar + trei;
        return resultat;

    }

    // 2 Write a Java program to display the following pattern

    public static String afisareHelloNume() {
        return "   J    A    V     V    A   \n   J   A A    V   V    A A  \nJ  J  AAAAA    V V    AAAAA \n JJ  A     A    V    \"A\"     A ";

    }

    public static void scadere() {
        int resultat = 15 - 3;
        System.out.println(resultat);
    }

    // 3 .Write a Java program that takes three numbers as input to calculate and print the average of the numbers
    public static float impartire(int unu, int doi, int trei) {
        float rezultat = ((unu + doi + trei) / 3f);
        return rezultat;
    }

    // ex 4 trying

    public static String afisareManechin() {
        return " +\"\"\"\"\"+ \n[| O O |]\n |  ^  | \n | '_' | \n +-----+ ";
    }

    public static int operatii(int x, int y) {
        int unu = x + y;
        return unu;
    }
    //6.Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this formula: C = 5/9 * (F-32)

    public static float convert(float F) {
        float cinci = ((5 / 9f) * (F - 32));
        return cinci;

        //7.Write a Java program that reads a number in inches, converts it to meters. ( one inch is 0.0254 meters)
    }

    // 8.Write a Java program to takes the user for a distance (in meters)and the time was taken (as three numbers: hours, minutes,
    //seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)

    public static float convert2(float M, float I) {
        float meters = M * I;
        return meters;
    }
}

