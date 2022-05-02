
public class stringandstringbuilder_difference {

	public static void main(String[] args) {
		String s="PQR TWH MN";
		StringBuilder obj=new StringBuilder("ABC");
		s.concat("ijkl");
		obj.append("GHT");
		System.out.println(s);
		System.out.println(obj);

	}

}
