public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;

  public ArrayStack(int size) {
  
      capacity = size;
    storage = new String[capacity];
  }

  public void show() {

    for (int i = capacity-1; i >= 0; i--) {
      
        System.out.print("Stack" +"[" +i +"]" +" =" +storage[i] +"th" +" Value" ) ;
        
        
  
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      // print error message
      System.out.println("Storage is Empty ");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      // print error message
        System.out.print("Storage is Full ") ;
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Add Failed ");
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      /* increment or decrement top*/
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.println("Remove Failed ");
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null ;
      top--;
      /* increment or decrement top*/;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
      ArrayStack storage = new ArrayStack(10);
  
    System.out.println("STORAGE CAPACITY = " + storage.capacity );
    System.out.println();
    storage.show();
    storage.peek();
    storage.pop();

    storage.push("one");
    storage.push("two");
    storage.push("three");
    storage.push("four");
    storage.push("five"); 
    storage.push("six"); 
    storage.push("seven");
    storage.push("eight");
    storage.push("nine");
    storage.push("ten"); 
    
  }  

}