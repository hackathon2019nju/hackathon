package com.dypro.hackathon.user.model;

/**
*@Entity
* Description:information for user
* include name,password,access
* */

import javax.persistence.*;

@Entity
@Table(name = "userRegistInfo_")
public class UserRegistInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;//索引

    @Column(name = "userName")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="access")
    private String access;

    /**
     * @Constructor
     */

    public UserRegistInfo(String userName, String password, String access) {
        this.userName = userName;
        this.password = password;
        this.access = access;
    }

    public UserRegistInfo() {
    }

    /**
     * @Getter
     * @Setter
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * @toString
     */

    @Override
    public String toString() {
        return "UserRegistInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", access='" + access + '\'' +
                '}';
    }
}
