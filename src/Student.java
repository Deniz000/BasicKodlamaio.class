public class Student extends User{

    private String lesson;
    public Student() {
    }

    public Student(int id, String firstName, String lastName, String nationalId) {
        super(id, firstName, lastName, nationalId);
    }


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
