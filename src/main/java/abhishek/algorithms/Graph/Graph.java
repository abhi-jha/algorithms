package abhishek.algorithms.Graph;

public interface Graph {
    public void displayGraph(Graph graph);
    public Boolean deleteANode(Graph graph, Node node);
    public Boolean addANode(Graph graph, Node node, Integer  distance);
}
