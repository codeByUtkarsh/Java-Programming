package Graphs;

import java.util.*;

public class Articulation {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int time, int[] dt, int[] low, boolean[] vis) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (par == neigh) {
                continue;
            }else if(!vis[curr]) {
                dfs(graph, neigh, curr, time, dt, low, vis);
                low[curr] = Math.min(low[curr], low[neigh]);
                System.out.println("print ho na");
                if (par != -1 && dt[curr] <= low[neigh]) {
                    System.out.print("Articulation Point :" + curr);
                }
                children++;
            }else{
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
        if (par == -1 && children > 1) {
            System.out.println("Articulation Point:" + curr);
        }

    }

    public static void articulationPoint(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;

        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, time, dt, low, vis);
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        articulationPoint(graph, V);
    }
}
