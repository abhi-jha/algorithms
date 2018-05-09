package abhsihek.algorithms.GraphImpl;

import abhsihek.algorithms.Graph.Node;

import java.util.*;

public class NodeImpl implements Node{


    private String id;
    private HashMap<Node, Integer> connectedTo;

    private static List<Node> scannedNodes =  scannedNodes = new ArrayList<>();;

    public NodeImpl() {

    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public HashMap<Node, Integer> getConnectedTo() {
        return connectedTo;
    }
    @Override
    public void setConnectedTo(Node node, Integer distance) {
        if(this.connectedTo == null)
            this.connectedTo = new LinkedHashMap<>();
        if(node!=null&&(node.distanceFromANode(this)!=null)) {
            //If a relation already exists.
            this.connectedTo.put(node, node.distanceFromANode(this));
            return;
        }
        this.connectedTo.put(node, distance);
        node.setConnectedTo(this, distance);
    }

    @Override
    public void showNode() {
        System.out.print("{ Head id  : "+ this.getId() +", distance : " + this.connectedTo.get(this) + " }-->");
        Collection<Node> keys = this.connectedTo.keySet();
        for(Node key: keys){
            System.out.print("::{ id : " + key.getId()+", distance : " + this.connectedTo.get(key) + " }");
        }
        System.out.println();
    }


    @Override
    public Integer distanceFromANode(Node node) {
        if(this.connectedTo!=null)
            return this.connectedTo.get(node);
        return null;
    }

    @Override
    public void showReachableNodes(Node node){
        HashMap<Node, Integer> nodes = node.getConnectedTo();
        if(scannedNodes.contains(node))
            return;
        scannedNodes.add(node);
        node.showNode();
        if( nodes != null && !nodes.isEmpty()){
            Collection<Node> keys = node.getConnectedTo().keySet();
            for(Node key: keys){
                key.showReachableNodes(key);
            }

        }
    }
    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + '}';
    }
}
