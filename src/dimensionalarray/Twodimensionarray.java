package dimensionalarray;

import java.util.Scanner;

public class Twodimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[][]marks=new int[3][4];
		int overalltopper=0;
		
		System.out.println("Enter the 3 classes(4 students each):");
		for(int i=0;i<3;i++) {
			System.out.println("class"+(i+1));
			for(int j=0;j<4;j++) {
				marks[i][j]=sc.nextInt();
				if(marks[i][j]>overalltopper) overalltopper=marks[i][j];
				
			}
			
		}
		
		for(int i=0;i<3;i++) {
			int total=0;
			int highest = marks[i][0];
			System.out.print("class"+(i+1)+"Marks:");
			for(int j=0;j<4;j++) {
				System.out.print(marks[i][j] + "" );
				total+=marks[i][j];
				if(marks[i][j]>highest) highest =marks[i][j];
			System.out.println("\n Total of class"+(i+1)+":"+total);
			System.out.println("Highest of class"+(i+1)+":"+highest);
			System.out.println();
		}
		System.out.println("Overall Topper Mark:"+overalltopper);
		sc.close();
	}
	}
}
