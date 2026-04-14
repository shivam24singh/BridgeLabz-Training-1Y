package GenericProblem;

import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class Warehouse {
    public static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) {
            System.out.println(w.getClass().getSimpleName());
        }
    }
}