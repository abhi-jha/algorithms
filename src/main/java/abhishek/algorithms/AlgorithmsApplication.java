package abhishek.algorithms;

import abhishek.algorithms.searchingandsorting.BubbleSort;
import abhishek.datastructures.Graph.Graph;
import abhishek.datastructures.Link;
import abhishek.datastructures.LinkedList;
import abhishek.datastructures.Stack;
import abhishek.datastructures.Graph.GraphImpl.GraphImpl;
import abhishek.datastructures.Graph.GraphImpl.NodeImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
@SpringBootApplication
public class AlgorithmsApplication {

	public static void main(String[] args) {

		// SpringApplication.run(AlgorithmsApplication.class, args);
        NodeImpl n0 = new NodeImpl();
        n0.setId("0");
        NodeImpl n1 = new NodeImpl();
        n1.setId("1");
        NodeImpl n2 = new NodeImpl();
        n2.setId("2");
        NodeImpl n3 = new NodeImpl();
        n3.setId("3");
        NodeImpl n4 = new NodeImpl();
        n4.setId("4");
        NodeImpl n5 = new NodeImpl();
        n5.setId("5");
        NodeImpl n6 = new NodeImpl();
        n6.setId("6");
        NodeImpl n7 = new NodeImpl();
        n7.setId("7");
        NodeImpl n8 = new NodeImpl();
        n8.setId("8");


        n0.setConnectedTo(n1,4);
        n0.setConnectedTo(n7,8);

        n7.setConnectedTo(n1,11);
        n7.setConnectedTo(n8,7);
        n7.setConnectedTo(n6, 1);
        n7.setConnectedTo(n0,8);

        n2.setConnectedTo(n1,8);
        n2.setConnectedTo(n8,2);
        n2.setConnectedTo(n5,4);
        n2.setConnectedTo(n3,7);

        n3.setConnectedTo(n2,7);
        n3.setConnectedTo(n5,14);
        n3.setConnectedTo(n4,9);

        n4.setConnectedTo(n3,9);
        n4.setConnectedTo(n5,10);

        n5.setConnectedTo(n4,10);
        n5.setConnectedTo(n3,14);
        n5.setConnectedTo(n2,4);
        n5.setConnectedTo(n6,2);

        n1.setConnectedTo(n0,4);
        n1.setConnectedTo(n7,11);
        n1.setConnectedTo(n2,8);

        n6.setConnectedTo(n7,1);
        n6.setConnectedTo(n8,6);
        n6.setConnectedTo(n5,2);

        n8.setConnectedTo(n7,7);
        n8.setConnectedTo(n6,6);
        n8.setConnectedTo(n2,2);

        System.out.println(n1.setConnectedTo(n8,89));
        System.out.println(n1.setConnectedTo(n8,89));
        //n1.showNode();
        n0.showReachableNodes(n7);

        Graph graph = new GraphImpl();

        useStack();
        useLinkedList();
        useBubbleSort();
	}

	public static void useStack(){
	    Stack stack = new Stack(45);
	    stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        while(!stack.isEmpty())
            System.out.println(stack.pop());

    }

    public static void useLinkedList(){
        LinkedList linkedList = new LinkedList();
        Link l1 = new Link();
        l1.setAge("1");
        l1.setName("a");

        Link l2 = new Link();
        l2.setAge("2");
        l2.setName("b");

        Link l3 = new Link();
        l3.setAge("3");
        l3.setName("c");

        Link l4 = new Link();
        l4.setAge("4");
        l4.setName("d");

        Link l5 = new Link();
        l5.setAge("5");
        l5.setName("e");

        Link l6 = new Link();
        l6.setAge("6");
        l6.setName("f");

        linkedList.addALink(l1);
        linkedList.addALink(l2);
        linkedList.addALink(l3);
        linkedList.addALink(l4);
        linkedList.addALink(l5);
        linkedList.addALink(l6);

        linkedList.removeALink(l3);
        linkedList.printLinkedList();

	}

	public static void useBubbleSort(){
	    int[] array = {32,4,2,34,-34,5,7,7,7};

        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.bubbleSort(array);


        for(int  i = 0 ; i < array.length; i++)
            System.out.println(array[i]);
    }
}
