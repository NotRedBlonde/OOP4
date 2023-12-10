import java.util.List;

public class TeacherView {
    public void показатьСписокУчителей(List<teacher> учителя) {
        System.out.println("Список учителей:");
        for (teacher teacher : учителя) {
            System.out.println("ID: " + teacher.getId() + ", Имя: " + teacher.getИмя() + ", Фамилия: " + teacher.getФамилия());
        }
    }
}
