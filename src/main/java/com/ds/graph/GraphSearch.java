package com.ds.graph;

public class GraphSearch {

	public static void main(String[] args) {

		/*
		 * A
		 * |__B -- F -- H
		 * |__C
		 * |__D -- G -- I
		 * |__E 
		 */
		Graph graph = new Graph();

		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');
		graph.addVertex('I');

		graph.addEdge(0, 1); // AB
		graph.addEdge(0, 2); // AC
		graph.addEdge(0, 3); // AD
		graph.addEdge(0, 4); // AE

		graph.addEdge(1, 5); // BF
		graph.addEdge(3, 6); // DG

		graph.addEdge(5, 7); // FH
		graph.addEdge(6, 8); // GI

		System.out.println("\nDepth First Search");
		graph.dfs();

		System.out.println("\n\nBreadth First Search");
		graph.bfs();
	}
}
