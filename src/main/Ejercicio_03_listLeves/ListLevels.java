package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    public static List<LinkedList<Integer>> listLevels(Node root) {
        List<LinkedList<Integer>> resultado = new ArrayList<>();
        if (root == null)
            return resultado;

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int tamañoNivel = cola.size();
            LinkedList<Integer> nivel = new LinkedList<>();

            for (int i = 0; i < tamañoNivel; i++) {
                Node actual = cola.poll();
                nivel.add(actual.getValue());

                if (actual.getLeft() != null)
                    cola.add(actual.getLeft());
                if (actual.getRight() != null)
                    cola.add(actual.getRight());
            }
            resultado.add(nivel);
        }
        return resultado;
    }

}
