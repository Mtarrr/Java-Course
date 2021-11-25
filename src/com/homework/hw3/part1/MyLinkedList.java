package com.homework.hw3.part1;

import com.homework.hw3.part1.ILinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    private static class Node<E> {
        private E element;
        private Node<E> nextNode;
        private Node<E> previousNode;

        public Node(E element) {
            this.element = element;
        }

        public Node(Node<E> previousNode, E element, Node<E> nextNode) {
            this.previousNode = previousNode;
            this.element = element;
            this.nextNode = nextNode;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public Node<E> getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node<E> previousNode) {
            this.previousNode = previousNode;
        }
    }

    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node(element);
            last = first;
            first.setNextNode(last);
            last.setPreviousNode(first);
        } else {
            if (size == 1) {
                last = new Node(element);
                last.setPreviousNode(first);
                first.setNextNode(last);
            } else {
                Node tmp = new Node(element);
                tmp.setPreviousNode(last);
                last.setNextNode(tmp);
                last = tmp;
            }
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
        } else {
            if (index == size) add(element);
            else {
                Node cur = first;
                for (int i = 0; i < index; i++)
                    cur = cur.getNextNode();
                Node tmp = new Node(cur.getPreviousNode(), element, cur);
                cur.setPreviousNode(tmp);
                cur = tmp.getPreviousNode();
                cur.setNextNode(tmp);
                size++;
            }
        }
    }

    @Override
    public void clear() {
        for (Node<E> cur = first; cur != null; ) {
            Node<E> next = cur.nextNode;
            cur.element = null;
            cur.nextNode = null;
            cur.previousNode = null;
            cur = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds.");
            return null;
        } else {
            return getCurrent(index).getElement();
        }
    }

    private Node<E> getCurrent(int index) {
        Node<E> cur = first;
        for (int i = 0; i < index; i++)
            cur = cur.getNextNode();
        return cur;
    }

    @Override
    public int indexOf(E element) {
        Node<E> cur = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (cur.getElement() == null) return i;
                cur = cur.getNextNode();
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(cur.getElement())) return i;
                cur = cur.getNextNode();
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        Node<E> temp = first;
        if (index == 0) {
            first = temp.getNextNode();
            size--;
            return temp.getElement();
        }
        int curIndex = 0;
        while (curIndex < index - 1) {
            temp = temp.getNextNode();
            curIndex++;
        }
        E elem = temp.getNextNode().getElement();
        temp.setNextNode(temp.getNextNode().getNextNode());
        size--;
        return elem;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) return null;
        else {
            Node<E> cur = getCurrent(index);
            E oldValue = cur.getElement();
            cur.setElement(element);
            return oldValue;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] out = new Object[size];
        int i = 0;
        for (Node<E> cur = first; cur != null; cur = cur.nextNode)
            out[i++] = cur.getElement();
        return out;
    }

    public <T> T[] toArray(T[] t) {
        if (t.length < size)
            t = (T[]) java.lang.reflect.Array.newInstance(
                    t.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = t;
        for (Node<E> cur = first; cur != null; cur = cur.nextNode)
            result[i++] = cur.getElement();

        if (t.length > size)
            t[size] = null;

        return t;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("MyLinkedList{");
        if (size == 0) res.append("}");
        else {
            res.append(first.getElement().toString());
            for (Node<E> cur = first.getNextNode(); cur != null; cur = cur.getNextNode())
                res.append(", ").append(cur.getElement().toString());
            res.append("}");
        }
        return res.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> curNode = first;

            @Override
            public boolean hasNext() {
                return curNode != null;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (!hasNext())
                    throw new NoSuchElementException();

                E element = curNode.getElement();
                curNode = curNode.getNextNode();
                return element;
            }
        };
    }
}
