import java.time.*;
import java.time.format.*;

class Solution {
    public int dayOfYear(String date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate inputDate = LocalDate.parse(date, format);
    	
    	return inputDate.getDayOfYear();
    }
}