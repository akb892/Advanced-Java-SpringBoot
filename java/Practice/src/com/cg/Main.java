package com.cg;

import java.util.*;
public class Main{
	
   static Iterator<Object> func(ArrayList<Object> mylist){
      Iterator<Object> it=mylist.iterator();
      while(it.hasNext()){
         Object element = it;
         if(~~~Complete this line~~~)

			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList<Object> mylist = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}