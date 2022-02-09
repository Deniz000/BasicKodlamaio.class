public class Main {
    public static void main(String[] args){

        String[] lessons = {"Java", "C#", "Python", "C", "C++"};


        Student student1 = new Student(1, "Fatma", "Orhan","23673993773");
        Student student2 = new Student(2,"Emre","Eren", "36564567774" );
        Student student3 = new Student(3,"Deniz", "Özdemir", "12736746567" );
        Student student4 = new Student(4,"Zehra", "Yıldız","465764893647");

        Student[] students =  {student1, student2, student3, student4};

        Instructor instructor1 = new Instructor(5, "Engin","Demiroğ","64792876543",1);
        Instructor instructor2 = new Instructor(6, "Kerem","Şanlı", "92876543345", 2);
        Instructor instructor3 = new Instructor(7, "Aslı","Genç", "92260743342", 3);

        Instructor[] instructors = {instructor1, instructor2};

        StudentManager studentManager1 = new StudentManager();
        studentManager1.addMultiple(students);
        studentManager1.addLesson(student1, lessons[3]);
        studentManager1.addLesson(student2, lessons[2]);
        studentManager1.addMultiple(student3, lessons);
        studentManager1.addMultiple(student3, lessons);

        StudentManager studentManager2 = new StudentManager();
        studentManager2.deleteMultiple(student3, lessons);
        studentManager2.delete(student4);
        studentManager2.updateLesson(student2,lessons[1]);

        InstructorManager instructorManager1 = new InstructorManager();
        instructorManager1.addMultiple(instructors);
        instructorManager1.addTeachings(instructor1, lessons[0]);
        instructorManager1.addTeachings(instructor1, lessons[1]);
        instructorManager1.addMultible(instructor2, lessons);

        instructorManager1.addAppellation(instructor1, "Java/C# Developer");
        instructorManager1.addAppellation(instructor2, "Python/C Developer");

        InstructorManager instructorManager2 = new InstructorManager();
        instructorManager1.delete(instructor3);
        instructorManager2.deleteTeachings(instructor2, lessons[1]);



    }
}
