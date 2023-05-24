//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    
    class IntArray
    {
        public static int[] input(BufferedReader br, int n) throws IOException
        {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            
            return a;
        }
        
        public static void print(int[] a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
        
        public static void print(ArrayList<Integer> a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                int N; 
                N = Integer.parseInt(br.readLine());
                
                
                int[] A = IntArray.input(br, N);
                
                
                int[] B = IntArray.input(br, N);
                
                Solution obj = new Solution();
                int res = obj.isStackPermutation(N, A, B);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static int isStackPermutation(int n, int[] ip, int[] op) {
            // code here
            int a=0;int b=0;
            Stack<Integer> st=new Stack<Integer>();
            
            if(ip.length!=op.length){return 0;}
            
            for(int i=0;i<ip.length;i++){
                if(ip[i]!=op[b]){
                    st.push(ip[i]);
                }else{
                   // st.pop();
                    b++;
                    while(!st.isEmpty() && st.peek()==op[b]){
                        st.pop();
                        b++;
                    }
                    
                }
            }
            //   while(st.peek()==op[b]){
            //             st.pop();
            //             b++;
            //         }
            if(st.isEmpty()){
                return 1;
            }else{return 0;}
            
        }
    }
                
    