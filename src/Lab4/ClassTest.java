package Lab4;

import java.util.Arrays;

public class ClassTest {

	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("Audi","ö��",530000),
				new Car("Chevrolet","��к�",800000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

}
}