package hello.jdbc.connection;

//상수로 사용하기 위해 abstract로 객체 생성을 막아놓았다.
public abstract class ConnectionConst {

    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";

}
