package com.example.ksrtcbookingbase;

import java.util.ArrayList;

public class PRACTICE extends differentclass{
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] arr=new int[]{1,2,3,4,5};

			//for(int i=0;i<arr.length;i++){
			    System.out.println(arr[0]);
			    System.out.println(arr[4]);
			   // break;
			   // }
			int[] arr1 =new int[5];

			for(int i=4;i>=0;i--){
			    arr1[i]=arr[i];
			    System.out.print(arr1[i]+" ");
			}
			
		int sum =0;
			for(int i=0;i<arr.length;i++){
			   sum=sum+arr[i];
			   
			    }
			 System.out.println(sum+" ");
			
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rajiv");
		list.add("Chaitra");
		list.add("arun");
		list.add("suraj");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(2));
			break;
		}
		
		
		String s= "Rajiv Shankar Deshpande";
		
		String[] s1=s.split(" ");
		
		System.out.println(s1[0]);
		
		differentclass diff =  new differentclass();
		String str=diff.plan();
		System.out.println(str );
		
		int[] newarr= new int[] {1,2,2,3,4,5,5};
		
		for(int i=0;i<newarr.length;i++) {
			for(int j=i+1;j<newarr.length;j++) {
				if(arr[i]==arr[j]) {
					
				}
			}
		}
		
		
		
		
		}

	}


