/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitygame;

import java.util.*;

public class InfinityGame {

    
    public static void main(String[] args) {
        seleccionMenu();
    }
    
    public static void menu(){
        System.out.println("Bienvenido a Infinity Game");
        System.out.println("");
        System.out.println("Modo de juego");
        System.out.println("1: Modo Individual");
        System.out.println("2: Multijugador");
        System.out.println("3: Salir del juego");
    }
    
    public static void seleccionMenu(){
    int opcion = 0;
    
    while(opcion!=3){
        menu();
        System.out.println("Ingrese una opcion");
        opcion = validacion();
        switch(opcion){
                    
            case 1 : 

                break;
            case 2 : 
                
                break;
            case 3 :
                System.out.println("¡Hasta luego!");
                System.exit(0);
                break;
           
            default:
                
                System.out.println("Opcion no valida");
                break;
                    
            }
        }
    }
    
    public static int validacion (){
        int dato=0;
        boolean error;
        do{
            try{
               error = false;
               Scanner teclado = new Scanner(System.in);
               dato = teclado.nextInt(); 
            }catch(InputMismatchException e){
               System.out.println("Numero ingresado no es valido, intente nuevamente ");  
               error = true;
               
            }
        }while(error);
        return dato;     
    }
    public static int lanzarDados(int dado){
        Random azar = new Random();
        
        for (int i = 0; i < 2; i++) {
            int lanzamiento = azar.nextInt(6)+1;
            dado = dado + lanzamiento;
        }
    System.out.println("Su lanzamiento es "+ dado);
    return dado;    
    }
    public static int[] generarTablero(int tablero[]){
        int largo= 0;
        Random azar = new Random();
        do{
            System.out.println("Ingrese el largo del tablero(mayor a 20)");
             largo= validacion();
        }while(largo<20);
        for (int i = 0; i < tablero.length; i++) {
           tablero[i]= azar.nextInt(4)+1;
        }
        tablero[0]= 0;
        tablero[tablero.length]= 5;
        return tablero;
    }
    public static int casillaDesafio(int avance){
        Random azar = new Random();
        camino= azar.nextInt(2);
        if(0==camino){
            avance = azar.nextInt(6)-5;
            System.out.println("Usted ha caigo en desafio avanza o retrocede" + avance + " pasos");
        }else{
            avance = azar.nextInt(5)-4;
            System.out.println("Usted ha caigo en desafio gana o pierde" + avance + " puntos de vida");
        }
        return avance;
    }
    public static int casillaSalud(int salud){
        Random azar = new Random();
        salud = azar.nextInt(3)+1;
        System.out.println("Usted ha ganado de salud"+ salud);
        return salud;
    }
    
    public static int casillaPortal(int portal){
        
        return portal;
    }
}
