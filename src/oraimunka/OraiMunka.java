package oraimunka;

import java.util.Scanner;

public class OraiMunka {

    static String[] pakli = new String[21];

    public static void main(String[] args) {
        jatek();

    }

    private static void jatek() {
        kirak();
        kiiratas();

        for (int i = 0; i < 3; i++) {
            int bekert = bekeres();
            keveres(bekert);
        }
        ezvolt();

    }

    private static int bekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMelyik oszlopba van a kártyád?(1-3): ");
        int oszlop = sc.nextInt();
        while (!((oszlop > 0) && (oszlop < 4))) {
            System.out.print("HIBA \n Melyik oszlopba van a kártyád?(1-3): ");
            oszlop = sc.nextInt();
        }
        return oszlop;

    }

    private static void kiiratas() {
        int sortores = 0;
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%12s", pakli[i]);
            sortores++;
            if (sortores == 3) {
                System.out.println("");
                sortores = 0;
            }
        }
    }

    private static void keveres(int oszlop) {
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    pakli[i] = pakli[19 - i * 3];
                    pakli[i + 7] = pakli[18 - i * 3];
                    pakli[i + 14] = pakli[20 - i * 3];
                }
                break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    pakli[i] = pakli[18 - i * 3];
                    pakli[i + 7] = pakli[19 - i * 3];
                    pakli[i + 14] = pakli[20 - i * 3];
                }
                break;
            case 3:
                for (int i = 0; i < 7; i++) {
                    pakli[i] = pakli[20 - i * 3];
                    pakli[i + 7] = pakli[19 - i * 3];
                    pakli[i + 14] = pakli[18 - i * 3];
                }
                break;

        }

        kiiratas();

    }

    private static void kirak() {
        String[] szinek = {"P", "Z", "T", "M"};
        String[] szamok = {"V", "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i < pakli.length; i++) {

            pakli[i] = szinek[i / 6] + " - " + szamok[i % 6];
        }

    }

    private static void ezvolt() {
        System.out.println("\nEz volt az általad kiválaszott lap?: " + pakli[11]);
    }

}
