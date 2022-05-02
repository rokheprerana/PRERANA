package reversestring;

public class REVERSESTRING {

	public static void main(String[] args) {
		String s1="I AM STUDENT";
		String[]arr=s1.split(" ");
		String finarr= " ";
		int length=arr.length;
		for(int i=(length-1);i>=0;i--)
		{
			finarr=finarr+arr[i]+" ";
		}
		System.out.println(finarr);
	}

}
