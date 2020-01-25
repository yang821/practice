package v.algorithm.sort;

/**
 * @author v
 * 
 *         git clone https://github.com/yang821/practice.git
 * 
 *         git push -u origin master
 * 
 *         yang821@sina.com yangwei+1234
 */
public class Insert implements ISort {
	public int[] sort(int[] a) {
		if (a == null || a.length < 2) {
			return a;
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
		return a;
	}

	public static void main(String[] args) {
		System.out.print(SortUtils.judgeSortMethod(new Insert()));
		test1();
		test2();
		test3();
	}

	private static void test1() {
		int[] array = new int[] { 3, 2, 1, 5, 7, 6, 9 };
		new Insert().sort(array);
		System.out.println(SortUtils.arrayToString(array));
	}

	private static void test2() {
		int[] array = new int[] { 3 };
		new Insert().sort(array);
		System.out.println(SortUtils.arrayToString(array));
	}

	private static void test3() {
		int[] array = new int[] {};
		new Insert().sort(array);
		System.out.println(SortUtils.arrayToString(array));
	}
}
