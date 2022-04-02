import java.util.Spliterator;

public class LearnString {
public static void main(String[] args) {
	String text ="good morning everyone present here";
	int lengthText = text.length();
	System.out.println(lengthText);
	char charAt=text.charAt(8);
	System.out.println(charAt);
	int indexOf = text.indexOf('n');
	System.out.println(indexOf);
	//how to convert a string to aarray
	char[] charArray = text.toCharArray();
	for (int i = 1; i <charArray.length ; i++) {
		System.out.println(charArray[i]);
	}
	//split the words
	String[] splitArray = text.split("good morning everyone present here");
	for (int i= 0;  i< splitArray.length; i++) {
		System.out.println("split ["+i +"]:"+splitArray[i]);
	}
}

}

