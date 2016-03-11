public class Main {

	public static void main(String [] args) {
	
		// Student() - конструктор
		
		Student student1 = new Student("Taya");
		Student student2 = new Student("Katya");
		
		// not allowed (name is private)
		// st.name = "Sveta";
		
		student1.sayHi(student2);
		
	}
	
}