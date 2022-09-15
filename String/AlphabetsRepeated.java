package String;

public class AlphabetsRepeated {

	public static void main(String[] args) {
		String str="kajlalkhuale";
		
		int count =0;
		int length=str.length();
		char[]arr=str.toCharArray();
		for(int i=0;i<length;i++)
		{
			for(int j=1+i;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate characters are:"+arr[j]);
					count++;
					}
			}
		}
		System.out.println("count of duplicate characters:"+count);
		

	}

}
