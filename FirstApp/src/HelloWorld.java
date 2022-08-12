import java.util.*;
class HelloWorld {
   	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello World!");
		ArrayList<String> gfg = new ArrayList<String>();
		gfg.add("Geeks");
		gfg.add("for");
		gfg.add("Geeks");
//		System.out.println(gfg);
//        System.out.println(gfg.size());
//		System.out.println(gfg);
		
		
		ArrayList<String> gfg1 = new ArrayList<String>();
        gfg1=gfg;
        
		gfg1.set(2, "45");
		
	   
		System.out.println(gfg1);
		System.out.println(gfg);
        gfg1.remove(2);
        System.out.println(gfg1);
		System.out.println(gfg);

		
		//----------------------------------
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= new int[6];
		arr1=arr;
		arr1[2]=22;
	   
		System.out.println(arr[2]);
		System.out.println(arr1[2]);
		System.out.println(arr.length);
		System.out.println(arr1.length);
		
		


	}
}
