/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre_apellido = " ";
        String cadena = "";
        String alcanza = " ";
        String falta = " ";
        String acumulador = "";
        double sueldo = 0;
        double gasto_h1 = 0;
        double gasto_h2 = 0;
        double gasto_h3 = 0;
        double gasto_total = 0;
        boolean salir = true;
        

        while (salir) {
            System.out.println("Ingrese nombres y apellidos del padre de familia");
            nombre_apellido = entrada.nextLine();
            System.out.println("Ingrese el Sueldo mensual");
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el gasto del primer hijo");
            gasto_h1 = entrada.nextDouble();
            System.out.println("Ingrese el gasto del segundo hijo");
            gasto_h2 = entrada.nextDouble();
            System.out.println("Ingrese el gasto del tercer hijo");
            gasto_h3 = entrada.nextDouble();
            
            gasto_total = gasto_h1 + gasto_h2 + gasto_h3;
            
            if(gasto_total >= sueldo){
            alcanza = ("falta");
            }else
                if(gasto_total <sueldo){
                    alcanza = ("alcanza");
                    }
            
            
                cadena = String.format("%s" + "Nombre del Padre:%s\n" 
                + "Sueldo: %.2f\n" + "Gastos\n" + "Hijo1: %.2f\n" 
                + "Hijo2: %.2f\n" + "Hijo3: %.2f\n"
                + "Gasto Total: %.2f\n" + "El padre %s Le %s el dinero\n",
                cadena,
                nombre_apellido,
                sueldo,
                gasto_h1,
                gasto_h2,
                gasto_h3,
                gasto_total,
                nombre_apellido,
                alcanza);
                entrada.nextLine();
            
            acumulador = cadena;
                     
                 
                      
            System.out.println("Ingrese el valor de -1 para salir del ciclo");
            int temporal = entrada.nextInt();
            entrada.nextLine();
            if (temporal == -1) {
                salir = false;
            }
        }

        System.out.printf("%s", acumulador);

    }
}
