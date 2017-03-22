import java.io.IOException;
import java.util.*;

public class Admin implements UserChoice{

	
static int i=0;
	 

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Customer[] add_name = new Customer[10];
		 ArrayList<Customer> customer_list = new ArrayList<Customer>();
		 int store_id[]= new int[10];
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
				add_name[i]= new Customer();
				customer_list.add(add_name[i]);
				i++;
				break;
				
			case ADD_CAR_TO_CUSTOMER:
				System.out.println("enter  id of customer:");
			
				int pass_id = sc.nextInt();
			for(Customer counter: customer_list)
			{
				if(counter.id==pass_id)
				{
					int index = customer_list.indexOf(counter);// it returns the value of index;
					add_name[index].buycars();
				}
				
			}
				//Customer add_cars = new Customer(pass_id);//parametrized constructore is fired;
				 
				break;
				
			case LIST_CUSTOMER:
				//Customer list_disp = new Customer();
				
				
				for(Customer counter: customer_list)
				{
					
					
					System.out.println("name of the customer is: " + counter.name);
					System.out.println("id of the customer is: " + counter.id);
						
					for(Cars counter1: counter.cars)
					{
						
						System.out.println("model of car is: " + counter1.model);
						
						System.out.println("price is: " + counter1.price);
						
						System.out.println("resale val is: " + counter1.resale_val);
					}
					
				}
				
				break;
				
			case LIST_INDIVIDUAL:
				//Customer list_id = new Customer();
				System.out.println("enter id of customer");
				int id_recog= sc.nextInt();
				
				for(Customer counter: customer_list)
				{
				
					if(counter.id ==id_recog)
					{
						System.out.println("name of the customer is: " + counter.name);
						System.out.println("id of customer is: " + counter.id);
						
					}
					
					
				}
				
					break;
			
			case GENERATE_PRIZES:
				int k=0;
				for(Customer counter:customer_list)
				{
					store_id[k] = counter.id;
					k++;
				}
				
				Random rand = new Random();
				k=0;
					
				//	int[] random_id = pickNRandom(store_id, 6);
				
				
				    List<Integer> list = new ArrayList<Integer>(store_id.length);
				    for (int i : store_id)
				        list.add(i);
				    Collections.shuffle(list);

				    int[] random_id = new int[6];
				    for (int i = 0; i < 6; i++)
				    {
				        random_id[i] = list.get(i);
				    }
				        Arrays.sort(random_id);
				
				
				System.out.println("enter 3 numbers: ");
			int num1  = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				for(int i=0;i<random_id.length;i++)
				{
					
					if(random_id[i]==num1 || random_id[i]==num1 || random_id[i]==num1)
					{
					
					System.out.println("winner is :" + random_id[i]);	
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


	private static int[] pickNRandom(int[] store_id, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}