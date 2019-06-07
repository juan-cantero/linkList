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
  
  public void setElement(int pos, int n) {
	  if(!this.isEmpty() && pos < size) {
	  
	  
	  IntegerNode current = this.head;
	  for (int i = 0; i < pos -1; i++) {
		  current = current.getNextNode();
	  }
	  current.nextNode.setData(n);
	  }
	 
  }
  
  public void emptyList() {
	  this.setHead(null);
  }
  
  public void interchangeFirstAndSecondElement() {
	  if (!this.isEmpty()) {
		  IntegerNode aux = this.head.nextNode;
		  this.head.nextNode = aux.nextNode;
		  aux.nextNode = this.head;
		  this.head = aux;
	  }
  }
  
public void interchangePos(int pos1, int pos2) {
	IntegerNode current1 =this.head;
	IntegerNode current2 = this.head;
	
	for (int i = 0; i < pos1 -1; i++) {
		current1 = current1.nextNode;
	}
	
	for (int j = 0; j < pos2 -1; j++) {
		current2 = current2.nextNode;
	}
	
	IntegerNode t1 = current1.nextNode;
	IntegerNode t2 = current2.nextNode;
	
	current1.nextNode = t1.nextNode;
	current2.nextNode = t2.nextNode;
	t1.nextNode = current2.nextNode;
	t2.nextNode = current1.nextNode;
	current1.nextNode = t2;
	current2.nextNode = t1;
	
	
  }
	
	public void setAll(IntegerLinkList list) {
	this.tail.nextNode = list.head;
	
}

public void deleteOcurrencesOf(int n) {
	int count =0;
	IntegerNode current = new IntegerNode();
	current.nextNode = this.head;
	while (current.nextNode != null) {
		if(current.nextNode.data == n) {
			current.nextNode = (current.nextNode).nextNode;
		if (this.head.data == n) {
			this.head = this.head.nextNode;
		}
			count += 1;
		}
		current = current.nextNode;
	}
	System.out.println(count);
}
  
  
  




}
