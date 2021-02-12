package enums;

public enum Credentials {

    TEST("artol@bk.ru", "test"),
    TEST_TWO("123", "asdasd");

    public String login;
    public String password;

    Credentials(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
