package AdvanceDataStructures.Tree.Heap;

public class TaskScheduler {
    public static void main(String[] args) {
        MinHeap taskHeap = new MinHeap(10);

        // Insert tasks with priorities
        taskHeap.insert(new Task("Task 1", 3));
        taskHeap.insert(new Task("Task 2", 1));
        taskHeap.insert(new Task("Task 3", 2));

        // Extract tasks in order of priority
        while (!taskHeap.isEmpty()) {
            Task task = taskHeap.extractMin();
            System.out.println("Executing task: " + task.getName());
        }
    }
}

