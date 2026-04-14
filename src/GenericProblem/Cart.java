package GenericProblem;

import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}