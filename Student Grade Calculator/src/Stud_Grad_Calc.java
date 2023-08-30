import java.util.Scanner;

public class Stud_Grad_Calc {

	public static void main(String[] args) {
		int marks[]=new int [6];
		
		float total=0;
		float avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks for the subject between 0 and 100 \n");
		for(int iteration=1; iteration <= 5; iteration++) {
				marks[iteration] = sc.nextInt();
				if(marks[iteration]<=0 || marks[iteration]>100) {
					iteration=0;
					System.out.println("Please enter marks between 0 and 100");
					continue;
				}
				else {
						total = total + marks[iteration];
				}
		}
				sc.close();
				avg=total/5;
				System.out.println("The student grade is : ");
				if(avg>=80) {
					System.out.println("A");
				}
				else if(avg>=60 && avg<80){
					System.out.println("B");
				}
				else if(avg>=40 && avg<60){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
	}
}
				

