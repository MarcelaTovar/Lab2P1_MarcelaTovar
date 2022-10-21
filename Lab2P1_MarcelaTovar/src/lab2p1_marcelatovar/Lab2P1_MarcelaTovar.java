
package lab2p1_marcelatovar;

import java.util.Scanner;

public class Lab2P1_MarcelaTovar {

    //Ejercicio 1
    public static void main(String[] args) {
      
        int PrimerNumero =0;
        int SegundoNumero=0;
        int resultado_final=0;
        int resultado_final2=0;
        Scanner ObiWan = new Scanner (System.in);
      
        
            System.out.println("----Menu---");
            System.out.println("Este programa calcula el MCD de dos numeros ");
            System.out.print("Ingrese el primer número: ");
            PrimerNumero = ObiWan.nextInt();
            System.out.print("Ingrese el segundo número: ");
            SegundoNumero = ObiWan.nextInt();
            if (PrimerNumero==0){
                System.out.print("Tiene que ser positivo");
            }
            if (SegundoNumero==0){
                System.out.print("Tiene que ser positivo");
            }
          
           
        while (PrimerNumero!= SegundoNumero){
        if (PrimerNumero>SegundoNumero){
             resultado_final = (PrimerNumero -= SegundoNumero);
            PrimerNumero = resultado_final;
        }else if (SegundoNumero>PrimerNumero){
             resultado_final2 = (SegundoNumero -= PrimerNumero);
            SegundoNumero = resultado_final2; 
        }
        
        
        }
        System.out.print("Este es el MCD " +resultado_final);
        
        // SEGUNDO EJERCICIO
        System.out.println("---Menu---");
        System.out.println("Este programa evalua su generación");
        System.out.print("Ingrese su nacimiento: ");
        int edad = ObiWan.nextInt();
        if (edad>=1946 && edad <= 1964){
            System.out.print("BabyBoomerGen");
        }
        if (edad >= 1960 && edad <=1979 ){
            System.out.print("Generation X");
        }
        if (edad >= 1975 && edad <= 1985){
            System.out.print("Xennials");
        }
        if (edad >= 1980 && edad <= 1994){
            System.out.print("Millenials");
        }
        if (edad >= 1990 && edad <= 2012){
            System.out.print("Gen Z");
        }
        if (edad >= 2013 && edad <= 2025){
            System.out.print("Gen Alpha");
        }
        
        //Ejercicio 3
        System.out.println("---Menu---");
        System.out.println("Este programa idemtifica su Pokemon");
        System.out.println("1. Hada 2. Hierro 3. Luchador 4. Psiquico ");
        System.out.print("Ingrese numero de Atacador: ");
        int atacador = ObiWan.nextInt();
        System.out.print("Ingrese numero de Defensor: ");
        int defensor = ObiWan.nextInt();
        if (atacador == 1 && defensor == 2){
            System.out.println("El tipo Hada es débil contra el tipo hierro");
        }
        if (atacador == 2 && defensor == 3){
            System.out.print("El tipo Hierro es Super Eficaz contra el tipo Luchador");
        }
        if (atacador == 3 && defensor == 2){
            System.out.print("El tipo luchador es neutral contra el tipo hierro");
        }
        if (atacador == 4 && defensor == 2){
            System.out.print("El tipo psiquico es neutral contra el hierro");
        }
        if (atacador == 2 && defensor == 1){
            System.out.print("El tipo Hierro es débil contra el tipo Hada");
        }
        if (atacador == 3 && defensor == 1){
            System.out.print("El tipo luchador es débil contra fairy");
        }
        if (atacador == 4 && defensor == 1){
            System.out.print("El tipo psiquico es neutral contra fairy");
        }
        if (atacador == 1 && defensor == 3){
            System.out.print("El tipo Hada es super eficaz contra el tipo luchador");
        }
        if (atacador == 3 && defensor == 4){
            System.out.print("El tipo es super eficaz contra el tipo psiquico");
        }
        if (atacador == 1 && defensor == 4){
            System.out.print("El tipo hada es neutral contra el psiquico");
        }
        if (atacador == 2 && defensor == 4){
            System.out.print("El tipo hierro es debil contra el tipo psiquico");
        }
        if (atacador == 3 && defensor == 4){
            System.out.print("El tipo luchador es super eficaz contra el psiquico");
        }
                
            }
        }
    
    
    
    
        
    
                
            
        
            
       
            
        
        
        
        
       
            
            
        
        
    

        
        
    
    
        
 
      
    
    
       
     
            
        
           
            
        
        
        
        
        
        
  
