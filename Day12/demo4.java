package Day12;
//static variable
public class demo4 {
 static int count = 0;
 demo4(){
	 count++;
 }
 
 static int getcount()
 {
	 return count;
 }
	public static void main(String[] args) {
		new demo4();
		new demo4();
		new demo4();
		new demo4();
		new demo4();
		new demo4();
		System.out.println(demo4.getcount());

	}

}
