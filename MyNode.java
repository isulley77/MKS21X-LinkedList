class Node{
  private Integer data;
  private Node next, prev;

  public Node(Integer val, prev, next){
    data = val;
    set
  }

  public Node next(){
    return next;
  }


  public Node previous(){
    return prev;
  }

  public void setNext(Node other){
    this.next = other;
    other.prev = this;
  }

  public void setPrev(Node other){
    this.prev = other;
    other.next = this;
  }

  public Integer getData(){
    return this.data;
  }

  public Integer setData(){
    return this.data;
  }

  public String toString(){}

}
