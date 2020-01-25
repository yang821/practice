package v.algorithm.sort;

import java.util.Arrays;

/**
 * @author v
 * 
 *         git clone https://github.com/yang821/practice.git
 * 
 *         git push -u origin master
 */
public class Insert {
	public static void sort(int[] a) {
		if (a == null || a.length < 2) {
			return;
		}

		int key = 0;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
			// System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	public static void test1() {
		int[] array = new int[] { 3, 2, 1, 5, 7, 6, 9 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void test2() {
		int[] array = new int[] { 3 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void test3() {
		int[] array = new int[] {};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
