package day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public boolean isOrderWithLessProcuctThan(int minimalProducts) {
//        return orders.stream().anyMatch(order -> order.getProducts().size() < minimalProducts);

        return !orders.stream()
//                .mapToInt(orders.size())

                .filter(o -> o.getProducts().size() < minimalProducts)
                .collect(Collectors.toList()).isEmpty();
    }

    public List<Order> getOrderMostOfProcuct() {
        return orders.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(o -> o.getProducts().size())))
//                .filter(order -> order.getProducts().size() >= products.size())
                .collect(Collectors.toList());
    }

    public List<Order> getOrderByProductCategory(String category) {
        return orders.stream()
                .filter(order -> order.getProducts()
                        .stream().anyMatch(p -> p.getCategory().equals(category)))
                .collect(Collectors.toList());
    }


}