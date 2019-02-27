package com.ds.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	private final int MAX_VERTS = 20;

	private Vertex[] vertexList;

	private int[][] adjMatrix;

	private int nVerts;

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];

		nVerts = 0;
	}

	public void addVertex(char label) {
		vertexList[nVerts++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.print(vertexList[v].label + " ");
	}

	public void dfs() {
		Stack<Integer> stack = new Stack<Integer>();
		vertexList[0].wasVisited = true;
		displayVertex(0);

		stack.push(0);
		while (!stack.isEmpty()) {
			int v = getAdjacentUnvisitedVertex(stack.peek());
			if (v == -1) {
				stack.pop();
			} else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}

		// Reset visit status
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}
	}

	public int getAdjacentUnvisitedVertex(int v) {
		for (int j = 0; j < nVerts; j++) {
			if (adjMatrix[v][j] == 1 && vertexList[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		vertexList[0].wasVisited = true;
		queue.add(0);
		displayVertex(0);

		while (!queue.isEmpty()) {
			int v = getAdjacentUnvisitedVertex(queue.peek());
			if (v == -1) {
				queue.remove();
			} else {
				vertexList[v].wasVisited = true;
				queue.add(v);
				displayVertex(v);
			}
		}
	}
}
