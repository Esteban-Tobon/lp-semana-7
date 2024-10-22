package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {

    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    //lista dde compras
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Eliminar artículo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            //Ingresrar articulos
            if (opcion == 1) {
                System.out.print("Ingrese el nombre del artículo: ");
                String articulo = scanner.nextLine();
                listaCompras.add(articulo);
                System.out.println("Artículo agregado con éxito.");
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del artículo a eliminar: ");
                String articuloEliminar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < listaCompras.size(); i++) {
                    if (listaCompras.get(i).equals(articuloEliminar)) {
                        listaCompras.remove(i);
                        System.out.println("Artículo eliminado.");
                        encontrado = true;
                        break;
                    }
                }
                //Mostrar  lista de  compras
                if (!encontrado) {
                    System.out.println("Artículo no encontrado.");
                }
            } else if (opcion == 3) {
                if (listaCompras.isEmpty()) {
                    System.out.println("La lista está vacía.");
                } else {
                    System.out.println("Lista de compras:");
                    for (int i = 0; i < listaCompras.size(); i++) {
                        System.out.println(listaCompras.get(i));
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por su compra!");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}