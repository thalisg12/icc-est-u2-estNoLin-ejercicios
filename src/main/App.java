package main;

import java.util.LinkedList;
import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {

    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println(" Estudiante: " + estudiante.nombre());
        System.out.println("  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n Ejercicio 1: Insertar en Árbol Binario de Búsqueda (BST)");
        InsertBSTTest bst = new InsertBSTTest();
        Node root1 = null;
        int[] valores1 = { 5, 3, 7, 2, 4, 6, 8 };
        for (int val : valores1) {
            root1 = bst.insert(root1, val);
        }
        bst.printPorNiveles(root1);

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n Ejercicio 2: Invertir Árbol Binario");
        Node root2 = new Node(4);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(7));
        root2.getLeft().setLeft(new Node(1));
        root2.getLeft().setRight(new Node(3));
        root2.getRight().setLeft(new Node(6));
        root2.getRight().setRight(new Node(9));

        Node invertido = InvertBinaryTree.invertTree(root2);
        bst.printPorNiveles(invertido);

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n Ejercicio 3: Listar Niveles en Listas Enlazadas");
        Node root3 = new Node(4);
        root3.setLeft(new Node(2));
        root3.setRight(new Node(7));
        root3.getLeft().setLeft(new Node(1));
        root3.getLeft().setRight(new Node(3));
        root3.getRight().setLeft(new Node(6));
        root3.getRight().setRight(new Node(9));

        List<LinkedList<Integer>> niveles = ListLevels.listLevels(root3);
        int nivel = 1;
        for (LinkedList<Integer> lista : niveles) {
            System.out.print("Nivel " + nivel++ + ": ");
            for (int val : lista) {
                System.out.print(val + " -> ");
            }
            System.out.println("null");
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n Ejercicio 4: Calcular Profundidad Máxima del Árbol");
        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        root4.getLeft().getLeft().setLeft(new Node(8));

        int profundidad = Depth.maxDepth(root4);
        System.out.println("Profundidad máxima: " + profundidad);

        System.out.println("-------------------------------------------------------------");
    }
}
