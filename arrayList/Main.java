public class Main{
	
	public static void main(String[] args)
	{
	    ArrayList<String> arr = new ArrayList();
	    Object[] array = arr.getBackingArray();

		System.out.println("array size is: " + array.length);
	    arr.addToBack("xxx2");
	    arr.addToBack("xxx1");
	    arr.addToFront("Front");

	    System.out.println((String)array[0]);
	    System.out.println((String)array[1]);
	    System.out.println((String)array[2]);

	    String text = arr.removeFromFront();
	    arr.removeFromFront();
	    arr.removeFromFront();
	     arr.removeFromFront();
	    System.out.println(text);
	    System.out.println(arr.size());
	    System.out.println((String)array[0]);



	 //    array = arr.getBackingArray();
		// System.out.println("array size is after addintg two element: " + array.length);

	 //    arr.addToFront("xxx3");

	 //    array = arr.getBackingArray();
		// System.out.println("array size is after addintg three element: " + array.length);

		// // System.out.println(array.length);
		// // System.out.println((String)array[0]);
		// // System.out.println((String)array[1]);
		// // System.out.println((String)array[2]);
		// // System.out.println(arr.size());

		//  arr.addToFront("xxx4");

  // 		array = arr.getBackingArray();
		// System.out.println("array size is after addintg four element: " + array.length);


		// arr.addToFront("xxx5");
		// array = arr.getBackingArray();
		// System.out.println("array size is after addintg 5 element: " + array.length);

		// for (int i = 0; i < 5; i++)
		// {
		// 	arr.addToFront("xxx5" + i);
		// }

		// array = arr.getBackingArray();
		// System.out.println("array size is after addintg 5 element: " + array.length);
	}


}