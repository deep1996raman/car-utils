import java.io.IOException;
import java.util.*;

public class Admin implements UserChoice{

	
static int i=0;
	 

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Customer[] addName = new Customer[10];
		 ArrayList<Customer> customerList = new ArrayList<Customer>();
		 int storeId[]= new int[10];
		// int random_id[] = new int[6];
		 Scanner sc= new Scanner(System.in);
		while(true)
		{
			
			System.out.println("press 1 to Add customers:");
			System.out.println("press 2 to Add car to customers:");
			System.out.println("press 3 to List all customers:");
			System.out.println("press 4 to List individual customer based on ID:");
			System.out.println("press 5 to Generate prizes for customer:");
			System.out.println("press 0 to Exit:");
			
			int chooseSwitchNo = sc.nextInt();
			int flag=0;
			
			switch(chooseSwitchNo)
			{
			case EXIT:
				flag=1;
				break;
				
			
			case ADD_CUSTOMER:
				
				//Customer[] add_name = new Customer[10];
				addName[i]= new Customer();
				customerList.add(addName[i]);
				i++;
				break;
				
			case ADD_CAR_TO_CUSTOMER:
				System.out.println("enter  id of customer:");
			
				int passId = sc.nextInt();
			for(Customer counter: customerList)
			{
				if(counter.id==passId)
				{
					int index = customerList.indexOf(counter);// it returns the value of index;
					addName[index].buycars();
				}
				
			}
				//Customer add_cars = new Customer(pass_id);//parametrized constructore is fired;
				 
				break;
				
			case LIST_CUSTOMER:
				//Customer list_disp = new Customer();
				
				
				for(Customer counter: customerList)
				{
					
					
					System.out.println("name of the customer is: " + counter.name);
					System.out.println("id of the customer is: " + counter.id);
						
					for(Cars counter1: counter.cars)
					{
						
						System.out.println("model of car is: " + counter1.model);
						
						System.out.println("price is: " + counter1.price);
						
						System.out.println("resale val is: " + counter1.resaleVal);
					}
					
				}
				
				break;
				
			case LIST_INDIVIDUAL:
				//Customer list_id = new Customer();
				System.out.println("enter id of customer");
				int idRecog= sc.nextInt();
				
				for(Customer counter: customerList)
				{
				
					if(counter.id ==idRecog)
					{
						System.out.println("name of the customer is: " + counter.name);
						System.out.println("id of customer is: " + counter.id);
						
					}
					
					
				}
				
					break;
			
			case GENERATE_PRIZES:
				int k=0;
				for(Customer counter:customerList)
				{
					storeId[k] = counter.id;
					k++;
				}
				
				Random rand = new Random();
				k=0;
					
				//	int[] random_id = pickNRandom(store_id, 6);
				
				
				    List<Integer> list = new ArrayList<Integer>(storeId.length);
				    for (int i : storeId)
				        list.add(i);
				    Collections.shuffle(list);

				    int[] randomId = new int[6];
				    for (int i = 0; i < 6; i++)
				    {
				        randomId[i] = list.get(i);
				    }
				        Arrays.sort(randomId);
				
				
				System.out.println("enter 3 numbers: ");
			int num1  = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				for(int i=0;i<randomId.length;i++)
				{
					
					if(randomId[i]==num1 || randomId[i]==num1 || randomId[i]==num1)
					{
					
					System.out.println("winner is :" + randomId[i]);	
					break;
					}
					
				}
				
				
				
				break;	
			
			}
			if(flag==1)
			{
				System.out.println("exiting:");
				break;
			}
			
			
			
		}
		
		
		
		
	}


	private static int[] pickNRandom(int[] storeId, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
