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
public class Aplicacion {
    public void newAplicacion(){
        Scanner sc=new Scanner(System.in);
       
       int contador=1;
       String array [][]=new String[contador][4];
   
        int acumulador=0;
        String datos;
        String corriente;
        int numero;
        
        System.out.println("1)Ingresar Datos");
        System.out.println("2)Ver resultados");
        System.out.println();
        
        System.out.println("Ingrese su eleccion");
        System.out.print("=>");
        numero=sc.nextInt();

       
        if(numero==1){
          contador++;
           System.out.println("Ingrese los siguientes datos".toUpperCase());
           System.out.println();
           
            for(int i = 0; i < array.length; i++) {
                
                for(int j = 0; j < array[i].length; j++) {
                  
                    if (acumulador==0){
                        System.out.println("Ingrese la corriente");
                        corriente = sc.nextLine();
                          array[i][j]=corriente;
                        acumulador++;
                        
                    }else if(acumulador==1){
                         System.out.println("Ingrese Participante a presidente");
                        datos=sc.nextLine();
                        array[i][j]=datos;
                        acumulador++;
                        
                    }else if(acumulador==2){
                        System.out.println("Departamento");
                        datos=sc.nextLine();
                        array[i][j]=datos;
                        acumulador++;
                        
                    }else if(acumulador==3){
                        System.out.println("C.Papeletas");
                        datos=sc.nextLine();
                        array[i][j]=datos;
                        acumulador++;
                    }
                      
                }
                
            }
           Aplicacion callAplicacion = new Aplicacion();
          callAplicacion.newAplicacion();
            
            
            
        }else if(numero==2){
            
          
            for (int i = 0; i <array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                     System.out.print("  ");
                    
                }
                System.out.println();
            }
            
        }else{
          Aplicacion callAplicacion = new Aplicacion();
          callAplicacion.newAplicacion();
          
      }
    }
}
