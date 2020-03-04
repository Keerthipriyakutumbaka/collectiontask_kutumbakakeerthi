package epamtask.collection;

public class mainclass {
		   
	    public static void main(String[] args) 
	    {
	        custom_list<Integer> list = new custom_list<>();
	 
	        //Add elements
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);
	       
	         
	        //Remove elements from index
	        list.remove(2);
	       
	         
	        //Get element with index
	        System.out.println( list.Get_element(0) );
	        System.out.println( list.Get_element(1) );
	        System.out.println( list.Get_element(3) );
	        System.out.println( list.Get_element(4) );
	        System.out.println( list.Get_element(5) );
	   	 
	 
	        //List Size
	        System.out.println(list.get_size());
	    }

}
