package z54FlatMapFunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import z40SortComparable.Mobile;

public class PackRunner {

	static List<Pack> packages;
	
	public static void packUsingMapFunction() {
		List<List<String>> itemsMapPack = packages.stream()
		.map(Pack::getItems)
		.collect(Collectors.toList());
		System.out.println(itemsMapPack);
	}
	public static void packUsingFlatMapFunction() {
		List<String> itemsFlatPack = packages.stream()
		.map(Pack::getItems)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		System.out.println(itemsFlatPack);
	}	
	
	public static void main(String[] args) {
		
		Pack masalaItem1 = new Pack ("MASALA ITEMS", Arrays.asList("Sambar powder","Rasam powder"));
		Pack masalaItem2 = new Pack ("MASALA ITEMS", Arrays.asList("Garam masala","Mutton masala"));
		
		packages = Arrays.asList(masalaItem1, masalaItem2);
		
		System.out.printf("| %-15s | %-10s |%n",
				"Name","Items");
		for (Pack pack : packages) {
			System.out.printf("| %-15s | %-10s |%n",
					pack.getName(), pack.getItems());
		}
		packUsingMapFunction();
		packUsingFlatMapFunction();
	}
	
}
