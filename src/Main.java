public class Main {

  public static void main(String[] args) {
    IntegerLinkList list = new IntegerLinkList();

    list.addToFront(4);
    list.addToFront(3);
    list.addToFront(2);
    list.addToFront(1);
    list.addToFront(0);
    

    
    
    
    list.printList();
    
    
    list.interchangePos(1,4 ); 
    list.printList();
    
    

  }
}
