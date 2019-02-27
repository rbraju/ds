package com.ds.graph;

public class GraphSearch2 {

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
		graph.addVertex('J');

		graph.addEdge(0, 1); // AB
		graph.addEdge(0, 4); // AE
		graph.addEdge(0, 5); // AF
		graph.addEdge(1, 2); // BC

		graph.addEdge(2, 3); // CD
		graph.addEdge(3, 6); // DG

		graph.addEdge(4, 3); // ED
		graph.addEdge(5, 8); // FI
		graph.addEdge(6, 7); // GH
		graph.addEdge(8, 1); // IB

		System.out.println("\nDepth First Search");
		graph.dfs();

		System.out.println("\n\nBreadth First Search");
		graph.bfs();
	}
}
