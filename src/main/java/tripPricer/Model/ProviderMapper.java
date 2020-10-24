package tripPricer.Model;

import java.util.UUID;

public class ProviderMapper {
    public final String name;
    public final double price;
    public final String tripId;

    public ProviderMapper(String tripId, String name, double price) {
        this.name = name;
        this.tripId = tripId;
        this.price = price;
    }
}
