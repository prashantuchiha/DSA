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
                int ans = obj.orangesRotting(grid);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to find minimum time required to rot all oranges. 
        public int orangesRotting(int[][] grid)
        {
            // Code here
            int x=grid.length;
            int y=grid[0].length;
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    if(grid[i][j]==0){
                        grid[i][j]=-1;
                    }
                    else if(grid[i][j]==1){
                        grid[i][j]=10;
                    }else{
                        grid[i][j]=0;
                    }
                }
            }
            
             for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   if(grid[i][j]>0){
                       int a=500;int b=500;int c=500;int d=500;
                       if(i-1>=0 && grid[i-1][j]!=-1 && grid[i-1][j]!=10){
                           a=(grid[i-1][j]+1)%10;
                       }
                       if(i+1<x && grid[i+1][j]!=-1 && grid[i+1][j]!=10 ){
                           b=(grid[i+1][j]+1)%10;
                       }
                       if(j-1>=0 && grid[i][j-1]!=-1 && grid[i][j-1]!=10){
                           c=(grid[i][j-1]+1)%10;
                       }
                       if(j+1<y && grid[i][j+1]!=-1 && grid[i][j+1]!=10){
                           d=(grid[i][j+1]+1)%10;
                       }
                       
                       
                        if(a==500 & b==500 && c==500 && d==500){continue;}
    
                       
                       if(grid[i][j]==10){
                       grid[i][j]=grid[i][j]+Math.min(a,Math.min(b,Math.min(c,d)));}
                       else{
                            grid[i][j]=Math.min(grid[i][j],10+Math.min(a,Math.min(b,Math.min(c,d))));}
      
                       }
                   }
                }
            
            
            //  for(int i=0;i<x;i++){
            //     for(int j=0;j<y;j++){
            //       System.out.print(grid[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            
            
              for(int i=x-1;i>=0;i--){
                for(int j=y-1;j>=0;j--){
                   if(grid[i][j]>0){
                       int a=500;int b=500;int c=500;int d=500;
                        if(i-1>=0 && grid[i-1][j]!=-1 && grid[i-1][j]!=10){
                           a=(grid[i-1][j]+1)%10;
                       }
                       if(i+1<x && grid[i+1][j]!=-1 && grid[i+1][j]!=10 ){
                           b=(grid[i+1][j]+1)%10;
                       }
                       if(j-1>=0 && grid[i][j-1]!=-1 && grid[i][j-1]!=10){
                           c=(grid[i][j-1]+1)%10;
                       }
                       if(j+1<y && grid[i][j+1]!=-1 && grid[i][j+1]!=10){
                           d=(grid[i][j+1]+1)%10;
                       }
                       
                       if(a==500 & b==500 && c==500 && d==500){continue;}
                       
                       if(grid[i][j]==10){
                       grid[i][j]=grid[i][j]+Math.min(a,Math.min(b,Math.min(c,d)));}
                       else{
                            grid[i][j]=Math.min(grid[i][j],10+Math.min(a,Math.min(b,Math.min(c,d))));}
                   }
                }
            }
            
            
            
            
            
            // for(int i=0;i<x;i++){
            //     for(int j=0;j<y;j++){
            //       System.out.print(grid[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            
            int a=0;int s=0;
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   a=Math.max(a,grid[i][j]);
                   if(grid[i][j]==10){
                       return -1;
                   }
                }
            }
            
            
            
            if(a==10){return -1;}
            return a-10;
            
            
            
            
            
            
            
            
        }
    }