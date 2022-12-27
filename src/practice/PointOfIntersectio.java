package practice;

import java.util.LinkedList;

public class PointOfIntersectio {
	
	public static int pointOfIntersection(Node node1,Node node2) {
		int pointerNode=0;
		int l1=0,l2=0;
		Node k1 = node1;
		Node k2 = node2;
		
		while(k1!=null) {
			l1++;
			k1=k1.next;
		}
		while(k2!=null) {
			l2++;
			k2=k2.next;
		}
		int diff = Math.abs(l1-l2);
		
	   for(int i =0 ;i<diff;i++) {
		   if(node1==null ) {
			   System.out.println("No intersection point");
		   }
		   node1=node1.next;
	   }
	   
	   while(node1!=null && node2!=null) {
		   if(node1.data==node2.data) {
			   
			   pointerNode= node2.data;
			   break;
		   }
		   node1=node1.next;
		   node2=node2.next;
	   }
	return pointerNode;
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
     int pointOfIntersection=   PointOfIntersectio.pointOfIntersection(node1,node2);
     System.out.println("Point of intersection is "+pointOfIntersection);
     
		
		
	}
}
