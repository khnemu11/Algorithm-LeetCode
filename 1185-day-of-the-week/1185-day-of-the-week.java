import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String result = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    	
    	return result;
    }
}
