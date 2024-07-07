package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisasMain {
    public DivisasMain() {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            try {
                System.out.println("|----------------------------------------------------------|");
                System.out.println("|*************   CONVERSIÓN DE DIVISAS    *****************|");
                System.out.println("|----------------------------------------------------------|");
                System.out.println("|----------------------------------------------------------|");
                System.out.println("|*******   Ingrese la opción que desea realizar   *********|");
                System.out.println("|                                                          |");
                System.out.println("|         Opcion 1: Ingrese Divisa que vas convertir:      |");
                System.out.println("|                                                          |");
                System.out.println("|         Opcion 0: Salir de la aplicación                 |");
                System.out.println("|                                                          |");
                System.out.println("|----------------------------------------------------------|");
                System.out.println("|--------------|");
                System.out.println("|--- Opción: --| ");
                System.out.println("|--------------|");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("|--------//////////////////////////----------|");
                        System.out.println("|-----                                 ------|");
                        System.out.println("|-----   APLICACION FINALIZADA BYE!    ------|");
                        System.out.println("|-----                                 ------|");
                        System.out.println("|--------//////////////////////////----------|");
                        break;
                    case 1:
                        RealizarConversion.realizarConversion(sc);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
            } catch (InputMismatchException var4) {
                System.out.println("ERROR: Opción incorrecta. Por favor, ingrese un número válido.");
                sc.nextLine();
                opcion = -1;
            }
        } while(opcion != 0);

    }
}