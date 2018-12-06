package IOAndFile;

import java.io.*;

/**
 * @author 潇潇暮雨
 * @create 2018-09-11   10:51
 */
class User implements Serializable {
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class Login implements Serializable {
    private User user;

    public Login(User user) {
        this.user = user;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Login login = new Login(new User("zhangsan", "123"));
        System.out.println("序列化之前");
        System.out.println(login.user);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\对象.txt"));
        out.writeObject(login);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\对象.txt"));
        Login login1 = (Login) in.readObject();
        System.out.println("序列化之后");
        System.out.println(login1.user);
    }
}
