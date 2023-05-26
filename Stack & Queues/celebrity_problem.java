//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int a=0;int b=1;
        for(int i=1;i<n;i++){
            if(M[0][i]==1 && M[i][a]==0){
                a=i;
                
            }
        }
        for(int i=1;i<n;i++){
            if(M[a][i]==1){
                b=-1;
                break;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=M[i][a]; 
        }
        if(sum!=n-1){
            b=-1;
        }
        if(b==1){return a;}
    	return b;
    }
}