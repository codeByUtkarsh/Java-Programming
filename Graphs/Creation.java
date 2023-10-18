package Graphs;

import java.util.*;

public class Creation {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    // Breadth First Search or Level Order Traversal

    // public static void bfs(ArrayList<Edge>[] graph) {
    //     Queue<Integer> q = new LinkedList<>();
    //     boolean vis[] = new boolean[graph.length];

    //     q.add(0); // Source =0;

    //     while (!q.isEmpty()) {
    //         int curr = q.remove();

    //         if (!vis[curr]) {
    //             System.out.print(curr + " ");
    //             vis[curr] = true;
    //             for (int i = 0; i < graph[curr].size(); i++) {
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }

    public static boolean dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (dfsUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<Edge>[] graph, boolean vis[], int curr , int par){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                if(dfsUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                
            }
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        int Vertex = 5;
        // int arr[] = new int[V];

        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        // right now the array is stored with null value;

        for (int i = 0; i < Vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0--> Vertex
        graph[0].add(new Edge(0, 1));

        // 1--> Vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // 2--> Vertex
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        // 3--> Vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

        // 4--> Vertex
        graph[4].add(new Edge(4, 2));

        // 2's neighbour
        // for(int i=0;i<graph[2].size();i++){
        // Edge e = graph[2].get(i);
        // System.out.println(e.dest);
        // }

        System.out.println(dfs(graph));
    }

}
