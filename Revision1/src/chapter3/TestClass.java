package chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass{
	public static void main(String[] args) {
		System.out.println(0 % 2);
		ArrayList al = new ArrayList();
		al.toArray();
		String [] arr = {"1", "LRLR"};
		arr = doesCircleExist(arr);
		System.out.println(Arrays.toString(arr));
	}
	
    static int[] oddNumbers(int l, int r) {
        ArrayList<Integer> al = new ArrayList();
        for(;l <= r;l++){
            if(l%2 != 0){
                al.add(l);
            }
        }
        
        int[] arr = new int[al.size()];

        for(int i = 0; i < al.size(); i++) {
            if (al.get(i) != null) {
                arr[i] = al.get(i);
            }
        }

       
        Character c = new Character('c');
        c.
        return arr;


    }
    
//    static String[] doesCircleExist(String[] commands) {
//        ArrayList<String> al = new ArrayList();
//      for(int i=1; i < commands.length -1; i++){
//          for(int j = 0; j < commands[i].length() - 1; j++){
//              
//          
//          if(commands[j].contains("L") && commands[j].contains("G") == false){
//          	al.add("YES");
//          } else if (commands[j].contains("G") && commands[j].contains("L") == false) {
//          	al.add("YES");
//          } else {
//          	al.add("NO");
//          }
//          
//      }
//      }
//      
//      String[] arr = new String[al.size()];
//
//      for(int i = 0; i < al.size(); i++) {
//          if (al.get(i) != null) {
//              arr[i] = al.get(i);
//          }
//      }
//
//      
//      return arr;
//      
//      
//  }
   
    static String[] doesCircleExist(String[] commands) {
        
        int a = Integer.parseInt(commands[0]);
        String [] arr = new String[a];
     for(int i = 1; i <commands.length ; i++){
    	
        if(a == 1){
        	for(int j = 0; j < commands[i].length(); j++){
        		
        	
       if(commands[i].charAt(j) == 'L' && commands[i].charAt(index)){
       	arr[0] = "YES";
       	System.out.println("a");
       } else if (commands[i].contains("G") && commands[i].contains("L") == false) {
    	   arr[0] = "YES";
    	   System.out.println("b");
       } else {
    	   arr[0] = "NO";
       }
        	}
           
           if(a == 2){
        	   
           }
       
   

         }
         
     }
     return arr; // end of method
  }


}


