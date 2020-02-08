package gh.mm.hexture.domain.orders;

import java.math.BigDecimal;

public class OrderLine {

    private final String lineKey;

    private final String description;

    private final BigDecimal amount;

    private final BigDecimal price;

    public OrderLine(String lineKey, String description, BigDecimal amount, BigDecimal price) {
        this.lineKey = lineKey;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public String getLineKey() {
        return lineKey;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
