package gh.mm.hexture.domain.orders;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class OrderLine {

    private final String lineKey;

    private final String description;

    private final BigDecimal amount;

    private final BigDecimal price;

}
