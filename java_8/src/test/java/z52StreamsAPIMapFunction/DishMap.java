package z52StreamsAPIMapFunction;

public class DishMap {

	private String dishName;
	private boolean isVeg;
	private Type type;
	private int price;
	
	public enum Type {
		STARTER, MAIN_COURSE, CURRY, DESSERT, OTHERS
	}

	public DishMap (String dishName, boolean isVeg, Type others, int price) {
		super();
		this.dishName = dishName;
		this.isVeg = isVeg;
		this.type = others;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public Type getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}
}
