package gh.mm.hexture.domain.orders;

import io.vavr.collection.Set;

public class Order {

    private final long id;

    private final String description;

    private final Set<OrderLine> orderLines;

    public Order(long id, String description, Set<OrderLine> orderLines) {
        this.id = id;
        this.description = description;
        this.orderLines = orderLines;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }
}
