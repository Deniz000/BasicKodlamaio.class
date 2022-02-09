public class InstructorManager extends UserManager{
    public void addTeachings(Instructor user,String lesson){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson  + " dersi eklendi. İyi Dersller!");
    }
    public void addMultible(Instructor user,String[] lessons){
        for (String lesson: lessons) {
            addTeachings(user,lesson);
        }
    }
    public void deleteTeachings(Instructor user,String lesson){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson  + " dersi silindi! Artık bu dersi vermiyor!");
    }
    public void deleteMultible(Instructor user,String[] lessons){
        for (String lesson: lessons) {
            deleteTeachings(user,lesson);
        }
    }
    public void updateTeachings(Instructor user,String lesson){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " için " + lesson  + " dersi bilgileri güncelleni!");
    }
    public void updateMultible(Instructor user,String[] lessons){
        for (String lesson: lessons) {
            updateTeachings(user,lesson);
        }
    }
    public void addAppellation(Instructor user, String appellation){
        user.setAppellation(appellation);
        System.out.println("Ünvan eklendi. Bilgi güncellendi!");
        System.out.println(user.getAppellation() + " " + user.getFirstName() + " " + user.getLastName());
    }
    public void updateAppellation(Instructor user, String appellation){
        System.out.println("Bilgi güncellendi!");
        System.out.println(user.getAppellation() + " " + user.getFirstName() + " " + user.getLastName());
    }
    public void deleteAppellation(Instructor user, String appellation){
        System.out.println("Ünvan Silindi. Bilgi güncellendi!");
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }
}
