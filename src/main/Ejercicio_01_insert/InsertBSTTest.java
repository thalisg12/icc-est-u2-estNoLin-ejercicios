package main.Ejercicio_01_insert;

import java.util.LinkedList;
import java.util.Queue;

import main.Materia.Models.Node;

public class InsertBSTTest {

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;

    }

    public void printPorNiveles(Node root) {
        if (root == null)
            return;

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int tamañoNivel = cola.size();

            for (int i = 0; i < tamañoNivel; i++) {
                Node actual = cola.poll();
                System.out.print(actual.getValue() + "  ");

                if (actual.getLeft() != null)
                    cola.add(actual.getLeft());
                if (actual.getRight() != null)
                    cola.add(actual.getRight());
            }

            System.out.println();
        }
    }

}
