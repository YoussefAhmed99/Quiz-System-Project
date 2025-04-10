package models;

public class User {
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User [nickname=" + nickname + "]";
    }

    public User(String nickname) {
        this.nickname = nickname;
    }

}
