package education.storages;


import education.model.User;
import education.util.FileUtil;
import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    public Map<String, User> users = new HashMap<>();


    public void add(User user) {
        users.put(user.getEmail(), user);
        FileUtil.serializeUsers(users);
    }


    public void print() {
        for (User value : users.values()) {
            System.out.println(value);

        }

    }
//        Iterator<Book> iterator = books.iterator();
//        while (iterator.hasNext()){
//            Book book = iterator.next();
//            System.out.println(book);
//        }


    public User getByEmail(String email) {
        return users.get(email);
    }


    public void checkUserForRegistering(String email) {
        for (String s : users.keySet()) {
            if (users.containsKey(email)) {
                System.out.println("user already exists");
                return;
            }

        }

    }

    public void initData() {
        Map<String, User> userMap = FileUtil.deserializeUsers();
        if (userMap != null) {
            users = userMap;
        }
    }
}


