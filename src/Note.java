import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note implements Comparable{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
    String note;
    Calendar dateAndTime;
    //LocalDateTime dateAndTime;

    Note(GregorianCalendar localDateTime, String note){
        this.dateAndTime = localDateTime;
        this.note = note;
    }

//    Note(LocalDateTime localDateTime, String note){
//        this.dateAndTime = localDateTime;
//        this.note = note;
//    }

    @Override
    public String toString() {
        return sdf.format(dateAndTime.getTime()) + " [" + note + "]";
    }
//    @Override
//    public String toString() {
//        return dateAndTime + " [" + note + "]";
//    }


    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }
}
