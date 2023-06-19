/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_juanidiaquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Inventarios {

    ArrayList<String> ListaProductos = new ArrayList();
    ArrayList<Integer> IDProducto = new ArrayList();
    ArrayList<Integer> Cantidad = new ArrayList();
    ArrayList<String> Nombres = new ArrayList();
    ArrayList<Integer> Precio = new ArrayList();
    int cantidad;

    @Override
    public String toString() {
        return "Inventarios{" + "ListaProductos=" + ListaProductos + IDProducto + Cantidad + Nombres + Precio + '}';
    }

    public void CantT(int numero) {
        this.cantidad = numero;
    }

    public void AgregarProductos() {
        Scanner pd = new Scanner(System.in);
        System.out.println("Agregue sus producto:");
        ArrayList<String> listaproductos = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            String producto = pd.nextLine();
            listaproductos.add(producto);
        }
        this.ListaProductos = listaproductos;
    }

    public void IdP() {
        Scanner pd = new Scanner(System.in);
        ArrayList<Integer> IDProduct = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            int ID = (int) ((Math.random() * (900 - 100)) + 100);
            IDProduct.add(ID);
        }
        this.IDProducto = IDProduct;

    }

    public void CantidadA() {
        Scanner pd = new Scanner(System.in);
        ArrayList<Integer> cantida = new ArrayList();
        System.out.println("Ingrese la cantidad que habra en existencia de cada producto:");
        for (int i = 0; i < cantidad; i++) {
            int canti = pd.nextInt();
            cantida.add(canti);
        }

        this.Cantidad = cantida;
    }

    public void NombreProducto() {
        Scanner pd = new Scanner(System.in);
        ArrayList<String> Nombre = new ArrayList();
        System.out.println("Ingrese el nombre de los productos respectivamente:");
        for (int i = 0; i < cantidad; i++) {
            String x = pd.nextLine();
            Nombre.add(x);
        }

        this.Nombres = Nombre;
    }

    public void PrecioP() {
        Scanner pd = new Scanner(System.in);
        ArrayList<Integer> PP = new ArrayList();
        System.out.println("Ingrese el precio por unidad de cada producto:");
        for (int i = 0; i < cantidad; i++) {
            int precio = pd.nextInt();
            PP.add(precio);
        }
        this.Precio = PP;
    }

    public void State() {
        for (int i = 0; i < Cantidad.size(); i++) {
            int x = Cantidad.get(i);
            if (x > 0) {
                System.out.println("Disponible");
            } else {
                System.out.println("Out of Stock");
            }
        }
    }

}
