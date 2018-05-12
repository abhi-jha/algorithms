package abhishek.algorithms.Graph;

/**
 * @author Abhishek Jha
 */
public interface Graph {
    /**
     *
     */
    public void displayGraph();

    /**
     *
     * @param node
     * @return
     */
    public Boolean deleteANode(Node node);

    /**
     *
     * @param node1
     * @param node2
     * @param distance
     * @return
     */
    public Boolean addANode(Node node1, Node node2, Integer  distance);

    /**
     *
     * @param graph
     * @return
     */
    public Boolean addAGraph(Graph graph);
}
