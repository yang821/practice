package v.algorithm.sort;

import v.algorithm.sort.base.ISort;
import v.algorithm.sort.base.SortUtils;

public class Bubble implements ISort {
	@Override
	public int[] sort(int[] a) {
		if (a == null || a.length < 1) {
			return a;
		}

		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		SortUtils.judgeSortMethod(new Bubble());
	}
}
