package external;
import java.util.*; 

import entity.Item;

public interface ExternalAPI {

	public List<Item> search(double lat, double lon, String term);
}

