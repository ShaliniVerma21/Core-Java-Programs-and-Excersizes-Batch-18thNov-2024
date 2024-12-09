package Day12;
//invoking other constructor
public class demo2 {
int height;
int width;

//constructor-1
 demo2(int height,int width)
 {
	 this.height=height;
	 this.width=width;
 }
//constructor-2
 demo2(int side)
 {
	 this(side,side);//calling constructor-1
 }
 
 public int area()
 {
	 return height*width;
 }
	public static void main(String[] args) {
		demo2 obj = new demo2(5);
		
		System.out.println("Area is  : "+obj.area());

	}

}
