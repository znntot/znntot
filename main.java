import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String text = "Hello World!";
		String key = "key-text";
		
		String value = AtomicEncryptor.encrypt(text, key);
		
		System.out.println(value);

	}
}