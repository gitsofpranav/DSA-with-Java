import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class topo {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> []graph){
        for(int i=0; i<graph.length; i++){
         graph[i] = new ArrayList<>();
        }
        //vertex 2
        graph[2].add(new Edge(2, 3));

        //vertex 3
        graph[3].add(new Edge(3, 1));

        //vertex 4
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        //vertex 5
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcIndeg(ArrayList<Edge> []graph, int[] indeg ){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topS(ArrayList<Edge> []graph){
        int[] indeg = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+ " ");
            for(int i=0; i<graph[curr].size(); i++){
                Edge e =  graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void printAllPath(ArrayList<Edge> []graph, int src, int dest, String path){
        if(src == dest){
            System.out.print(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);

            printAllPath(graph, e.dest, dest, path+src);
        }
    }
    public static void main(String[] args) {
        
            int V =6;
            ArrayList<Edge> []graph = new ArrayList[V];
            createGraph(graph);
            int src = 5, dest = 1;
            printAllPath(graph, src, dest, "");
    
        
        
    }
}
