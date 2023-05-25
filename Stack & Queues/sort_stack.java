//{ Driver Code Starts
    import java.util.Scanner;
    import java.util.Stack;
    class SortedStack{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                Stack<Integer> s=new Stack<>();
                int n=sc.nextInt();
                while(n-->0)
                s.push(sc.nextInt());
                GfG g=new GfG();
                Stack<Integer> a=g.sort(s);
                while(!a.empty()){
                    System.out.print(a.peek()+" ");
                    a.pop();
                }
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    /*Complete the function below*/
    class GfG{
        public static void sort2(Stack<Integer> s,int a,int c){
          // if(s.size()==0){return;}
            if((s.size()>0 && s.peek()<a) || s.size()==0){
                s.push(a);
                return;
               
            }
            
            int b=s.pop();
            sort2(s,a,c);
             s.push(b);
            
          
           
            
            return;
        }
        public static void sort1(Stack<Integer> s){
            if(s.size()==1){
               
                return;
            }
            int a=s.pop();
            sort1(s);
             sort2(s,a,0);
            
            return;
        }
        public Stack<Integer> sort(Stack<Integer> s)
        {
            //add code here.
            sort1(s);
            return s;
        }
    }