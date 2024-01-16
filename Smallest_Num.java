package DSA;

import java.util.Hashtable;
import java.util.Map;

// Find the smallest number of N such that product of S would be equal to N
// examle N=100, S=4*5*5 ==100
public class Smallest_Num 
{
   public static void main(String[] args) 
   {
	 int num=100;
	 Hashtable<Integer, Integer> dic= new Hashtable<Integer, Integer>();
	 String ans=" ";
	 for(int i=9; i>1; i--)
	 {
		// int j=1;
		 while(num%i==0)
		 {
			 num=num/i;
			 ans=i +ans;
			 
			// j++;
		 }
	 }
	 System.out.println(ans);
//	 for(Map.Entry<Integer, Integer> m: dic.entrySet())
//	 {
//		 //System.out.println("element : " + m.getKey()+" "+m.getValue());
//         if(m.getValue()>1)
//         {
//            int i=m.getValue();
//            while(i>0)
//            {
//            	System.out.print(m.getKey()+ " ");
//            	i--;
//            }
//         }
//         else
//         {
//        	 System.out.print(m.getKey()+ " ");
//         }
//	 }
	 
   }
}

// another approach for solve this problem is that just store value in string rather create dictonary !
