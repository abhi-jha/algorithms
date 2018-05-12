package abhishek.algorithms.GraphImpl;

import abhishek.algorithms.Graph.Graph;
import abhishek.algorithms.Graph.Node;

import java.util.List;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
public class GraphImpl implements Graph{

    List<Node> nodes;

    @Override
    public void displayGraph() {

    }

    @Override
    public Boolean deleteANode(Node node) {
        return null;
    }

    @Override
    public Boolean addANode(Node node1, Node node2, Integer distance) {
        return node1.setConnectedTo(node2,distance);
    }

    @Override
    public Boolean addAGraph(Graph graph) {

        return null;
    }
}
