package abhishek.algorithms;

import abhishek.algorithms.GraphImpl.NodeImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        //n1.showNode();
        n0.showReachableNodes(n0);

	}
}
