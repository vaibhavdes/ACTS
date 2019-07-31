The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date , the method should return  as the day on that date.

image

Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.


#CODE


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
    //Solution One
        /*
        LocalDate ld = LocalDate.of(year,month,day);
        return ld.getDayOfWeek().toString();
        */
      
    //Solution Two
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String days[] = dfs.getWeekdays();
        Calendar cal = Calendar.getInstance();
        cal.set(year,month - 1, day);
        return days[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }

}
