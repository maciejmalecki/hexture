package gh.mm.hexture.domain.orders;

import io.vavr.collection.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Order {

    private final long id;

    private final String description;

    private final Set<OrderLine> orderLines;

}
