public class IntegerLinkList {

  private IntegerNode head;
  private IntegerNode tail;
  private int size =  0;

  public IntegerLinkList(){}

  public IntegerNode getHead() {

    return head;

  }

  public void setHead(IntegerNode head) {

    this.head = head;

  }

  public IntegerNode getTail() {

    return tail;

  }

  public void setTail(IntegerNode tail) {
    this.tail = tail;
  }

  public boolean isEmpty() {
    return  head == null && tail == null ;

  }

  public void addToFront(int n) {
    IntegerNode node = new IntegerNode();
    node.setData(n);
    if (this.isEmpty()) {
      head = node;
      tail = node;
    }
    else {
      node.nextNode = head;
      head = node;
    }
    size += 1;

  }

  public void addToEnd(int n) {
    if (this.isEmpty()) {
      addToFront(n);
    }
    else {
      IntegerNode node = new IntegerNode();
      node.setData(n);
      tail.nextNode = node;
      tail = node;

    }

    size += 1;
  }
  public int getAt(int index) {
    IntegerNode current = head;
    for (int i = 0; i < index ; i++) {
      current = current.getNextNode();
    }
    return current.data;
  }

//  public void add(int index, int n) {}




}
