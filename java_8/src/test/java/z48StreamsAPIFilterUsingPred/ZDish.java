package z48StreamsAPIFilterUsingPred;



public class ZDish {

	private String dishName;
	private boolean isVeg;
	private Type type;
	private int price;
	
	public enum Type {
		STARTER, MAIN_COURSE, CURRY, DESSERT, OTHERS
	}

	public ZDish(String dishName, boolean isVeg, Type type, int price) {
		super();
		this.dishName = dishName;
		this.isVeg = isVeg;
		this.type = type;
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
