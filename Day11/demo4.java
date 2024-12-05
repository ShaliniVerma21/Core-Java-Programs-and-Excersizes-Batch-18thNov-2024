package Day11;
//single Inheritance Example-2
class Employee{
	float salary=50000;
}
 class Developer extends Employee{
	 int bonous = 15000;
 }
public class demo4 {
	public static void main(String[] args) {
	 Developer d = new Developer();
	 System.out.println(d.salary+d.bonous);
	}

}
