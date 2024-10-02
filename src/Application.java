import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Git Push...");
		System.out.println("Size of the element");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] element=new int[size];
		for(int i=0;i<size;i++){
		    System.out.println("Enter the element"+i);
		    element[i]=in.nextInt();
		    
		}
		System.out.println("Target:");
		int target=in.nextInt();
			System.out.println("Target:"+target);
		
		int[] sums=new int[2];
		for(int i=0;i<size;i++){
		    for(int j=i+1;j<size;j++){
		        if(target==element[i]+element[j]){
		            sums[0]=element[i];
		            sums[1]=element[j];
		            System.out.println("sums[i]+sums[j]:"+sums[0]+","+sums[1]);
		            System.out.println("element[i]+element[j]:"+element[i]+","+element[j]);
		        }
		    }
		    
		}
		 for (int sum : sums) {
	            System.out.println(sum);
	        }
	}
}
