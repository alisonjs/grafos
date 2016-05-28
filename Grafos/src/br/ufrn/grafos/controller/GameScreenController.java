/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.controller;

import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.entity.Graph;
import br.ufrn.grafos.entity.Vertice;

/**
 *
 * @author Alison
 */
public class GameScreenController {

    public Graph generateGraph(int rows, int columns) {
        Graph graph = new Graph();
        for (int currentRow = 0; currentRow < rows; currentRow++) {
            for (int currentColumn = 0; currentColumn < columns; currentColumn++) {
                Vertice origin = new Vertice(currentRow, currentColumn);
                Vertice destiny;
                if (currentColumn + 1 != columns) {
                    destiny = new Vertice(currentRow, currentColumn + 1);
                    graph.addEdge(new Edge(origin, destiny));
                }
                if (currentRow + 1 != rows) {
                    destiny = new Vertice(currentRow + 1, currentColumn);
                    graph.addEdge(new Edge(origin, destiny));
                }
            }
        }
        return graph;
    }
}
