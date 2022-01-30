package listinterface;
import java.util.*;

public class listinterface {
	public static void main(String  args[]) {
		/*List<Integer> val=new ArrayList<>();
		val.add(1);
		val.add(4);
		val.add(8);
		System.out.println(val);*/
//using Iterator;
		/*List<Integer> val = new ArrayList<>(); 
       	val.add(0); 
       	val.add(11); 
       	val.add(23); 
       	val.add(15);
       	val.add(18);
        //remove method
        val.remove(1);
     Iterator z=val.iterator();
        while(z.hasNext())
            {
              System.out.println(z.next());}
              System.out.println("ArrayList : " + val); 
 //after removing;
              System.out.println(val);*/
		
//ADD ALL method;
		/*List<String> list1 =new ArrayList<>();
		list1.add("I AM");
		list1.add("Irfan");
		list1.add("Pasha");
		System.out.println(list1);
		List<String> list2 =new ArrayList<>();
		list2.add("I AM");
		list2.add("Here TO");
		list2.add("rule");
		System.out.println(list2);
		list1.addAll(list2);
		System.out.print(list1);*/
//clear method
		
		/*List<String> val = new ArrayList<>(); 
       	val.add("JAVA"); 
       	val.add("IS");
       	val.add("INTRESTING");
	    System.out.println("before clear :" +val);
       	val.clear();
	    System.out.println("after clear :" +val); */
		
//Contains method;
		/*List<String> val = new ArrayList<>();
		val.add("I AM ");
		val.add("Iron man");
		val.add("RDJ");
		System.out.println(val);
		boolean ispresent = val.contains("Iron man");
		System.out.println(ispresent);*/
		
//size 
		/*List<Integer> val =new ArrayList<Integer>();
		val.add(1);
		val.add(2);
		val.add(3);
		val.add(4);
		val.add(5);
		val.add(6);
		System.out.println(val);
		int value=val.size();
		System.out.println(value);*/
//removeall method
		/*List<String> list1=new ArrayList<>();
		List<String> list2 =new ArrayList<>();
		list1.add("Pushpa");
		list1.add("Pushparaj");
		list1.add("main");
		list1.add("Jhukega nahi");
		list1.add("sala");
		System.out.println(list1);
		list2.add("Pushpa ko");
		list2.add("flower samjhtha kya");
		list2.add("Pushpa Fire hai Fire");
		System.out.println(list2);
		list2.removeAll(list1);
		System.out.println(list2);*/
		
//sublist();
		/*ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("Random");
        list.add("click");
        System.out.println(list);
       List<String > list1 = list.subList(0,3);
       System.out.println(list1);*/
		
//rotate method;
		/*List<String> list =new ArrayList<>();
		list.add("Be");
		list.add("The");
		list.add("Ruler");
		System.out.println("before rotate:\n"+ list);
		//rotate comes umder collections
		Collections.rotate(list, 3);
		System.out.println("after rotate:\n"+list);*/
		
//shuffle and reverse order
    /*	List<String> list = new ArrayList<>();
        list.add("C");
        list.add("Python");
        list.add(".net");
        list.add("Compiler");
        list.add("ruby");
        list.add("Html,CSS");
        Collections.sort(list,Collections.reverseOrder());
        Collections.shuffle(list);
        System.out.println("Before Shuffle:\n"+ list);
        Collections.shuffle(list);
        System.out.println("after Shuffle:\n" + list);*/
		
//fill method ,get()Method ,Set()Method,isEmpty();
	  /*  List<String> list =new ArrayList<>();
		list.add("c");
		list.add("Python");
		list.add("Ruby");
		list.add("Perl");
		System.out.println(list);
		//Collections.fill(list,"Programing Languages");
		//System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		list.set(3, "Java");
		System.out.println(list);
		list.set(2, "Kotlin");
		System.out.println(list);
		System.out.println(list.isEmpty());*/
		
//Linked List add method
		/*LinkedList<String> ll=new LinkedList<String>();  
        ll.add("I");  
        ll.add("AM");  
        ll.add("THE");  
        //ll.addFirst("Best");
        ll.addLast("Best");
    System.out.println("linked List method: "+ll);*/
		
//arrays.aslist
		/*ArrayList<String> list = new ArrayList<String>(Arrays.asList("Peter","Parker","Stark"));
		  System.out.println("Elements are:"+list);*/
		
//peek() method:It retrives the value of first postion ;
		
		/*LinkedList list = new LinkedList();  
        list.add("Hi"); 
        list.add("Welcome"); 
        list.add("To"); 
        list.add("The ");   
        System.out.println("The initial list is :" + list);  
        System.out.println("Head of the list : " + list.peek());
        System.out.println("Head of the list : " + list.peekFirst());
        System.out.println("Head of the list : " + list.peekLast());*/
        
//poll() method:it removes the first and last value;
        
		LinkedList list = new LinkedList();  
        list.add("Hi"); 
        list.add("Welcome"); 
        list.add("To"); 
        list.add("The ");   
        System.out.println("The initial list is :" + list);  
        System.out.println("Head of the list : " + list.peek());
        System.out.println("Head of the list : " + list.peekFirst());
        System.out.println("Head of the list : " + list.peekLast());
        

		

		

		

		
		
		
		

		
	} 

	 }

