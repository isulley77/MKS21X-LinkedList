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
return false;
  }


}
