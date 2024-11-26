package Day6;

public class demo7 {
	//labled loop example-7
	public static void main(String[] args) {  
	    //Using Label for outer and for loop  
	    aa:  
	        for(int i=1;i<=3;i++){  //denoted rows
	            bb:  
	                for(int j=1;j<=3;j++){  //denotes columns
	                    if(i==2&&j==2){  
	                        break aa;  
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        }  
	}  
	}  
