class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }

  public int size(){
    return size;
  }


  public boolean add(Integer value){
    if(size == 0){
      start = new Node(value, null, null);
      end = start;
      return true;
    }
    Node n = new Node(value, null, end);
    size++;
    return true;
  }

  public void add(int index, Integer value){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    Node n = new Node(value, getNthNode(index), getNthNode(index).previous); //requires getNthNode Method
    size++;
  }

  private Node getNthNode(int index){
    int counter = 0;
    Node currentNode = start;
    while(currentNode != null){
      if(counter == index){
        return currentNode;
      }
      currentNode = currentNode.next();
      counter++;

    }
    return currentNode;
  }

  public Integer get(int index){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    getNthNode(index).getData();
  }


}
