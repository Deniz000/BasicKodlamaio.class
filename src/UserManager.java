public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi!");
    }

    public void addMultiple(User[] users){
        for (User user: users){
            add(user); // çoklu ekleme
        }
    }
    public void update(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgileri güncelllendi!");
    }

    public void updateMultiple(User[] users){
        for (User user: users){
            update(user); // çoklu ekleme
        }
    }
    public void delete(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgileri silindi!!");
    }

    public void deleteMultiple(User[] users){
        for (User user: users){
            delete(user); // çoklu ekleme
        }
    }
}
