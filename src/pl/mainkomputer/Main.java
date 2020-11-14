package pl.mainkomputer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do{
            System.out.println("Wybierz Figure");
            System.out.println("1.Objętość Kuli");
            System.out.println("2.Objętość Stożka");
            System.out.println("3.Objętość Walca");
            System.out.println("4.Objętość Prostopadłościanu");
            System.out.println("5.Objętości Sześcianu");
            i = scanner.nextInt();
        switch(i){
            case 0:
                System.out.println("Wyjście");
                break;
            case 1:
                System.out.println("Podaj Promień(r)");
                int r = scanner.nextInt();
                System.out.println("Objętość wynosi V="+ (4/3 * Math.PI*r*r*r));
                break;
            case 2:
                System.out.println("Podaj Promień(r)");
                r = scanner.nextInt();
                System.out.println("Podaj Wysokość(h)");
                int h = scanner.nextInt();
                System.out.println("Objętośc wynosi V="+((Math.PI*r*r)/3)*h);
                break;
            case 3:
                System.out.println("Podaj Promień(r)");
                r = scanner.nextInt();
                System.out.println("Podaj Wysokość(h)");
                h = scanner.nextInt();
                System.out.println("Objętość wynosi V="+ Math.PI*r*r*h);
                break;
            case 4:
                System.out.println("Podaj Długość(a)");
                int a = scanner.nextInt();
                System.out.println("Podaj Szerokość(b)");
                int b = scanner.nextInt();
                System.out.println("Podaj Wysokość(c)");
                int c = scanner.nextInt();
                System.out.println("Wynik wynosi V="+ a*b*c);
            case 5:
                System.out.println("Podaj Długość boku(a)");
                a = scanner.nextInt();
                System.out.println("Wynik wynosi V="+a*a*a);
            default:
                System.out.println("Wybierz liczbe od 1 do 5");


        }
        }while(i != 0);
    }
}
