package abhishek.algorithms.GraphImpl;

import abhishek.algorithms.Graph.Node;
import abhishek.algorithms.Graph.NodeIdentity;

import java.util.*;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
public class NodeImpl implements Node{


    private String id;
    private HashMap<Node, Integer> connectedTo;

    private static List<Node> scannedNodes =   new ArrayList<>();;

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
    public Boolean setConnectedTo(Node node, Integer distance) {
        if(node!=null&&(node.distanceFromANode(this)!=null && this.distanceFromANode(node)!=null)){
            //False: Both way relation has been setup by now.
            return Boolean.FALSE;
        }
        if(this.connectedTo == null)
            this.connectedTo = new LinkedHashMap<>();
        this.connectedTo.put(node, distance);
        node.setConnectedTo(this, distance);
        return Boolean.TRUE;
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
