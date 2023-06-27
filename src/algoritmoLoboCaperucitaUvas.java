
/**
 * Copyright@ CM
 * Autor: Maximiliano Madrid Benavides
 * Fecha: 26 de junio del 2023
 * Descripcion: Juego Caperucita,Lobo y Uvas a travez del Rio con Animaciones.
 */
import UtilitarioProgra.AnimacionObservador;
import UtilitarioProgra.Utilitario;

public class algoritmoLoboCaperucitaUvas {
    private static final int delay = 100;

    public static void main(String[] args) throws InterruptedException {
        AnimacionObservadorCasos();
    }

    /**
     * <b>Este metodo nos entrega la animacion del bote y el algoritmo del
     * juego</b>
     * 
     * @throws InterruptedException
     */
    public static void AnimacionObservadorCasos() throws InterruptedException {
        int sizeRiver = 33, Conteo = -1;
        String[] Orilla1 = { "Obs", "lobo", "capc", "uvas" };
        String OrillaIzq = String.join(",", Orilla1);
        String[] Orilla2 = { "", "", "" };
        String OrillaDer = String.join(",", Orilla2);
        String[] BarcoVacio = { "\\_", "", "", "_/" };
        String BarcoLleno = String.join(",", BarcoVacio);

        do {
            Conteo++;
            int position = 0, i = 0, ancho = (sizeRiver / 2) + 2;
            if ((Orilla1[1].equals("lobo") && Orilla1[2].equals("capc") && Orilla1[3].equals("") && Conteo % 2 != 0)
                    || (Orilla2[0].equals("lobo") && Orilla2[1].equals("capc") && Orilla2[2].equals("")
                            && Conteo % 2 == 0)) {
                System.out.println("\n\n\n\n\n");
                System.out.println("\t\t\t\tEl lobo se la comio ENTERA , GAME OVER !!!!");
                System.out.println("\n\n\n\n\n");
                return;
            } else if ((Orilla1[2].equals("capc") && Orilla1[3].equals("uvas") && Orilla1[1].equals("")
                    && (Conteo % 2 == 0))
                    || (Orilla2[1].equals("capc") && Orilla2[2].equals("uvas") && Orilla2[0].equals("")
                            && (Conteo % 2 == 0))) {
                System.out.println("\n\n\n\n\n");
                System.out.println("\t\t\t\tLa caperucita se comio las Uvas, NOOBSITO !!!!");
                System.out.println("\n\n\n\n\n");
                return;
            }
            switch ((Conteo % 2 == 0) ? AnimacionObservador.Menu(Conteo)
                    : AnimacionObservador.Menu2(Conteo)) {
                case 0:
                    Utilitario.limpiarPantalla();
                    Orilla1[0] = "";
                    OrillaIzq = String.join(",", Orilla1);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);

                    while (i < ancho) {
                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position + 1) % sizeRiver;
                        i++;
                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 1:
                    Utilitario.limpiarPantalla();
                    Orilla1[0] = "";
                    if (Orilla1[1].equals("lobo")) {
                        BarcoVacio[2] = "lobo";
                        Orilla1[1] = "";
                    }
                    OrillaIzq = String.join(",", Orilla1);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);
                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla2[0] = "lobo";
                            OrillaDer = String.join(",", Orilla2);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }
                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position + 1) % sizeRiver;
                        i++;

                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 2:
                    Utilitario.limpiarPantalla();
                    Orilla1[0] = "";
                    if (Orilla1[2].equals("capc")) {
                        BarcoVacio[2] = "capc";
                        Orilla1[2] = "";
                    }
                    OrillaIzq = String.join(",", Orilla1);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);
                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla2[1] = "capc";
                            OrillaDer = String.join(",", Orilla2);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }

                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));

                        position = (position + 1) % sizeRiver;
                        i++;

                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");

                    break;
                case 3:
                    Utilitario.limpiarPantalla();
                    Orilla1[0] = "";
                    if (Orilla1[3].equals("uvas")) {
                        BarcoVacio[2] = "uvas";
                        Orilla1[3] = "";
                    }

                    OrillaIzq = String.join(",", Orilla1);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);
                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla2[2] = "uvas";
                            OrillaDer = String.join(",", Orilla2);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }

                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));

                        position = (position + 1) % sizeRiver;
                        i++;

                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\n\n");
                    break;

            }
            if ((Orilla1[1].equals("lobo") && Orilla1[2].equals("capc") && Orilla1[3].equals(""))
                    || (Orilla2[0].equals("lobo") && Orilla2[1].equals("capc") && Orilla2[2].equals("")
                            && Conteo % 2 == 0)) {
                System.out.println("\n\n\n\n\n");
                System.out.println("\t\t\t\tEl lobo se la comio ENTERA , GAME OVER !!!!");
                System.out.println("\n\n\n\n\n");
                return;
            } else if ((Orilla1[2].equals("capc") && Orilla1[3].equals("uvas") && Orilla1[1].equals(""))
                    || (Orilla2[1].equals("capc") && Orilla2[2].equals("uvas") && Orilla2[0].equals("")
                            && Conteo % 2 == 0)) {
                System.out.println("\n\n\n\n\n");
                System.out.println("\t\t\t\tLa caperucita se comio las Uvas, NOOBSITO !!!!");
                System.out.println("\n\n\n\n\n");
                return;
            } else if (Orilla2[0].equals("lobo") && Orilla2[1].equals("capc") && (Orilla2[2].equals("uvas"))) {
                System.out.println("\n\n\n\n\n");
                System.out.println("\t\t\t\tEres un CRACKK!!!! GANASTEE");
                System.out.println("\n\n\n\n\n");
                return;
            }
            switch (AnimacionObservador.Menu2(Conteo)) {
                case 0:
                    Utilitario.limpiarPantalla();
                    i = 0;
                    position = ancho - 1;
                    Orilla1[0] = "";
                    OrillaIzq = String.join(",", Orilla1);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);

                    while (i < ancho) {

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho + 2; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position - 1 + ancho) % ancho;
                        i++;
                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 1:
                    Utilitario.limpiarPantalla();
                    i = 0;
                    position = ancho - 1;
                    if (Orilla2[0].equals("lobo")) {
                        BarcoVacio[2] = "lobo";
                        Orilla2[0] = "";
                    }
                    OrillaDer = String.join(",", Orilla2);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);

                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla1[1] = "lobo";
                            OrillaIzq = String.join(",", Orilla1);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho + 2; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position - 1 + ancho) % ancho;
                        i++;
                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 2:
                    Utilitario.limpiarPantalla();
                    i = 0;
                    position = ancho - 1;
                    if (Orilla2[1].equals("capc")) {
                        BarcoVacio[2] = "capc";
                        Orilla2[1] = "";
                    }
                    OrillaDer = String.join(",", Orilla2);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);

                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla1[2] = "capc";
                            OrillaIzq = String.join(",", Orilla1);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho + 2; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position - 1 + ancho) % ancho;
                        i++;
                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 3:
                    Utilitario.limpiarPantalla();
                    i = 0;
                    position = ancho - 1;
                    if (Orilla2[2].equals("uvas")) {
                        BarcoVacio[2] = "uvas";
                        Orilla2[2] = "";
                    }
                    OrillaDer = String.join(",", Orilla2);
                    BarcoVacio[1] = "Obs";
                    BarcoLleno = String.join(",", BarcoVacio);

                    while (i < ancho) {
                        if (i == ancho - 1) {
                            Orilla1[3] = "uvas";
                            OrillaIzq = String.join(",", Orilla1);
                            BarcoVacio[2] = "";
                            BarcoLleno = String.join(",", BarcoVacio);
                        }

                        StringBuilder animation = new StringBuilder();
                        for (int j = 0; j < ancho + 2; j++) {
                            if (j == position) {
                                animation.append(BarcoLleno);
                                j++;
                            } else {
                                animation.append("_ ");
                            }
                        }
                        System.out.print(String.format("\r<%s> %s <%s>", OrillaIzq, animation, OrillaDer));
                        position = (position - 1 + ancho) % ancho;
                        i++;
                        Thread.sleep(delay);
                    }
                    System.out.println("\n\n\n\n\n");
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        } while (true);
    }
}
