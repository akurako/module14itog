import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class Reminder {
    List<Note> noteList = new ArrayList<>();

    void addNote(GregorianCalendar dateTime, String note) {
        noteList.add(new Note(dateTime, note));
    }

//    void addNote(LocalDateTime dateTime, String note){
//        noteList.add(new Note(dateTime,note));
//    }

    void showAllNotes() {
        Collections.sort(noteList);
        for (Note note : noteList) {
            System.out.println(note);
        }
    }

//    void showAllNotesUsingStream() {
//        noteList.stream()
//                .map(Note::toString)
//                .sorted()
//                .forEach(System.out::println);
//    }
}
