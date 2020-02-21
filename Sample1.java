
public class Sample1 {

	public static void main(String[] args) {
		String str1="The quick brown fox jumps over the lazy Dog";
		String str2=" and killed it";
		System.out.println(str1.charAt(13));
		System.out.println(str1.contains("is"));
		System.out.println(str1.concat(str2));
		System.out.println(str1.endsWith("Dog"));
		System.out.println(str1.contentEquals("The quick brown fox jumps over the lazy Dog"));
		System.out.println(str1.matches("The quick brown fox jumps over the lazy Dog"));
	}

}
