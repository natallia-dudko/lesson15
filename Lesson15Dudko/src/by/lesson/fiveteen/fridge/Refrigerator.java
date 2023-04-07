package by.lesson.fiveteen.fridge;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {

	private List<Good> goods;

	public Refrigerator() {
		goods = new ArrayList<Good>();
	}

	public boolean add(Good r) {
		return goods.add(r);
	}

	public boolean delete(int idGood) {
		int deleteIndex;

		if ((deleteIndex = findPosition(idGood)) < 0) {
			return false;
		}

		goods.remove(deleteIndex);
		return true;
	}

	private int findPosition(int idGood) {
		int deleteIndex = -1;
		for (int i = 0; i < goods.size(); i++) {
			if (goods.get(i).getId() == idGood) {
				deleteIndex = i;
				break;
			}
		}
		return deleteIndex;
	}

	public List<Good> findByName(String name) {

		List<Good> found = new ArrayList<>();

		for (int i = 0; i < goods.size(); i++) {
			Good r = goods.get(i);
			String titleBook = r.getName();
			if (titleBook.contains(name)) {
				found.add(goods.get(i));
			}

		}

		return found;
	}

	public boolean isInFridge(Good good) {

		return goods.contains(good);
	}

	public void print() {
		System.out.println("----------------------Refrigerator----------------------");
		for (int i = 0; i < goods.size(); i++) {
			Good r = goods.get(i);
			System.out.println("Good:  id: " + r.getId());
			System.out.println("\t name: " + r.getName());
			System.out.println("\t quantity: " + r.getQuantity());
			System.out.println("\t weight: " + r.getWeight());
			System.out.println("-------------------------------------------------");
		}

	}

}
