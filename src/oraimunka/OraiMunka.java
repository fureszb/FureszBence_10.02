package oraimunka;

import java.util.Scanner;

public class OraiMunka {

    static String[] pakli = new String[22];

    public static void main(String[] args) {
       kirak();
        //kiiratas();
       // bekeres();

        //keveres();
        
    }

    private static int bekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik oszlopba van a kártyád?(1-3): ");
        int oszlop = sc.nextInt();
        while (!(oszlop < 1 && oszlop > 3)) {
            System.out.print("Melyik oszlopba van a kártyád?(1-3): ");
            oszlop = sc.nextInt();
        }
        return oszlop;

    }

    private static void kiiratas() {
        
    }

    private static void keveres(int oszlop) {
        if (oszlop == 1) {
            for (int i = 1; i <= 7; i++) {
                i = 20 - i * 3;
            }

        }

    }

    private static void kirak() {
        String[] szinek = {"P", "Z", "T", "M"};
        String[] szamok = {"V", "VI", "VII", "VIII", "IX", "X"};
        
        for (int i = 0; i < pakli.length; i++) {
           
            pakli[i] = szinek[i/6]+" - "+szamok[i%6];
        }
        
        int sortores = 0;
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf(pakli[i] + "\t"+"|"+ "\t");
            sortores++;
            if (sortores == 3) {
                System.out.println("");
                sortores=0;
            }
        }
    }

}
