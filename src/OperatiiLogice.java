import java.util.Scanner;

public class OperatiiLogice {
    public float convert2(float M, float I) {
        float meters = M * I;
        return meters;
    }

    // 3 .Write a Java program that takes three numbers as input to calculate and print the average of the numbers
    public float impartire(int unu, int doi, int trei) {
        float rezultat = ((unu + doi + trei) / 3f);
        return rezultat;
    }

    public float convert(float F) {
        float cinci = ((5 / 9f) * (F - 32));
        return cinci;
    }

    public void ExcercitiuUnu() {
        System.out.println("......................................Exercitiu 1");
        int x = 3;
        int y = 7;
        if (x > y) {
            System.out.println("x mai mare decat y");
        } else if (x == y) {
            System.out.println("x egal cu y");
        } else {
            System.out.println("x e mai mic ");
        }
    }

    public void ExercitiuDoi() {
        System.out.println("......................................Exercitiu 2");
        int x = 3;
        String a = "FastTrack";
        if (a.equals("LearningTextComparison")) {
        } else {
            System.out.println("Got to try some more");
            System.out.println("......................................Exercitiu 3");
            if (x >= 2) {
                System.out.println("3");
            } else if (x <= 8) {
                System.out.println("x");

            }
        }
    }

    public void ExercitiuPatru() {
        System.out.println("......................................Exercitiu 4");
        int x = 4;
        String a = "FastTrack";
        if (a.equals("FastTrack") && (x <= 3)) {
            System.out.println("FastTrack , 3");
        } else if (a != ("FastTrack") && (x >= 4)) {
            System.out.println("number");
        }
    }

    public void ExercitiuCinci() {
        System.out.println("......................................Exercitiu 5");
        int x = 4;
        if ((x > 8) || (x < 8)) {
            System.out.println("The amount of snow this winter was (cm)");
            System.out.println(x);
        } else {
            System.out.println("The forecast snow is (cm)");
        }
    }

    public void ExercitiuSase() {
        System.out.println("......................................Exercitiu 6");
        int y = 2;
        if ((y > 3) && (y != 4)) {
            System.out.println(("The number is greater then 3 and not equal than 4"));
        } else if (y == 4) {
            System.out.println("The number is equal to 4");
        } else if (y < 3) {
            System.out.println("The number is lower than 3");
        }
    }

    public void ExercitiuSapte() {
        Scanner scan = new Scanner(System.in);
        System.out.println("......................................Exercitiu 7");
        System.out.println("Introduceti un numar ");

        int c = scan.nextInt();
        switch (c) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 94:
                System.out.println("9");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }

    public void ExercitiuOpt() {
        System.out.println("......................................Exercitiu 8");
        System.out.println("Introduceti un numar");
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        if (d % 2 == 0) {
            System.out.println(" The number is even ");
        } else {
            System.out.println("The number is odd");

        }
    }

    public void ExercitiuNoua() {
        System.out.println("......................................Exercitiu 9");
        System.out.println("Varsta persoanei");
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        if (e >= 18) {
            System.out.println("The person is eligible to vote");
        } else {
            System.out.println("The person is not eligible to vote");
        }
    }

    public void ExercitiuZece() {
        System.out.println("......................................Exercitiu 10");
        int x = 6;
        int y = 3;
        int z = 9;
        if (x < y && x < z) {
            System.out.println(" x cel mai mic numar ");
        } else if (y < x && y < z) {
            System.out.println("z cel mai mic numar");
        } else {
            System.out.println("y cel mai mic numar ");
        }
    }
}
