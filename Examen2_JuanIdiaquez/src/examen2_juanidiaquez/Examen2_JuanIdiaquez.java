/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_juanidiaquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Examen2_JuanIdiaquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pd=new Scanner(System.in);
        Inventarios I=new Inventarios();
        boolean bandera = true;
        while(bandera){
        System.out.println("Bienvenido al Examen2");
        System.out.println("Sus opciones son las siguientes:");
        System.out.println();
        System.out.println("1.Agregar producto");
        System.out.println("2.Listar productos");
        System.out.println("3.Buscar producto");
        System.out.println("4.Salir");
        System.out.println();
        System.out.println("Ingrese el numero de enfrente de la opcion para escogerla: ");
        int menu= 0;
        menu = pd.nextInt();
        switch (menu){
            case 1:
                System.out.println("Cuantos Productos desea agregar:");
                int Np=pd.nextInt();
                I.CantT(Np);
                I.AgregarProductos();
                I.IdP();
                I.CantidadA();
                I.NombreProducto();
                I.PrecioP();               
                 bandera = true;
                break;
            case 2:
                    System.out.println(I);
                 bandera = true;
                break;
            case 3:
                System.out.println("No se inge toy chikito");
                break;
            case 4:
                System.out.println("Cerrando Programa....");
                 bandera = false;
                break;
            default:
                break;
        }
      }
                
    }
    
}
