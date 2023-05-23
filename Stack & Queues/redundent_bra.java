//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                String s; 
                s = br.readLine();
                
                Solution obj = new Solution();
                int res = obj.checkRedundancy(s);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static int checkRedundancy(String s) {
            // code here
            int a=0;
            Stack<String> st=new Stack<String>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    st.push("(");
                }else if(s.charAt(i)==')'){
                    int r=0;
                    while(st.peek()!="("){
                        st.pop();
                        r++;
                        // if(st.peek()!="+" && st.peek()!="-" && st.peek()!="/" && st.peek()!="*"){ 
                        //     a=1;
                        //     break;
                        // }
                        
                    }
                    if(r<=2){a=1;break;}
                    st.pop();
                        st.push("a");
                }else{
                    st.push(s.charAt(i)+"");
                }
                            //System.out.println(st.peek());
    
            }
            return a;
        }
    }
            
    