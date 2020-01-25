package v.algorithm.sort.base;

import java.util.Arrays;
import java.util.Random;

import v.algorithm.sort.Insert;

/**
 * @author v
 * 
 *         git clone https://github.com/yang821/practice.git
 * 
 *         git push -u origin master
 * 
 *         yang821@sina.com yangwei+1234
 */
public class SortUtils {
	public static String arrayToString(int[] array) {
		return Arrays.toString(array);
	}

	public static int[] genRandomArray(int count, int rangeMax) {
		if (count < 1) {
			return null;
		}
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = new Random().nextInt(rangeMax);
		}
		return array;
	}

	public static int[] sortByJdk(int[] array) {
		// Arrays.copyOf(array, array.length)
		int[] cloneArray = array.clone();
		Arrays.sort(cloneArray);
		return cloneArray;
	}

	public static String judgeSortMethod(ISort method) {
		int[] array = genRandomArray(50000, 99999);

		long begin = System.currentTimeMillis();
		int[] arraySortedByJdk = sortByJdk(array);
		long end = System.currentTimeMillis();

		long begine1 = System.currentTimeMillis();
		int[] arraySorted = method.sort(array);
		long end1 = System.currentTimeMillis();

		String stringSortedByJdk = Arrays.toString(arraySortedByJdk);
		String stringSorted = Arrays.toString(arraySorted);
		assert (stringSortedByJdk.equals(stringSorted));

		String output = String.format("JDK cost %d, method cost %d.", end - begin, end1 - begine1);
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		SortUtils.judgeSortMethod(new Insert());
		test4();
	}

	private static void test4() {
		int[] array = genRandomArray(100, 1000);
		int[] arraySorted = sortByJdk(array);
		new Insert().sort(array);
		System.out.println(arrayToString(array));
		System.out.println(arrayToString(arraySorted));
	}
}
