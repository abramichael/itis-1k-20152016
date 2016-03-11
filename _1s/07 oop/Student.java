public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
		System.out.println("New student with name " + this.name + " created");
	}
	
	public String getName() {
		return name;
	}
	
	public void sayHi(Student s) {
		System.out.println(this.name + " says 'hi!' to " + s.getName());
	}
	
}