package com.project.assignment_1;
public class ascending_order {
	public static void main(String[]args) {
		int[] numberset=new int[10];
		int temp;
		numberset[0]=473;
		numberset[1]=23;
		numberset[2]=681;
		numberset[3]=6862;
		numberset[4]=1391;
		numberset[5]=446;
		numberset[6]=94;
		numberset[7]=56;
		numberset[8]=753;
		numberset[9]=111;
		System.out.println("Asecending order is:");
		//compare each element with next element, if found smaller then swap
		for(int i=0;i<10;i++) {					
			for(int j=0;j<10;j++) {				
				if(numberset[i]<numberset[j]) {	
					temp= numberset[i];			
					numberset[i]=numberset[j];	 
					numberset[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(numberset[i]);
		}
	}
	}
