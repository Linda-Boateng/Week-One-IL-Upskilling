package AdvanceDataStructures.Tree.Heap;

public class MinHeap {
    private final Task[] heap;
    private final int maxSize;
    private int currentSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.heap = new Task[maxSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void insert(Task task) {
        if (isFull()) {
            System.out.println("Heap is full, cannot insert task.");
            return;
        }

        heap[currentSize] = task;
        heapifyUp(currentSize);
        currentSize++;
    }

    public Task extractMin() {
        if (isEmpty()) {
            System.out.println("Heap is empty, no task to extract.");
            return null;
        }

        Task minTask = heap[0];
        heap[0] = heap[currentSize - 1];
        heapifyDown(0);
        currentSize--;

        return minTask;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap[index].getPriority() < heap[parentIndex].getPriority()) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestIndex = index;

        if (leftChildIndex < currentSize && heap[leftChildIndex].getPriority() < heap[smallestIndex].getPriority()) {
            smallestIndex = leftChildIndex;
        }

        if (rightChildIndex < currentSize && heap[rightChildIndex].getPriority() < heap[smallestIndex].getPriority()) {
            smallestIndex = rightChildIndex;
        }

        if (smallestIndex != index) {
            swap(index, smallestIndex);
            heapifyDown(smallestIndex);
        }
    }

    private void swap(int i, int j) {
        Task temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
