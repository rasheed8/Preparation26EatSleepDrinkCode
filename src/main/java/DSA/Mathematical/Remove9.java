/**
 * 
 */
package DSA.Mathematical;

/**
 * @author Raj
 *
 *         Start from integer 1,
 *         remove any integer that contains 9
 *         such as 9,
 *         19, 29...
 * 
 *         So now, you will have a new integer sequence: 1, 2, 3, 4, 5, 6, 7, 8,
 *         10, 11, ...
 * 
 *         Given a positive integer n,
 *         you need to return the n-th integer after
 *         removing. Note that 1 will be the first integer.
 * 
 *         Example 1: Input: 9 Output: 10 Hint: n will not exceed 9 x 10^8.
 * 
 */
public class Remove9 {

	/**
	 * 
	 * As the problem want to move every
	 * digit has 9, which means 1 2 3 4 5 6 7
	 * 8 10 11 12 13 14 15 16 17 18 20...
	 * That is once you count to 8, we need
	 * jump to 10( which luckily 9 in 9 based )... And when change number in 9
	 * base, it will not appear 9 any more... It only useful to move 9, and not
	 * suit for other digit, such as 8.. since in 8 base, will get list as this
	 * : 1 2 3 4 5 6 7 8 
	 * 10 11.. will pass 9..
	 * 
	 */


	public static void main(String[] args) {
		int res = -1;
		Remove9 obj = new Remove9();

		res = obj.convertBaseX(9);

		System.out.println(res);
		res = obj.convertBaseX(90);
		System.out.println(res);
	}
	public int newInteger(int n) {
		return convertBaseX(n);
	}
	public int convertBaseX(int n) {
		int baseX = 9;                        // when reused, X could be 2 binary,8 Octal,16 Hex....
		String result = "";
		int remainder = 0;
		while (n > 0) {
			remainder = n % baseX;
			result = remainder + result;      // easier to store the remainder in a string
			n = n / baseX;
		}
		return Integer.parseInt(result);       //  convert the string back to integer
	}

}
