package Graphs;
import java.util.*;

public class Cheapestflight {

    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s,int d,int wt){
            this.src =s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[],int flight[][]){

        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        for(int i=0;i<flight.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }

    }
    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stops=s;
        }
    }
    public static int dijkstra(int v,int flight[][],int src,int dest,int k){
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph, flight);

        int dist[] = new int[v];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0,0,0));

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);

                int u = e.src;
                int d = e.dest;
                int wt = e.wt;

                if(curr.cost+wt<dist[d] && curr.stops<=k){
                    dist[d] = curr.cost+wt;
                    q.add(new Info(d,dist[d], curr.stops+1));
                }
            }
        }

        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }

    }
    public static void main(String args[]){
        int v=4;
        int flight[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src= 0,dest=3,k=1;
        System.out.println(dijkstra(v,flight,src,dest,k));
    }
}
