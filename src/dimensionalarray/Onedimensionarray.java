package dimensionalarray;

import java.util.Scanner;

public class Onedimensionarray {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			int[]marks=new int[10];
			
			int total=0,highest,lowest,pass=0,fail=0;
			
			System.out.println("Enter 10 students marks");
			for(int i=0;i<10;i++) {
				marks[i]=sc.nextInt();
			}
				highest=marks[0];
				lowest= marks[0];
				
				System.out.println("ALL marks");
				for(int i=0;i<10;i++) {
					System.out.println(marks[i]+" ");
					total+=marks[i];
					if(marks[i]>highest)highest=marks[i];
					if(marks[i]<lowest)lowest=marks[i];
					if(marks[i]>=35)pass++;
					else fail++;
					
					
				}
				
				double avg=(double) total/10;
				System.out.println("\nHighest mark:"+highest);
				System.out.println("Lowest mark:"+lowest);
				System.out.println("Average:"+avg);
				System.out.println("Passed:"+pass);
				System.out.println("Failed:"+fail);
				sc.close();
				
			}
			
			

		}


