public class flood {

    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int col;

        public Edge( int s, int d, int c){
            this.src = s;
            this.dest = d;
            this.col = c; 

        }
        @Override
        public int compareTo(Edge E2){
            return this.col - E2.col;
        }
    }
    public void helper(int img[][], int sr, int sc, int color,boolean vis[][], int orgCol ){
        if(sr < 0 || sc < 0 || sr >= img.length || sc >= img[0].length || vis[sr][sc] || img[sr][sc] != orgCol){
            return;
        }
        //left
        helper(img, sr, sc-1, color, vis, orgCol);

        //right
        helper(img, sr, sc+1, color, vis, orgCol);

        // up 
        helper(img, sr-1, sc, color, vis, orgCol);


        // down
        helper(img, sr+1, sc, color, vis, orgCol);
    }
    public static void createGraph(int image[][]){

    }

    public int[][] floodFill(int img[][], int sr, int sc, int color){
        boolean vis[][] = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, vis, img[sr][sc]);
    } 
    public static void main(String[] args) {
        int image[][] = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
    }
}
