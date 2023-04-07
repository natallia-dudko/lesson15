package by.lesson.fiveteen.fridge;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Refrigerator refrigerator = new Refrigerator();

		refrigerator.add(new Good(1, "Apples", 2, 4.5));
		refrigerator.add(new Good(2, "Eggs", 10, 0.5));
		refrigerator.add(new Good(3, "Milk", 3, 2.3));
		refrigerator.add(new Good(4, "Meat", 1, 1.2));
		refrigerator.add(new Good(5, "Tomato", 7, 2.4));

		List<Good> good = refrigerator.findByName("M");

		if (good != null) {
			for (int i = 0; i < good.size(); i++) {
				Good a = good.get(i);
				System.out.println("-------------------Found Goods--------------------------");
				System.out.println("Good:  id: " + a.getId());
				System.out.println("\t name: " + a.getName());
				System.out.println("\t quantity: " + a.getQuantity());
				System.out.println("\t weight: " + a.getWeight());
				System.out.println("-------------------------------------------------");
			}
		} else {
			System.out.println("No such good in the refrigerator.");

		}

		System.out.println(
				"Is there such a good in the refrigerator? " + refrigerator.isInFridge(new Good(4, "Meat", 1, 1.2)));

		refrigerator.print();

		refrigerator.delete(2);

		System.out.println("Goods in the friedge after deletion.");

		refrigerator.print();

	}

}
