class Queue<T> extends Borrowers {
    private int maxSize;

    private T[] queArray;

    private int front;

    private int rear;

    private int nItems;

    public Queue(int level, String bookName, String name) {
        super(level, bookName, name);
    }

    @Override
    public String toString(){
        return this.getName()+" "+this.getLevel()+" :"+this.getBookName();
    }


    public Queue(int s) {
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public T[] getQueArray() {
        return queArray;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getnItems() {
        return nItems;
    }

    public void insert(T j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }


    public T remove() {
        T temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public T peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}