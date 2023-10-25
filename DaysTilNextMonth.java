import java.time.*;
public class DaysTilNextMonth 
 {
      public static void main(String[] args) {
      LocalDate day = LocalDate.now();
      String monthName = "October";
      int month = day.getDayOfMonth();
      int daysinmonth = day.lengthOfMonth();
      int currMonth = day.getDayOfMonth();
      int year = day.getYear();
      
      System.out.println(monthName +" " + month +" " + year);

}
}