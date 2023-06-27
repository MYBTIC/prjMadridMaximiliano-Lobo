package UtilitarioProgra;

import java.util.Scanner;

public class Utilitario {
    /**
     * @Recomendacion Modifique el rango de aceptacion
     * @param num Recepta el numero a validar
     * @return El numero Ya validado
     */
    public static int ValidacionNumero(int num) {
        Scanner Input = new Scanner(System.in);
        boolean control = true;
        do {
            try {
                num = Integer.parseInt(Input.nextLine());
                while (num < 0 || num > 4) {
                    System.out.print("Digite un numero positivo y en el rango que se le solicita: ");
                    num = Integer.parseInt(Input.nextLine());

                }
                control = true;
            } catch (NumberFormatException e) {
                System.out.print("Digite un numero, No caracter: ");
                control = false;
            }
        } while (control == false);
        return num;
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
