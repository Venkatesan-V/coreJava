package z44StreamsAPInextLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishRunner {

//	Requirement: Pick NV items and sort LowToHigh
	static List<Dish> menu=null;
	
	public static void getNVItemsByPriceL2H() {
		
		List<Dish> nonVegL2H = new ArrayList<Dish>();
//		iterate
//		check if the item is NV
//		Sort L2H
		for (Dish dish : menu) {	// now items available in menu only
			if(!dish.isVeg()) {		//!dish refer to "Non veg items to be identified
				nonVegL2H.add(dish); // identified nv should be stored here
			}
		}
		Collections.sort(nonVegL2H, new Comparator<Dish>() {

			@Override
			public int compare(Dish dish1, Dish dish2) {
				return Integer.compare(dish1.getPrice(), dish2.getPrice());
			}
		});
		for (Dish dish : nonVegL2H) {		// sorting nv items selected
			System.out.println(dish.getDishName());
		}
		System.out.println("=====END OF JAVA 7 MENU=====");
	}
	
	public static void usingJava8() {
		List<String> javaEight =  menu.stream()			//menu(Collection) is converted into stream
		.filter(dish-> dish.isVeg()==false)				//filter only NV items
		.sorted(Comparator.comparing(Dish::getPrice))	//sorting on price
		.map(dish->dish.getDishName())					//fetch sorted items
		.collect(Collectors.toList());					//collect fetched data in list
		
		System.out.println(javaEight);
	}
	public static void usingJava8rev() {
		List<String> javaEightRev =  menu.stream()
		.filter(dish-> dish.isVeg()==false)
		.sorted(Comparator.comparing(Dish::getPrice).reversed())
		.map(dish->dish.getDishName())
		.collect(Collectors.toList());
		
		System.out.println(javaEightRev);
	}
	
	public static void main(String[] args) {
		
		Dish dish1=new Dish("chicken biriyani", false, Dish.Type.MAIN_COURSE, 170);
		Dish dish2=new Dish("paneer biriyani", true, Dish.Type.MAIN_COURSE, 180);
		Dish dish3=new Dish("chicken lollypop", false, Dish.Type.OTHERS, 250);
		Dish dish4=new Dish("French Fries", true, Dish.Type.OTHERS, 70);
		Dish dish5=new Dish("chicken gravy", false, Dish.Type.CURRY, 280);
		Dish dish6=new Dish("Royal falooda", true, Dish.Type.OTHERS, 100);
		
		menu=Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6);
		
		System.out.println("====M E N U====");

		for (Dish dish : menu) {
			System.out.println(dish.getDishName());
		}
		
		System.out.println("====END OF MENU====");
		
		getNVItemsByPriceL2H();
		usingJava8();
		usingJava8rev();
	}
}