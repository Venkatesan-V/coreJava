package z52StreamsAPIMapFunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import z44StreamsAPInextLevel.Dish;

public class MapRunner {

static List<DishMap> menu=null;

private static void getDishName() {
	List<String> javaEightDish = menu.stream()
	.map(DishMap::getDishName)
	.collect(Collectors.toList());
	
	System.out.println(javaEightDish);
}

private static void getPricedet() {
	List<Integer> javaEightPrice = menu.stream()
	.map(DishMap::getPrice)
	.collect(Collectors.toList());
	
	System.out.println(javaEightPrice);
}

public static void main(String[] args) {
		
	DishMap dish1=new DishMap("chicken biriyani", false, DishMap.Type.MAIN_COURSE, 170);
	DishMap dish2=new DishMap("paneer biriyani", true, DishMap.Type.MAIN_COURSE, 180);
	DishMap dish3=new DishMap("chicken lollypop", false, DishMap.Type.OTHERS, 250);
	DishMap dish4=new DishMap("French Fries", true, DishMap.Type.OTHERS, 70);
	DishMap dish5=new DishMap("chicken gravy", false, DishMap.Type.CURRY, 280);
	DishMap dish6=new DishMap("Royal falooda", true, DishMap.Type.OTHERS, 100);
		
		menu=Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6);
		getDishName();
		getPricedet();
	}

}