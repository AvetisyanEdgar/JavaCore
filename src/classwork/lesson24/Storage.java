package classwork.lesson24;

import java.io.Serializable;

public class Storage<T extends Number & Serializable> {

    Object[] objects = new Object[10];
    private int size = 0;

    public void add(T obj) {
        if (size == objects.length) {
            extend();
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }

    private void extend() {
        Object[] tmp = new Object[objects.length + 10];
        System.arraycopy(objects, 0, tmp, 0, size);
        objects = tmp;
    }
}
