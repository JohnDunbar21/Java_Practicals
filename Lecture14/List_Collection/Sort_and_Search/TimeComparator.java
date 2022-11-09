/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.8

Custom Comparator class that compares two Time objects.
*/
import java.util.Comparator;
import java.time.LocalTime;

public class TimeComparator implements Comparator<LocalTime>{

    @Override
    public int compare(LocalTime time1, LocalTime time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if(hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();

        if(minuteDifference != 0) {
            return minuteDifference;
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}