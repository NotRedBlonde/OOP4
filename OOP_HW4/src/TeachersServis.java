import java.util.ArrayList;
import java.util.List;

public class TeachersServis {
    private List<teacher> учителя = new ArrayList<>();
    private int текущийId = 1;

    public void создатьУчителя(String имя, String фамилия) {
        teacher teacher = new teacher(текущийId, имя, фамилия);
        учителя.add(teacher);
        текущийId++;
    }

    public void редактироватьУчителя(int id, String новоеИмя, String новаяФамилия) {
        for (teacher teacher : учителя) {
            if (teacher.getId() == id) {
                teacher.setИмя(новоеИмя);
                teacher.setФамилия(новаяФамилия);
                break;
            }
        }
    }

    public List<teacher> получитьСписокУчителей() {
        return учителя;
    }
}
