package profileShow;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		System.out.println();
		person1.weight(60);
		person1.print();
		
		System.out.println();
		person1.printCount();
		
	}

}
