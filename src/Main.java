public class Main {

  public static void main(String[] args) {
    IntegerLinkList list = new IntegerLinkList();

    list.addToFront(4);
    list.addToFront(5);
    list.addToFront(6);
    list.addToFront(7);
    list.addToFront(8);
    

    
    list.add(2, 55);
    
    list.printList();
    list.delete(2);
    list.printList();
    
    System.out.println(list.getAt(2));

  }
}
