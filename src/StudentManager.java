public class StudentManager extends UserManager {

    public void addLesson(Student user, String lesson) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson + " dersi eklendi ");
    }

    public void addMultiple(Student user, String[] lessons) {
        for (String lesson : lessons) {
            addLesson(user, lesson);
        }
    }

    public void deleteLesson(Student user, String lesson) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson + " dersi silindi ");
    }

    public void deleteMultiple(Student user, String[] lessons) {
        for (String lesson : lessons) {
            deleteLesson(user, lesson);
        }
    }

    public void updateLesson(Student user, String lesson) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson + " ders bilgileri güncellendi ");
    }

    public void updateMultiple(Student user, String[] lessons) {
        for (String lesson : lessons) {
            updateLesson(user, lesson);
        }
    }
}
