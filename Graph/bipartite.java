import java.util.*;
public class bipartite {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        //vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        //vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        //vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        //vertex 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        //vertex 4

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int[] col = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            col[i] = -1; // colo is not assigned
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0; //green
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextCOl = col[curr] == 0 ? 1 : 0; //  if curr = 0 then dest ==  1;
                            col[e.dest] = nextCOl; // colo assing to dest
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
            
        }
        return true;
    }
   
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
