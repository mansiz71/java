public class Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node firstNode=new Node(3);
        Node secondNode=new Node(5);
        Node thirdNode=new Node(13);
        Node fourthNode=new Node(2);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        Node currentNode=firstNode;
        while (currentNode!=null) {
        System.out.println(currentNode.data+"->");
        currentNode=currentNode.next;
            
        }
        System.out.println("null");
    }
}
