//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
     int n=S.length();
     Stack<Integer> s=new Stack<Integer>();
     s.push(-1);
     int r=0;
     for(int i=0;i<S.length();i++){
         if(S.charAt(i)=='('){
             s.push(i);
         }else{
             if(!s.empty()){
                 s.pop();
             }
             if(!s.empty()){
                 r=Math.max(r,i-s.peek());
             }else{
                 s.push(i);
             }
         }
    }
    return r;
    }
}