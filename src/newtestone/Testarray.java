package newtestone;

public class Testarray{  
	private String emp;
	private int number;
	
	
	
public Testarray(String emp, int number) {
		super();
		this.emp = emp;
		this.number = number;
	}

public Testarray() {
		super();
	}

public String getEmp() {
		return emp;
	}

	public void setEmp(String emp) {
		this.emp = emp;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

public static void main(String args[]){  
	
	
	
	
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}}  