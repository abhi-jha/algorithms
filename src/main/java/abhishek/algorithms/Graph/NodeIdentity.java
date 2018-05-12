package abhishek.algorithms.Graph;

public interface NodeIdentity {
    String getName() ;
    void setName(String name);
    String getAge() ;
    void setAge(String age) ;
    String getWeight() ;
    void setWeight(String weight) ;
    String getHeight() ;
    void setHeight(String height);
    void displayIdentity();
    NodeIdentity updateIdentity(NodeIdentity nodeId);
}
