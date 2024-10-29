import java.util.*;

class Warehouse {
    String productId;
    int quantity, unitCost;

    Warehouse(String pid, int q, int uc) {
        productId = pid;
        quantity = q;
        unitCost = uc;
    }
}

class Order {
    int orderedQuantity, orderId;
    String date;

    Order(int oq, int oid, String d) {
        orderedQuantity = oq;
        orderId = oid;
        date = d;
    }
}

class BookOrderThread extends Thread {
    Warehouse warehouse;
    int orderedQuantity;
    int orderIdGenerator;
    List<Order> orderList;

    BookOrderThread(Warehouse w, int oq, int oidGen, List<Order> ol) {
        warehouse = w;
        orderedQuantity = oq;
        orderIdGenerator = oidGen;
        orderList = ol;
    }

    public void run() {
        synchronized (warehouse) {
            if (warehouse.quantity < orderedQuantity)
                throw new RuntimeException("Out of Stock for " + warehouse.productId);

            int orderId = orderIdGenerator++;
            int totalCost = orderedQuantity * warehouse.unitCost;
            warehouse.quantity -= orderedQuantity;

            
            int i = 0;
            while (i < orderList.size() && orderList.get(i).date.compareTo(new Date().toString()) < 0) {
                i++;
            }
            orderList.add(i, new Order(orderedQuantity, orderId, new Date().toString()));

            System.out.println("Order Placed: " + orderId + ", " + warehouse.productId + ", " + orderedQuantity + ", " + totalCost);
        }
    }
}

public class WarehouseManagement {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("P123", 100, 10);
        int orderIdGenerator = 1;
        List<Order> orderList = new ArrayList<>();

        Thread t1 = new BookOrderThread(warehouse, 50, orderIdGenerator, orderList);
        Thread t2 = new BookOrderThread(warehouse, 30, orderIdGenerator, orderList);
        Thread t3 = new BookOrderThread(warehouse, 20, orderIdGenerator, orderList);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSorted Order Details:");
        for (Order order : orderList) {
            System.out.println("OrderID: " + order.orderId + ", ProductID: " + warehouse.productId + ", Quantity: " + order.orderedQuantity + ", Date: " + order.date);
        }
    }
}
