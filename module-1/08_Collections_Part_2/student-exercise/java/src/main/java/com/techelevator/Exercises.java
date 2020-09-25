package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String,String>groupName = new HashMap<String,String>();
		groupName.put("rhino", "Crash");
		groupName.put("giraffe", "Tower");
		groupName.put("elephant", "Herd");
		groupName.put("lion", "Pride");
		groupName.put("crow", "Murder");
		groupName.put("pigeon", "Kit");
		groupName.put("flamingo", "Pat");
		groupName.put("deer", "Herd");
		groupName.put("dog", "Pack");
		groupName.put("crocodile", "Float");
		if(animalName == null){
			return "unknown";
		}
		animalName = animalName.toLowerCase();
		if (groupName.containsKey(animalName)){
			return groupName.get(animalName);
		} else {
			return "unknown";
		}
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {

		Map<String,Double> onSale = new HashMap<>();

		onSale.put("KITCHEN4001", 0.20);
		onSale.put("GARAGE1070", 0.15);
		onSale.put("LIVINGROOM", 0.10);
		onSale.put("KITCHEN6073", 0.40);
		onSale.put("BEDROOM3434", 0.60);
		onSale.put("BATH0073", 0.15);

		if(itemNumber == null){
			return 0.00;
		}
		Double result = onSale.get(itemNumber.toUpperCase());
		if(result == null){
			return 0.00;
		}
		return result;
	}


	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {

		int peter = peterPaul.get("Peter");
		int paul = peterPaul.get("Paul");

		Map<String,Integer> money = new HashMap<>();
		money.put("penny", 1);
		money.put("nickel", 5);
		money.put("dime", 10);
		money.put("quarter", 25);
		money.put("$1", 100);
		money.put("$10", 1000);
		money.put("$20", 2000);
		money.put("$50", 5000);
		money.put("$100", 10000);

		if(peter > 0 && paul < 1000){
			if(peter % 2 != 0){
				peter = peter / 2;
				paul = peter + paul;
				peter++;
			}else if(peter > 0 && paul < 1000){
				peter = peter / 2;
				paul = peter + paul;
			} else{
				return peterPaul;
			}
		}
		peterPaul.put("Peter", peter);
		peterPaul.put("Paul", paul);

		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int peter = peterPaul.get("Peter");
		int paul = peterPaul.get("Paul");

		if(peter >= 5000 && paul >= 10000){
			int peterPartnership = peter / 4;
			peter = peter - peterPartnership;
			int paulPartnership = paul / 4;
			paul = paul - paulPartnership;
			int total = peterPartnership + paulPartnership;
			peterPaul.put("Peter", peter);
			peterPaul.put("Paul", paul);
			peterPaul.put("PeterPaulPartnership", total);
			return peterPaul;


		} else {
			return peterPaul;
		}

	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String,String> letter = new HashMap<>();
		for(String result : words){
			letter.put(result.substring(0, 1), result.substring(result.length() - 1));
		}
		return letter;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String,Integer> result = new HashMap<>();

		for (String word : words){
			if(result.containsKey(word)){
				int total = result.get(word);
				total = total + 1;
				result.put(word, total);
			} else {
				result.put(word, 1);
			}
		}
		return result;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {

		Map<Integer, Integer> result = new HashMap<>();

		for(int check : ints) {
			if(result.containsKey(check)) {
				int count = result.get(check);
				count = count + 1;
				result.put(check, count);
			} else {
				result.put(check, 1);
			}
		}
		return result;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {

		Map<String, Boolean>wordCheck = new HashMap<>();

		for(String result : words){
			if(wordCheck.containsKey(result)){
				Boolean count = wordCheck.get(result);

			}
		} return null;
	} // Am I able to use two different maps to get the answer?

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {

		Map<String, Integer>map1 = new HashMap<>();

		for (String result : mainWarehouse.keySet()){
			if(mainWarehouse.containsKey(result) == remoteWarehouse.containsKey(result)){
			map1.put(result, mainWarehouse.get(result) + remoteWarehouse.get(result));
		} else {
			map1.put(result, mainWarehouse.get(result));
		}
		}
		for(String result : remoteWarehouse.keySet()){
			if (remoteWarehouse.containsKey(result)!= mainWarehouse.containsKey(result)){
				map1.put(result, remoteWarehouse.get(result));
			}
		}
		return map1;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {

		Map<String, Integer> answer = new HashMap<>();

		int size = words.length;
		for(String result : words){
			if(size < 3){
				answer.put(result, 0);
				String newResult = result + 1;
				answer.put(newResult, 0);
			} else if(size >= 3){
				int i = words.length - 2;
				answer.put(i)
			}
		}
		return answer;
	}


}
