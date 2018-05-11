package abhishek.algorithms.Graph;

import java.util.HashMap;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
public interface Node {
    /**
     * Display the contents of a node
     */
    void showNode();

    /**
     *
     * @param node
     * @return A distance metric between the nodes
     */
    Integer distanceFromANode(Node node);

    /**
     *
     * @param node
     * @param distance
     * @return Binary value depending upon wheteher the relation has been set up or not.
     */
    Boolean setConnectedTo(Node node, Integer distance);

    /**
     *
     * @return Node's id
     */
    String getId();

    /**
     * Shows all the nodes reachable from the node(Connected component(s))
     * @param node
     */
    void showReachableNodes(Node node);

    /**
     *
     * @return All the nodes 1 hop away
     */
    HashMap<Node, Integer> getConnectedTo();
}
