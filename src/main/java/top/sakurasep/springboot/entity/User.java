package top.sakurasep.springboot.entity;

public class User {
    String nickname;
    String phone;

    public String getNickname() {
        return nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
