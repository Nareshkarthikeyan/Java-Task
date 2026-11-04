package dimensionalarray;

import java.util.Scanner;

public class Threedimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[][][] marks=new int[2][3][3];
		int overallhighest=0;
		
		System.out.println("Enter marks(2 dept,2 class,3 students):");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					System.out.println("Dept"+i+"class"+j+"student"+k+":");
					marks[i][j][k]=sc.nextInt();
					if(marks[i][j][k]>overallhighest)overallhighest=marks[i][j][k];
					
				}
		}

	}
		
		for(int i=0;i<2;i++) {
			int depthighest=marks[i][0][0];
			System.out.println("\n---Department"+(i+1)+"---");
			for(int j=0;j<2;j++) {
				int total=0;
				System.out.print("class"+(j+1)+"Marks:");
				for(int k=0;k<3;k++) {
					System.out.print(marks[i][j][k]+"");
					total+=marks[i][j][k];
					if(marks[i][j][k]>depthighest)depthighest=marks[i][j][k];
					
				}
				double avg=total/3.0;
				System.out.println("|Average:"+avg);
				
			}
			System.out.println("Highest in Dept"+(i+1)+":"+depthighest);
			
			
		}
		
		System.out.println("\noverall highest mark:"+overallhighest);
		sc.close();

}

}