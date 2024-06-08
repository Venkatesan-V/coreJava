package z41SortComparator;

public class MobileTwo {

	public Brand brand;
	public String model;
	public int memory;
	public int price;
	public int megapixel;
	public double displaySize;
	public String colour;
	
	public MobileTwo (Brand apple, String model, int memory, int price, int megapixel, double displaySize, String colour) {
		super();
		this.brand = apple;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.megapixel = megapixel;
		this.displaySize = displaySize;
		this.colour = colour;
	}
	public enum Brand {
		APPLE, SAMSUNG, REALME, MOTO, GOOGLE, ONEPLUS, NOKIA
	}

	public Brand getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getMemory() {
		return memory;
	}

	public int getPrice() {
		return price;
	}

	public int getMegapixel() {
		return megapixel;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public String getColour() {
		return colour;
	}

	
	public int compareTo(MobileTwo mobilez) {
		if (this.getPrice()>mobilez.getPrice()) {
			return 1;
		}else if (this.getPrice()<mobilez.getPrice()) {
			return -1;
		}else
		return 0;
	}
}
