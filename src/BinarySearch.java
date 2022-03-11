public class BinarySearch {
    // https://www.youtube.com/watch?v=M6lYob8STMI
    Node root;
    public void addNode(int key,String name){
        Node newNode=new Node(key, name);
        if(root==null){
            root=newNode;
        }
        else {
            Node focusNode=root;
            Node parent;
            while (true){
                parent =focusNode;
                if (key<focusNode.Key){
                    focusNode=focusNode.leftChild;
                    if (focusNode==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else {
                    focusNode=focusNode.rightChild;
                    if(focusNode==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode){
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public static void main(String[] args) {
BinarySearch binarySearch=new BinarySearch();
binarySearch.addNode(3,"a");
        binarySearch.addNode(55,"b");
        binarySearch.addNode(1,"f");
        binarySearch.addNode(8,"e");
        binarySearch.addNode(10,"q");
        binarySearch.inOrderTraverseTree(binarySearch.root);



    }
    class Node{
        int Key;
        String name;
        Node leftChild;
        Node rightChild;

        public Node(int key, String name) {
            Key = key;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
