/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class prueba {
    public void newprueba(){
        
        
         Scanner sc=new Scanner(System.in);
       
       int contador=1;
     
       int x=0;
       
        String datos;
        String corriente;
        String presidente;
           String departamento;
           
        
        int numero;
        int acumulador=0;
        do{
        
        
        String array [][]=new String[4][4];
         array[0][0]="Corriente";
         array[0][1]="p.presidente";
         array[0][2]="Departamenta";
         array[0][3]="C.papeletas";
         
        System.out.println("1)Ingresar Datos");
        System.out.println("2)Ver Registros");
        System.out.println();
        
        System.out.println("Ingrese su eleccion");
        System.out.print("=>");
        numero=sc.nextInt();
 
        if(numero==1){
            
          contador++;
          acumulador++;
          
           System.out.println();
           System.out.println("Ingrese los siguientes datos".toUpperCase());
           System.out.println();
           
          System.out.println("Ingrese la corriente");
                   array[acumulador][0]="Hola";
                    System.out.println("Ingrese la corriente");
                   
                        
                       
                   
        }else if(numero==2){
            
          
            for (int i = 0; i <array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                     System.out.print("  ");
                    
                }
                System.out.println();
            }
         System.out.println();
        }
        
     }while(x==0);
    }
           
}
    
