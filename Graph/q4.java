import java.util.*;
public class q4 {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int d, int c){
            this.dest = d;
            this.cost = c;
        }
        @Override
        public int compareTo(Edge E2){
            return this.cost - E2.cost;
        }
    }

    public static int connectingCities(int cities[][]){
        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Edge> pq =  new PriorityQueue<>();
        pq.add(new Edge(0, 0));
        int finalCost = 0;
    

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for(int i=0; i<cities[curr.dest].length; i++){
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;

    }
    public static void main(String[] args) {
        int cities[][] = {{0,1,2,3,4},{1,0,5,0,7},
                         {2,5,0,6,0},{3,0,6,0,0},
                         {4,7,0,0,0}};

       
       System.out.println(connectingCities(cities));
    }
}
