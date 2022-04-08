import java.util.regex.*;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "^S[^u]\\d+\\.";
        String[] input = {
            "So64.",
            "Soa7."
        };

        Pattern p = Pattern.compile(pattern);

        for (String in : input) {
            boolean found = p.matcher(in).lookingAt();

            System.out.println(in+(found ? " -- MATCHES THE PATTERN " : " -- DOESN'T MATCH THE PATTERN "));
        }
	}

}
