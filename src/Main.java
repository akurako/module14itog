import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Reminder reminder = new Reminder();
        reminder.addNote(new GregorianCalendar(2021,9,17,9,30),"Meeting at work.");
        reminder.addNote(new GregorianCalendar(2021,7,3,20,00),"Dinner with family");
        reminder.addNote(new GregorianCalendar(2021,7,25,9,00),"Buy a birthday gift for Alex");
        reminder.addNote(new GregorianCalendar(2021,7,25,18,00),"Alex's birthday party");

//        reminder.addNote(LocalDateTime.of(2021,8,17,9,30),"Meeting at work.");
//        reminder.addNote(LocalDateTime.of(2021,6,3,20,00),"Dinner with family");
//        reminder.addNote(LocalDateTime.of(2021,6,25,9,00),"Buy a birthday gift for Alex");
//        reminder.addNote(LocalDateTime.of(2021,6,25,18,00),"Alex's birthday party");



        reminder.showAllNotes();

        //        reminder.showAllNotesUsingStream();
    }
}
