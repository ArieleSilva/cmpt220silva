/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 7
 */
public class Queue {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  public Queue(){
    this(DEFAULT_CAPACITY);
  }

  public Queue(int capacity){
    elements = new int[capacity];
  }
  public void enqueue(int v){
    for(int i = 0; i < size; i++){
      if(this.elements[i] == 0){
        this.elements[i] = v;
      }
    }
  }
  public int dequeue(){
    int v = elements[0];
    size--;
    for (int i = 0; i < size; i++){
      elements[i] = elements[i+1];
    }
    return v;
  }
  public boolean empty(){
    return size == 0;
  }
  public int getSize(){
    return size;
  }
}
//silvs code