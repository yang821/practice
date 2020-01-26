package v.algorithm.sort;

import v.algorithm.sort.base.ISort;
import v.algorithm.sort.base.SortUtils;

public class Quick implements ISort {
	@Override
	public int[] sort(int[] a) {
		qsort(a, 0, a.length - 1);
		return a;
	}

	public static void qsort(int[] a, int begin, int end) {
		int index = devide(a, begin, end);
		if (index >= 0) {
			qsort(a, begin, index - 1);
			qsort(a, index + 1, end);
		}
	}

	public static int devide(int[] a, int begin, int end) {
		if (begin >= end || begin < 0) {
			return -1;
		}
		int key = a[end];
		while (begin != end && begin >= 0) {
			while (begin != end && a[begin] <= key) {
				begin++;
			}

			a[end] = a[begin];
			// a[begin] = -1;
			// System.out.println(Arrays.toString(a));

			while (begin != end && a[end] >= key) {
				end--;
			}

			a[begin] = a[end];
			// a[end] = -1;
			// System.out.println(Arrays.toString(a));
		}

		a[begin] = key;
		// System.out.println(Arrays.toString(a));
		return begin;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 3, 1, 4, 9, 8, 1, 2 };
		SortUtils.debugSortMethod(new Quick(), array);

		SortUtils.judgeSortMethod(new Quick());
	}

}
