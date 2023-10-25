package AssistedProject;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// Create a HashMap to store name-age pairs

		Map<String, Integer> ageMap = new HashMap<>();

		// Add entries to the HashMap

		ageMap.put("Rishu", 23);
		ageMap.put("Ron", 56);
		ageMap.put("Rik", 45);

		// Retrieve values by key

		int RishuAge = ageMap.get("Rishu");
		int RonAge = ageMap.get("Ron");

		System.out.println("Rishu's age: " + RishuAge);
		System.out.println("Ron's age: " + RonAge);

		// Check if a key exists in the map

		String keyToCheck = "Raz";
		if (ageMap.containsKey(keyToCheck)) {
			System.out.println(keyToCheck + " exists in the map.");
		} else {
			System.out.println(keyToCheck + " does not exist in the map.");
		}

		// Iterate through the map entries

		System.out.println("Map entries:");
		for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
		}

		// Remove an entry from the map

		String keyToRemove = "Bob";
		ageMap.remove(keyToRemove);
		System.out.println(keyToRemove + " has been removed from the map.");

		// Check the size of the map

		System.out.println("Size of the map: " + ageMap.size());

		// Clear all entries from the map

		ageMap.clear();
		System.out.println("All entries have been cleared from the map.");
	}

}
