import java.util.*;



public class TokenRing{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of nodes  you want in ring");
		int n=sc.nextInt();
		
		System.out.print("Token ring is as follow");
		for(int i=0;i<n;i++){
			System.out.print(i+" ");
		}
		
		System.out.print("0");
		
		int choice=0;
		do{
			System.out.println("Enter the sender:");
			int sender=sc.nextInt();
			
			System.out.println("Enter the receiver:");
			int receiver=sc.nextInt();
			
			System.out.println("Enter the data to send");
			int data=sc.nextInt();
			
			int token=0;
			
			System.out.println("\n Token Passing");
			
			for(int i=token;i<sender;i++){
				System.out.println(" "+ i +"-->");
			}
			System.out.println(" "+sender);
			
			System.out.print("Sender:"+sender+"sending data:"+data);
			
			for(int i=sender;i!= receiver;i=(i+1)%n){
				System.out.println(data +"forward by"+i);
			}
			
			System.out.println(receiver +"received the"+data);
			
			token=sender;
			
			System.out.println("Do you want to send data again if yes enter 1, if no enter 0");
			choice=sc.nextInt();
			
		}while(choice==1);
		
	}
}