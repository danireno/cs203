
public class SumOfEven {
	public static void main(String args[]){
		int nums[]={3,8,4,10,14,5,21};
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2==0)
				sum+=nums[i];

		}
		System.out.println("the sum of all even number is "+sum);
	}

}
