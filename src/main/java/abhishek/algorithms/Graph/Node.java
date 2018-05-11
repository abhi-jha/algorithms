package abhishek.algorithms.Graph;

import java.util.HashMap;

public interface Node {
    void showNode();
    Integer distanceFromANode(Node node);
    Boolean setConnectedTo(Node node, Integer distance);
    String getId();
    void showReachableNodes(Node node);
    HashMap<Node, Integer> getConnectedTo();
}
