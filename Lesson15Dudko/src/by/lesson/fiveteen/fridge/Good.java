package by.lesson.fiveteen.fridge;

import java.util.Objects;

public class Good {

	private int id;
	private String name;
	private int quantity;
	private double weight;

	public Good() {
	}

	public Good(int id, String name, int quantity, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, quantity, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Good other = (Good) obj;
		return id == other.id && Objects.equals(name, other.name) && quantity == other.quantity
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
