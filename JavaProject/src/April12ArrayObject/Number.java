package April12ArrayObject;
import java.util.Scanner; 

public class Number {
	public void closestNumber(int arr[]) {
		
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					temp=arr[j];
					
				}
			}
			System.out.println(arr[i]);
			}
		
			
		}
	
	

	public static void main(String[] args) {
		int arr[]= {2,30,6,9,8,};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number whose closest value to be fimd");
//		int num=sc.nextInt();
		Number n=new Number();
		n.closestNumber(arr);
		
		

	}
}
