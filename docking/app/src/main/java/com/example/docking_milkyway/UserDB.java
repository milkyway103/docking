package com.example.docking_milkyway;

public class UserDB {
    int SSN;
    String email;
    String pw;
    String nickname;
    int age;
    String sex;
    String usertype;

    UserDB(){
    }

    UserDB(int SSN, String email, String pw, String nickname, String usertype){
        this.SSN = SSN;
        this.email = email;
        this.pw = pw;
        this.nickname = nickname;
        this.age = 0;
        this.sex = "null";
        this.usertype = usertype;
    }

    UserDB(int SSN, String email, String pw, String nickname, int age, String sex, String usertype){
        this.SSN = SSN;
        this.email = email;
        this.pw = pw;
        this.nickname = nickname;
        this.age = age;
        this.sex = sex;
        this.usertype = usertype;
    }

    public int getSSN() { return SSN; }
    public void setSSN(int SSN) { this.SSN = SSN; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPw() { return pw; }
    public void setPw(String pw) { this.pw = pw; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getUsertype() { return usertype; }
    public void setUsertype(String usertype) { this.usertype = usertype; }
}