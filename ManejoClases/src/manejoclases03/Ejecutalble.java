/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutalble {
    public static void main(String[] args){
        Hospital miHospital = new Hospital();
        Scanner entrada = new Scanner(System.in);
        
        String name;
        int camas;
        double saldo;
        
        System.out.println("Ingrese el nombre del hospital:");
        name= entrada.next();
        System.out.println("Ingrese el numero de camas del hospital:");
        camas= entrada.nextInt();
        System.out.println("Ingrese el presupuesto del hospital:");
        saldo= entrada.nextDouble();
        
        miHospital.establecerNombre(name);
        miHospital.establecerNumeroCamas(camas);
        miHospital.establecerPresupuesto(saldo); 
        
        System.out.printf("%s - %d - %.2f\n", miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(), 
                miHospital.obtenerPresupuesto());
    }
}
