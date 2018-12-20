package chapter.six;

import java.util.Arrays;

/**
 * @author 江峰
 * @create 2018-12-18 16:00
 */
class Connection {
    private static Connection connection = new Connection();

    private Connection() {
    }

    // 这里返回的connection都是同一个connection。
    public static Connection getConnection() {
        return connection;
    }
}

public class ConnectionManager {
    private static Connection[] connections = new Connection[5];

    static {
        System.out.println("初始化了5个connection");
        for (int i = 0; i < connections.length; i++) {
            connections[i] = Connection.getConnection();
        }
    }


    public static Connection getConnection() {
        int i = connections.length;
        if (i > 0) {
            Connection connection = connections[--i];
            connections = Arrays.copyOf(ConnectionManager.connections, i);
            System.out.println("connection[" + i + "]");
            return connection;
        } else {
            System.out.println("null");
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
    }
}
