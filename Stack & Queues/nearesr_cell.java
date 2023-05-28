//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                int[][] grid = new int[n][m];
                for(int i = 0; i < n; i++){
                    String[] S = br.readLine().trim().split(" ");
                    for(int j = 0; j < m; j++){
                        grid[i][j] = Integer.parseInt(S[j]);
                    }
                }
                Solution obj = new Solution();
                int[][] ans = obj.nearest(grid);
                for(int i = 0; i < ans.length; i++){
                    for(int j = 0; j < ans[i].length; j++){
                        System.out.print(ans[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to find distance of nearest 1 in the grid for each cell.
        public int[][] nearest(int[][] grid)
        {
            // Code here
            int x=grid.length;
            int y=grid[0].length;
            int[][] g=new int[x][y];
            
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    if(grid[i][j]==0){
                    g[i][j]=Math.max(x,y);}
                }
            }
            
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   if(grid[i][j]==1){
                       g[i][j]=0;
                   }else{
                       int a=500;int b=500;int c=500;int d=500;
                       if(i-1>=0 ){
                           a=g[i-1][j]+1;
                       }
                       if(i+1<x ){
                           b=g[i+1][j]+1;
                       }
                       if(j-1>=0 ){
                           c=g[i][j-1]+1;
                       }
                       if(j+1<y ){
                           d=g[i][j+1]+1;
                       }
                       
                       g[i][j]=Math.min(a,Math.min(b,Math.min(c,d)));
                   }
                }
            }
            
             for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   if(grid[i][j]==1){
                       g[i][j]=0;
                   }else{
                       int a=500;int b=500;int c=500;int d=500;
                       if(i-1>=0 ){
                           a=g[i-1][j]+1;
                       }
                       if(i+1<x ){
                           b=g[i+1][j]+1;
                       }
                       if(j-1>=0 ){
                           c=g[i][j-1]+1;
                       }
                       if(j+1<y ){
                           d=g[i][j+1]+1;
                       }
                       
                       g[i][j]=Math.min(a,Math.min(b,Math.min(c,d)));
                   }
                }
            }
            
            
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   if(grid[i][j]==1){
                       g[i][j]=0;
                   }else{
                       int a=500;int b=500;int c=500;int d=500;
                       if(i-1>=0 ){
                           a=g[i-1][j]+1;
                       }
                       if(i+1<x ){
                           b=g[i+1][j]+1;
                       }
                       if(j-1>=0 ){
                           c=g[i][j-1]+1;
                       }
                       if(j+1<y ){
                           d=g[i][j+1]+1;
                       }
                       
                       g[i][j]=Math.min(a,Math.min(b,Math.min(c,d)));
                   }
                }
            }
            
            
            
            
            return g;
        }
    }