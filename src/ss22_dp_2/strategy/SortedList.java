package ss22_dp_2.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

	private SortStrategy strategy;
	private List<String> items = new ArrayList<>();
	
	public void setSortStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}
	public void add(String name) {
		items.add(name);
	}
	public void sort() {
		strategy.sort(items);// complier của cha.Khi runtime sẽ chạy đối tượng con cụ thể

	}
}
