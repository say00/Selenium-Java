import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractStringDataFromStringText {

	public static void main(String[] args) {

		String extractedString = "";
		String line = "Some text here is places 08-11-2023";
		String pattern = "\\d{2}-\\d{2}-\\d{4}";

		// Create a Pattern object
		Pattern regex = Pattern.compile(pattern);

		// Create a Matcher object
		Matcher matcher = regex.matcher(line);

		// Find the first occurrence of the pattern
		if (matcher.find()) {
			extractedString = matcher.group();
			System.out.println("Extracted string: " + extractedString);
		} else {
			System.out.println("Pattern not found in the line.");
		}

		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(extractedString, inputFormatter);

		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(outputFormatter);

		System.out.println("Extracted date from the String: " + formattedDate);

		String inputString = "Some random text 08-11-2023";
		String[] parts = inputString.split("\\d{2}-\\d{2}-\\d{4}");

		String extractedText = parts[0].trim();

		System.out.println("Text in String input: " + extractedText);
	}
}
