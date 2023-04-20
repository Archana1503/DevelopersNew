package WrittenAssignment4;

public class RemoveDublicate {

		static void find(int arr[])
		{
			for(int i=0;i<arr.length;i++) 
			{
				boolean visited=false;
				int count=1;
				for(int j=i-1;j>=0;j--)
				{
					 if (arr[i]==arr[j])
					 
					 { visited=true;
						 break;
					 }//backword to check visited or not
				}
					 if(visited==false) {
						 for(int k=i+1;k<arr.length;k++)
						 {
							 if(arr[i]==arr[k])
							 {
								 count++;
								 
							 }
							 
							 
						 }
					 
						 if(count>=1) {
						 System.out.println(arr[i]+"  ");
							 
						 }
						
					 
					 }
			}
			
		}
		
			
		public static void main(String[] args) {
			int arr[]= {4,3,2,4,9,2};
			RemoveDublicate u=new RemoveDublicate();
			u.find(arr);
			
			
		}
			
			

		}





