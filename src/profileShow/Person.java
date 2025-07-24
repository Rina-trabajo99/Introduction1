package profileShow;

public class Person {
	//メンバ変数
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	static int callCount = 0;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		callCount ++; //コンストラクタが呼び出された回数をカウントさせる
	}
	
	public void weight(double weight) {
		this.weight = weight;
		bmi();
	}
	
	public double bmi() {
		return this.bmi = Math.floor(this.weight / (this.height * this.height));
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + this.bmi + "です");
	}
	public void printCount() {
		System.out.println("合計" + callCount + "人です");
	}

}
