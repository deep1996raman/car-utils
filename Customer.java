import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer{
	
	 int id;
	
	String name;
	//customer data;
	
	ArrayList<Cars> cars = new ArrayList<Cars>();
	Scanner st = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int ch;
	String carName;
	int carPrice;
	//int[] arr = new int[10];
	static int i=0;
	Customer() throws IOException
	{
		
		System.out.println("enter name of customer");
	name = br.readLine();
	i++;
	id =i; 
	System.out.println("Id customer-:"+id);
		
		//System.out.println();
		
		
				
			}
			
		
		
	
	
	
	void buycars() throws IOException//x is my id;
	{
		//Scanner scan = new Scanner(System.in);
		System.out.println("enter company");
		
		System.out.println("enter 1 for toyota");
		System.out.println("enter 2 for maruti");
		System.out.println("enter 3 for hyundai");
		
	ch = 	st.nextInt();
		
		switch(ch)
		{
		
		case 1:
			System.out.println("enter your car name");
			
			 carName = br.readLine();
			
			System.out.println("enter car price: ");
			carPrice = st.nextInt();
			Toyota obj1 = new Toyota(carName,carPrice);
			cars.add(obj1);
			break;
			
		case 2:
			System.out.println("enter your car name");
			 carName = br.readLine();
			System.out.println("enter car price: ");
			carPrice = st.nextInt();
			Maruti obj2 = new Maruti(carName,carPrice);
		cars.add(obj2);	
		break;
			
		case 3:
			System.out.println("enter your car name: ");
			 carName = br.readLine();
			System.out.println("enter car price: ");
			carPrice = st.nextInt();
			Hyundai obj3 = new Hyundai(carName,carPrice);
			cars.add(obj3);
			break;
		
		}
		
		
		
	}


	private Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
