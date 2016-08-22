
public class ArrayQueue {
    
        private int [] Queue ;
        private int front;
        private int rear;
        private int Nitems;
        
        public ArrayQueue(){
            Nitems = 5 ;
            Queue = new int [Nitems];
            front = rear = 0 ;
        }
        public void resize(){
            int s = size();
            Nitems = 2 * Nitems;
            int lastIndex = s + 1;
            int[] arr = new int [Nitems];
            int i = 0 ;
            while( s > 0 ) {
                s--;
                arr[i++] = Queue[front++];
                if ( front == lastIndex ) 
                    front = 0 ;
                }
            rear ++;
            front = 0 ; 
            Queue = arr ; 
        }
        public void showQueue(int x){
            int s = size ();
            if ( s == Nitems - 1 )
                resize();
            Queue[rear++] = x ;
            if ( rear == Nitems )
                rear = 0 ;
        }
        public Integer dequeue(){
            if (isEmpty())
                  return null;
            int x = Queue[front++];
            if (front == Nitems)
                front = 0 ;
            return x ;
        }
        public int size(){
            return (Nitems - front + rear)% Nitems;
        }
        public boolean isEmpty(){
            return front == rear ;
        }
    
    public static void main(String [] args){
        
        ArrayQueue ca = new ArrayQueue() ;
        ca.showQueue(5);
        ca.showQueue(6);
        ca.showQueue(7);
        ca.showQueue(8);
        ca.dequeue();
        
        while ( !ca.isEmpty() ){
            System.out.print(ca.dequeue());
        }
            
    }
}
