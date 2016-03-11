package ru.kpfu.itis.ma.group501;

/**
 * Created by ma on 11.03.2016.
 */
public class PriorityElem<T> {

    private T value;
    private PriorityElem<T> next;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(PriorityElem<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public PriorityElem(T value, PriorityElem<T> next) {
        this.value = value;
        this.next = next;
    }

    public PriorityElem<T> getNext() {
        return next;
    }
    
    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    private Priority priority;
    
    public PriorityElem(T value, PriorityElem<T> next, Priority priority) {
        this(value, next);
        this.priority = priority;
    }
    
    
    
    
    
}
