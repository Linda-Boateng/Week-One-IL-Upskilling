package AdvanceJavaFeatures.Generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
  private final List<T> elements;

  public Stack() {
    elements = new ArrayList<>();
  }

  public void push(T item) {
    elements.add(item);
  }

  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    return elements.removeLast();
  }

  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    return elements.getLast();
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }

  public int size() {
    return elements.size();
  }

  public void clear() {
    elements.clear();
  }

  public int search(T item) {
    return elements.lastIndexOf(item);
  }

  public static void main(String[] args) {
    Stack<Integer> integerStack = new Stack<>();
    integerStack.push(10);
    integerStack.push(20);
    integerStack.push(30);

    System.out.println("Size of integer stack: " + integerStack.size());
    System.out.println("Top element of integer stack: " + integerStack.peek());

    while (!integerStack.isEmpty()) {
      System.out.println("Popped element from integer stack: " + integerStack.pop());
    }

    Stack<String> stringStack = new Stack<>();
    stringStack.push("Hello");
    stringStack.push("World");

    System.out.println("Size of string stack: " + stringStack.size());
    System.out.println("Top element of string stack: " + stringStack.peek());
    System.out.println("Index of element 'World' in string stack: " + stringStack.search("World"));

    while (!stringStack.isEmpty()) {
      System.out.println("Popped element from string stack: " + stringStack.pop());
    }
    stringStack.clear();
    System.out.println("Size of string stack after clearing: " + stringStack.size());
  }
}
