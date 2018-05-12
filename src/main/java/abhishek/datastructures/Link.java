package abhishek.datastructures;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
public class Link{
    Link next;
    String name;
    String age;

    public Link(){

    }

    public Link(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
