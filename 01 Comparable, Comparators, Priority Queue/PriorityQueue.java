package ru.kpfu.itis.ma.group501;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by ma on 11.03.2016.
 */
public class PriorityQueue<T> implements Queue<T> {
    private PriorityElem<T> head;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(T t) {
        if (head == null) {
            head = new PriorityElem<T>(t, null, Priority.ZERO);
        } else {
            PriorityElem<T> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(new PriorityElem<T>(t, null, Priority.ZERO));
        }
        return true;
    }

    public boolean offer(T t, Priority priority) {

        if (head == null) {
            head = new PriorityElem<T>(t, null, priority);

        } else {

            PriorityElem<T> p = head;

            while (p.getPriority().ordinal() >= priority.ordinal() && p.getNext() != null) {
                p = p.getNext();
            }
            PriorityElem<T> q = new PriorityElem<T>(p.getValue(), p.getNext(), p.getPriority());
            p.setValue(t);
            p.setPriority(priority);
            p.setNext(q);
        }
        return true;
    }


    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
