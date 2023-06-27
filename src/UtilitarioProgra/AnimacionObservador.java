package UtilitarioProgra;

import java.util.Scanner;

public class AnimacionObservador {
    public AnimacionObservador() {
        System.out.println("\t\t\tInicializando Menu");

    }

    public static int Menu(int Conteo) {
        int opc = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("\t\t\t\tJuego Caperucita");
        System.out.println("\t\tComo desea viajar a bordo: ");
        System.out.println("\t\t0. Sin nadie");
        System.out.println("\t\t1. Con el lobo");
        System.out.println("\t\t2. Con Caperucita");
        System.out.println("\t\t3. Con las Uvas");
        System.out.println("\t\t4. Salir");
        System.out.print("\t\tDigite la opcion que desea: ");
        opc = Utilitario.ValidacionNumero(opc);
        System.out.println("\n\n");
        return opc;
    }

    public static int Menu2(int Conteo) {
        int opc = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("\t\t\t\tJuego Caperucita");
        System.out.println("\t\tComo desea viajar a bordo: ");
        System.out.println("\t\t0. Sin nadie");
        System.out.println("\t\t1. Con el lobo");
        System.out.println("\t\t2. Con Caperucita");
        System.out.println("\t\t3. Con las uvas");
        System.out.println("\t\t4. Salir");
        System.out.print("\t\tDigite la opcion que desea: ");
        opc = Utilitario.ValidacionNumero(opc);
        System.out.println("\n\n");
        return opc;
    }
}
