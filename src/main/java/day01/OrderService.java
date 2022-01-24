package day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class OrderService {

    private List<Order> orders = new ArrayList<>();


    public void saveOrder(Order order) {
        orders.add(order);
    }

    public List<Order> findOrdersByStatus(String status) {
        return orders.stream()
                .filter(o -> o.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public long countOrdersByStatus(String status) {
        return orders.stream()
                .filter(o -> o.getStatus().equals(status))
                .count();
    }

    public List<Order> getOrdersBetweenDate(LocalDate start, LocalDate end) {
        return orders.stream()
//                .filter(order -> !order.getOrderDate().isBefore(start))
//                .filter(order -> !order.getOrderDate().isAfter(end))
                .filter(order -> order.getOrderDate().isAfter(start) && order.getOrderDate().isBefore(end))
                .collect(Collectors.toList());
    }
}