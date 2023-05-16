//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to evaluate a postfix expression.
        public static int evaluatePostFix(String S)
        {
            // Your code here
            int ans=0;
             Stack<Integer> stack = new Stack<Integer>();
              for (int i = 0; i < S.length(); i++) {
     
                if(S.charAt(i)=='*'){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a*b);
                }
                else if(S.charAt(i)=='/'){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b/a);
                }
                else if(S.charAt(i)=='+'){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a+b);
                }
                else if(S.charAt(i)=='-'){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b-a);
                }
                else{
                    stack.push(Integer.parseInt(S.charAt(i)+""));
                }
            
            }
            ans=stack.pop();
            return ans;
        }
    }