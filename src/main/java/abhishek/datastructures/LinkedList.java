package abhishek.datastructures;

/**
 * @author Abhsihek Jha
 * @since 1.0
 * @version 1.0
 */
public class LinkedList {
    Link head;

    public void addALink(Link newlink){

        if(head == null) {
            head = newlink;
            return;
        }

        Link current = head;

        while(current.getNext()!=null)
            current = current.next;

        current.next = newlink;
    }

    public Link removeALink(Link newLink){
        Link current = head;
        Link prev = head;
        while(current.getNext()!=null){
            if(current.getName().equals(newLink.getName()) && current.getAge().equals(newLink.getAge())) {
                break;
            }
            prev = current;
            current = current.getNext();
        }

        prev.setNext(current.getNext());

        return newLink;
    }

    public void printLinkedList(){
        Link current = head;
        while(current!=null){
            System.out.print(current + "-->");
            current = current.getNext();
            if(current.getNext()==null){
                System.out.print(current);
                break;
            }
        }
    }
}
