package dsdefaultprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class GraphSearch {
    LinkedList<Integer> adj[];
    int v;

    GraphSearch(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void edge(int x, int y) {
        adj[x].add(y);
    }

    void breadthFirstSearch(int sourceOfVertex) {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[sourceOfVertex] = true;
        queue.add(sourceOfVertex);
        while (!queue.isEmpty()) {
            sourceOfVertex = queue.poll();
            System.out.print(sourceOfVertex + " ");
            Iterator i = adj[sourceOfVertex].iterator();
            while (i.hasNext()) {
                int n = (int) i.next();
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }

            }
        }
    }

    void depthFirstSearch(int sourceOfVertex) {
        boolean[] visited = new boolean[v];
        Stack<Integer> a1 = new Stack<>();
        a1.push(sourceOfVertex);
        int node;
        while (!a1.isEmpty()) {
            sourceOfVertex = a1.peek();
            a1.pop();
            for (int i = 0; i < adj[sourceOfVertex].size(); i++) {
                node = adj[sourceOfVertex].get(i);
                if (!visited[node])
                    a1.push(node);
            }
            if(!visited[sourceOfVertex])
                System.out.print(sourceOfVertex + " ");
                visited[sourceOfVertex] = true;
        }

    }

    public static void main(String[] args) {
        GraphSearch graphSearch = new GraphSearch(6);
        graphSearch.edge(0, 1);
        graphSearch.edge(0, 2);
        graphSearch.edge(0, 5);
       
        graphSearch.edge(1, 0);
        graphSearch.edge(1, 2);
       
        graphSearch.edge(2, 0);
        graphSearch.edge(2, 1);
        graphSearch.edge(2, 3);
        graphSearch.edge(2, 4);
       
        graphSearch.edge(3, 2);
       
        graphSearch.edge(4, 2);
        graphSearch.edge(4, 5);
       
        graphSearch.edge(5, 0);
        graphSearch.edge(5, 4);

        System.out.println("BFS Result");
        graphSearch.breadthFirstSearch(0);
        System.out.println();
        System.out.println("DFS Result");
        graphSearch.depthFirstSearch(0);


    }

}
