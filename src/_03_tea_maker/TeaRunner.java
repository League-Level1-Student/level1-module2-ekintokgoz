package _03_tea_maker;

public class TeaRunner {
	public static void main(String[] args) {
		TeaBag green = new TeaBag("Green");
		Kettle kettle = new Kettle();
		kettle.boil();
		Kettle.Water hotWater = kettle.getWater();
		Cup cup = new Cup();
		cup.makeTea(green, hotWater);
	}
}
