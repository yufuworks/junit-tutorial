package junit.tutorial;

public class Calculator {
	
	/**
	 * 引数で与えた２つの値の乗算を返す
	 * @param x １つ目の引数
	 * @param y ２つ目の引数
	 * @return xとyで乗算した値
	 */
	public int multiply(int	x, int y) {
		return x * y;
	}
	
	/**
	 * 引数で与えた２つの値の除算を返す
	 * ０で割る場合に例外を返す
	 * @param x １つ目の引数
	 * @param y ２つ目の引数
	 * @return xをyで除算した値
	 */
	public float divide(int x, int y) {
		if (y == 0) throw new
	IllegalArgumentException("divide by zero.");
		return (float)x / (float)y;
	}
}
