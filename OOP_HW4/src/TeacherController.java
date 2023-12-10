import java.util.Scanner;

public class TeacherController {
    private TeachersServis teachersServis;
    private TeacherView teacherView;

    public TeacherController(TeachersServis teachersServis, TeacherView teacherView) {
        this.teachersServis = teachersServis;
        this.teacherView = teacherView;
    }

    public void начать() {
        Scanner scanner = new Scanner(System.in);
        boolean работает = true;

        while (работает) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать учителя");
            System.out.println("2. Редактировать учителя");
            System.out.println("3. Показать список учителей");
            System.out.println("4. Выйти");

            int выбор = scanner.nextInt();

            switch (выбор) {
                case 1:
                    System.out.println("Введите имя учителя:");
                    String имя = scanner.next();
                    System.out.println("Введите фамилию учителя:");
                    String фамилия = scanner.next();
                    teachersServis.создатьУчителя(имя, фамилия);
                    break;
                case 2:
                    System.out.println("Введите ID учителя для редактирования:");
                    int id = scanner.nextInt();
                    System.out.println("Введите новое имя:");
                    String новоеИмя = scanner.next();
                    System.out.println("Введите новую фамилию:");
                    String новаяФамилия = scanner.next();
                    teachersServis.редактироватьУчителя(id, новоеИмя, новаяФамилия);
                    break;
                case 3:
                    teacherView.показатьСписокУчителей(teachersServis.получитьСписокУчителей());
                    break;
                case 4:
                    работает = false;
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }
}
