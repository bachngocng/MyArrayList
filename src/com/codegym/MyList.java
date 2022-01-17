package com.codegym;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[] = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList(){}

    public MyList(int size){
        this.size = size;
    }

    public void addFirst(E element) {
        add(0, element);
    }

    public void addLast(E element) {
        add(size, element);
    }

    public void add(E element) {
        if (size >= elements.length)
            expand();
        elements[size] = element;
        size++;
    }


    public void add(int index, E element) {
        if (index < 0)
            index = 0;
        if (index > size)
            index = size;
        if (size >= elements.length)
            expand();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void set(int index, E element){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index " + index + " of size " + size);
        } else {
            elements[index] = element;
        }
    }

    public E get(int index) {
        if (index < 0 || index > size)
            return null;
        return elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void remove(int index){
        if(index < 0 || index > size){
            return;
        }
        for (int i = 0; i < size -1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    public void replace(E oldElement, E newElement){
        int index = indexOf(oldElement);
        if(index>-1){
            elements[index] = newElement;
        }
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contain(E element){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    protected void expand() {
        elements = Arrays.copyOf(elements, size + DEFAULT_CAPACITY);
    }

}
