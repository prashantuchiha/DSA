import java.util.LinkedList;
import java.util.Queue;

public class binary_tree_built{
    public static class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value=value;
            this.right=null;
            this.left=null;
        }
    }


    static class BinaryTree{
        static int idx=-1;
        public static Node binaryTree(int nodes[]){

            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=binaryTree(nodes);
            newNode.right=binaryTree(nodes);
            return newNode;
        }

        public static void preorder(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.value+" ");
            preorder(root.left);
            preorder(root.right);
            return;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
           
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            
            postorder(root.right);
            System.out.print(root.value+" ");
           
        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
                Node q=queue.remove();
                if(q==null){
                    if(queue.isEmpty()){
                        break;
                    }else{
                        queue.add(null);
                        System.out.println();
                    }
                   
                   
                }else{
                    System.out.print(q.value+" ");
                    if(q.left!=null){
                        queue.add(q.left);
                    }
                    if(q.right!=null){
                        queue.add(q.right);
                    }
                }
               
                
            }
        }

        public static int heightofTree(Node root){
            if(root==null){
                return 0;
            }
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            int h=0;
            while(!queue.isEmpty()){
                Node q=queue.remove();
                if(q==null){
                    h+=1;
                    if(queue.isEmpty()){
                        break;
                    }else{
                        queue.add(null);
                    }
                }else{
                    if(q.left!=null){
                        queue.add(q.left);
                    }
                    if(q.right!=null){
                        queue.add(q.right);
                    }
                }
            }
            return h;
        }

        public static int height_Tree(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=height_Tree(root.left);
            int rightheight=height_Tree(root.right);
            return Math.max(leftheight, rightheight)+1;
        }
        
        public int countofNodes(Node root,int[] x){
            if(root==null){
                return 0;
            }
            countofNodes(root.left,x);
            countofNodes(root.right,x);
            x[0]=x[0]+1;
           // System.out.println(x[0]);
            return x[0];

        }

        public static int count_Nodes(Node root){
            if(root==null){
                return 0;
            }
            int leftcount=count_Nodes(root.left);
            int rightcount=count_Nodes(root.right);
            return leftcount+rightcount+1;
        }

        public static int sumofNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sumofNodes(root.left);
            int rightsum=sumofNodes(root.right);
            return leftsum+rightsum+root.value;
        }


        public Node invertTree(Node root) {
            if(root==null){
                return null;
            }
    
            root.right=invertTree(root.left);
            root.left=invertTree(root.right);
    
            return root;
        }

    }
    
  


    public static void main(String[] args) {
        // int nodes[]={4,2,7,1,3,6,9,-1,-1,-1,-1};
        int nodes[]={4,2,1,-1,3,-1,-1,7,6,-1,9,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.binaryTree(nodes);
        //System.out.println(root.value);
        //obj.preorder(root);
        //System.out.print(root.value);
       // obj.inorder(root);
       //obj.levelorder(root);
    //    int[] x=new int[1];
    //    int c=obj.count_Nodes(root);
    //    System.out.println(c);
    //    System.out.println(obj.sumofNodes(root));
    System.out.println(obj.heightofTree(root));
    System.out.println(obj.height_Tree(root));
    obj.invertTree(root);
    }
}