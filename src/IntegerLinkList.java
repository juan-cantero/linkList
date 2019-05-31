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
  
  public int size() {
	  return this.size;
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

  public void add(int index, int n) {
	  if (index >= size) {
		  this.addToEnd(n);
	  }
	  else {
		  IntegerNode node = new IntegerNode();
		  node.data = n;
		  IntegerNode current = this.head;
		  for (int i = 0; i < index -1; i++) {
			  current = current.getNextNode();
		  }
		  node.nextNode = current.getNextNode();
		  current.nextNode = node;
		  
	  }
  }
  
  public void delete(int pos) {
	  if (!this.isEmpty()) {
		  IntegerNode current = head;
		  for (int i = 0; i < pos -1; i++) {
			  current = current.getNextNode();
		  }
		  current.nextNode = (current.nextNode).nextNode;
	  }
	 
  }
  
  public void printList() {
	  IntegerNode current = this.head;
	  System.out.print("head --> ");
	  while (current != null) {
		  System.out.print(current.getData() + " " );
		  current = current.nextNode;
		  
		  
	  }
  }
  
  public void emptyList() {
	  this.setHead(null);
  }
  
  




}
