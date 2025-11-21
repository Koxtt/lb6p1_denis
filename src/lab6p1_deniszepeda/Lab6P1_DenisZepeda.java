/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_deniszepeda;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
    * @author Denis Josue Zepeda
 */
public class Lab6P1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int opc;
        
        System.out.println("---------MENU----------");
        System.out.println("1) - Ahorcados en Java");
        System.out.println("2) - Producto Punto de dos Vectores");
        System.out.println("3) - Turing");
        opc = entry.nextInt();
        
        do {            
            switch (opc) {
                
                case 0:
                    System.out.println("Usted esta saliendo del programa");
                    break;
                
                case 1:
                    int opc;
                    System.out.println("SUBMENU");
                    System.out.println("Ahorcados en Java");
                    System.out.println("1) Palabras Fciles");
                    System.out.println("2) Palabras Dificiles");
                    opc = entry.nextInt();
                    
                    switch (opc) {
                        case 1:
                            System.out.println("Palabras Faciles");
                            ahorcadosfacil();
                            break;
                        case 2:
                            System.out.println("Palabras Dificiles");
                            ahorcadosdificil();
                            break;
                        default:
                            System.out.println("ERROR...Opcion no valida");
                            continue;
                    }
                    
                    break;
                case 2:
                    System.out.println("Producto Punto de dos vectores");
                    break;
                case 3:
                    System.out.println("Turing");
                    break;
                default:
                    System.out.println("Eror opcion no valida ");;
            }
        } while (opc!=0);
        
        
        
        public static String[] ahorcadosfacil(String[] palabrasFacil){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadenas de 7 caracteres, 8 Vidas");
        Secure rand = new SecretRandom();
        int intentos = 8; 
        boolean caracterv = false; 
        String caracter = "";
        String[] palabrasDificil = {"abc123bac321", "crabominable", "siguatepeque", "cadenascon12",
        "hollowknight", "thebattlecat", "ventiladores", "programacion", "eloteconatol", "alvaritodiaz"};
        int rand = random.nextInt(palabrasFacil.length);
        
            for (int i = 0; i <palabrasFacil.length; i++) {
                if (i == rand) {
                    caracter = palabrasFacil[i];
                }
            }
        
        String adivinarcar = ""; 

        for (int i = 0; i < caracter.length(); i++) {
            adivinarcar += "_";
        }

        while (intentos > 0 && !caracterv) {
            System.out.println("\n=============================================");
            System.out.println("Palabra: " + adivinarcar);
            System.out.println("Vidas restantes: " + intentos);
            System.out.print("Adivina una letra: ");

            String intento = scan.next().toUpperCase();
            scan.nextLine();

            if (intento.length() != 1) {
                System.out.println("ERROR: Por favor, ingrese solo una letra.");
                continue;             }

            char letra = intento.charAt(0);
            boolean letraAdivinada = false;
            StringBuilder adivinarcarActualizado = new StringBuilder(adivinarcar);

        
            for (int i = 0; i < palabrasFacil.length(); i++) {
                if (palabrasFacil.charAt(i) == letra) {
                    adivinarcarActualizado.setCharAt(i, letra); 
                    letraAdivinada = true;
                }
            }

            adivinarcar = adivinarcarActualizado.toString(); 

            if (letraAdivinada) {
                System.out.println("¡Bien! La letra '" + letra + "' está en la palabra.");
                
                if (adivinarcar.equals(palabrasFacil)) {
                    caracterv = true;
                }
            } else {
                intentos--;
                System.out.println("¡Fallaste! La letra '" + letra + "' no está. Pierdes una vida.");
            }
        } 
        
        System.out.println("\n=============================================");
        if (caracterv) {
            System.out.println("¡¡FELICIDADES!! Adivinaste la palabra: " + palabrasFacil);
        } else {
            System.out.println("¡JUEGO TERMINADO! Te quedaste sin intentos.");
            System.out.println("La palabra secreta era: " + palabrasFacil);
        }

    }
        
    public static String[] ahorcadosdificil(String[] palabrasFacil) {
        System.out.println("Cadenas de 12 caracteres, 10 Vidas");
        Scanner scan = new Scanner(System.in);
        Secure rand = new SecretRandom();
        int intentos = 10; 
        boolean caracterv = false; 
        String caracter = "";
        String[] palarasFacil = {"hangman", "scanner", "validar", "ceviche", "strings", "3arrays",
            "algebra", "program", "calculo", "chatgpt", "pokemon", "strokes", "11yonce"};
        int rand = random.nextInt(palabrasFacil.length);

        for (int i = 0; i < palabrasFacil.length; i++) {
            if (i == rand) {
                caracter = palabrasFacil[i];
            }
        }

        String adivinarcar = ""; 

      
        for (int i = 0; i < caracter.length(); i++) {
            adivinarcar += "_";
        }

        while (intentos > 0 && !caracterv) {
            System.out.println("\n=============================================");
            System.out.println("Palabra: " + adivinarcar);
            System.out.println("Vidas restantes: " + intentos);
            System.out.print("Adivina una letra: ");

            String intento = scan.next().toUpperCase();
            scan.nextLine();

            if (intento.length() != 1) {
                System.out.println("ERROR: Por favor, ingrese solo una letra.");
                continue; 
            }

            char letra = intento.charAt(0);
            boolean letraAdivinada = false;
            StringBuilder adivinarcarActualizado = new StringBuilder(adivinarcar);

            for (int i = 0; i < palabrasFacil.length(); i++) {
                if (palabrasFacil.charAt(i) == letra) {
                    adivinarcarActualizado.setCharAt(i, letra); 
                    letraAdivinada = true;
                }
            }


            if (letraAdivinada) {
                System.out.println("¡Bien! La letra '" + letra + "' está en la palabra.");
                if (adivinarcar.equals(palabrasFacil)) {
                    caracterv = true;
                }
            } else {
                intentos--;
                System.out.println("¡Fallaste! La letra '" + letra + "' no está. Pierdes una vida.");
            }
        } 

    
        System.out.println("\n=============================================");
        if (caracterv) {
            System.out.println("¡¡FELICIDADES!! Adivinaste la palabra: " + palabrasFacil);
        } else {
            System.out.println("¡JUEGO TERMINADO! Te quedaste sin intentos.");
            System.out.println("La palabra secreta era: " + palabrasFacil);
        }

    }
}


