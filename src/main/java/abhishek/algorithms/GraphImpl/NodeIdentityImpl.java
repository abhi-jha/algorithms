package abhishek.algorithms.GraphImpl;

import abhishek.algorithms.Graph.NodeIdentity;

public class NodeIdentityImpl implements NodeIdentity {
    String name;
    String age;
    String weight;
    String height;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String getHeight() {
        return height;
    }

    @Override
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public void displayIdentity() {
        System.out.println(toString());
    }

    @Override
    public NodeIdentity updateIdentity(NodeIdentity nodeId) {
        this.name = nodeId.getName();
        this.age = nodeId.getAge();
        this.height = nodeId.getHeight();
        this.weight = nodeId.getWeight();
        return this;
    }

    @Override
    public String toString() {
        return "NodeIdentityImpl{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
