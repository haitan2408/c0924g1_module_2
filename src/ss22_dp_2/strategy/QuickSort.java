package ss22_dp_2.strategy;

import java.util.List;

public class QuickSort implements SortStrategy {

	@Override
	public <T> void sort(List<T> items) {
		System.out.println("Quick sort");
	}
}