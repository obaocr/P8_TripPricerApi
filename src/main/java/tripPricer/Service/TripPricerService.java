package tripPricer.Service;

import tripPricer.Provider;

import java.util.List;

public interface TripPricerService {
    List<Provider> getPrice(String apiKey, String attractionId, int adults, int children, int nightsStay, int rewardsPoints);
}
