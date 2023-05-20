//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
    
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                System.out.println(
                    new Solution().infixToPostfix(br.readLine().trim()));
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        // Function to convert an infix expression to a postfix expression.
        public static String infixToPostfix(String exp) {
            // Your code here
            String ans="";
            Stack<String> s=new Stack<String>();
            for(int i=0;i<exp.length();i++){
                if(exp.charAt(i)=='+'){
                    while(!s.isEmpty() && (s.peek()=="-" || s.peek()=="*" || s.peek()=="/" || s.peek()=="^" || s.peek()=="+")){
                        ans=ans.concat(s.pop());
                    }
                    s.add("+");
                }
                else if(exp.charAt(i)=='-'){
                     while(!s.isEmpty() && (s.peek()=="+" || s.peek()=="*" || s.peek()=="/" || s.peek()=="^" || s.peek()=="-")){
                        ans=ans.concat(s.pop());
                    }
                    s.add("-");
                }
                else if(exp.charAt(i)=='*'){
                     while(!s.isEmpty() && (s.peek()=="/" || s.peek()=="^" || s.peek()=="*")){
                        ans=ans.concat(s.pop());
                    }
                    s.add("*");
                }
                else if(exp.charAt(i)=='/'){
                     while(!s.isEmpty() && (s.peek()=="*" || s.peek()=="^" || s.peek()=="/")){
                        ans=ans.concat(s.pop());
                    }
                    s.add("/");
                }
                else if(exp.charAt(i)=='^'){
                    s.add("^");
                }
                else if(exp.charAt(i)=='('){
                    s.add("(");           
                }
                else if(exp.charAt(i)==')'){
                     while(!s.isEmpty() && (s.peek()!="(")){
                        ans=ans.concat(s.pop());
                    }
                    s.pop();
                   
                }
                else{
                    ans=ans.concat(exp.charAt(i)+"");
                }
              
    
    
            }
              while(!s.isEmpty()){
                    ans=ans.concat(s.pop());
                }
            return ans;
        }
    }