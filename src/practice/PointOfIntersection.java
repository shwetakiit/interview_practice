package practice;

import java.util.ArrayList;

import kumari.shweta.interface1;


class Node{
	
	int data ;
	Node next;
	Node(int data){
		this.data=data;
	}
	
}

public class PointOfIntersection {
	
	

public void findPointOfIntersection(Node node1,Node node2) {
	ArrayList<Node> list= new ArrayList<Node>();
	while(node1!=null) {
		list.add(node1);
		node1=node1.next;
		
		
	}
	
	for(int i =0 ;i<list.size();i++ ) {
		
		Node node = list.get(i);
		System.out.println("List is "+node.data);
	}
	System.out.println("List is "+list.size());
	while(node2 != null ) {
		System.out.println(node2.data);
		if(list.contains(node2)) {
			System.out.println("Point of intersection is "+list);
			System.out.println("Point of intersection is "+node2.data);
			break;
		}
		node2=node2.next;
	}
	
	
}
	public static void main(String[] args) {
		
		Node node1 = new Node(3);
		node1.next = new Node(6);
		node1.next.next = new Node(9);
	    node1.next.next.next= new Node(15);
	    node1.next.next.next.next=new Node(30);
	    Node node2 = new Node(10);
	    node2.next=node1.next.next.next;
        node2.next.next= node1.next.next.next.next;
        PointOfIntersection object = new PointOfIntersection();
        object.findPointOfIntersection(node1,node2);
        
        
        

		
		
	}

}
