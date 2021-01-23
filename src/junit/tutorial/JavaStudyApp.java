package junit.tutorial;

public class JavaStudyApp {

	public static void main(String[] args) {
		Integer int1 = 10;
		Integer int2 = 20;
		Integer result = null;
		Float resultFloat = null;
		Calculator calc = new Calculator();
		
		result = calc.multiply(int2, int1);
		System.out.println("計算：" + int2 + "×" + int1 + "＝" + result);
		resultFloat = calc.divide(int2, int1);
		System.out.println("計算：" + int2 + "÷" + int1 + "＝" + resultFloat);
	}
}
