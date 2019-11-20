package com.dypro.hackathon.user.model;


/**
 *@Entity
 * Description:information for user's ownership of markets
 * include name,password,access
 * */

import javax.persistence.*;

@Entity
@Table(name = "userOwnershipInfo_")
public class UserOwnershipInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;//索引

    @Column(name="userName")
    private String userName;

    @Column(name="ownership")
    private String ownership;     //format:market1;market2;marker3


    /**
     * @Constructor
     */

    public UserOwnershipInfo(String userName, String ownership) {
        this.userName = userName;
        this.ownership = ownership;
    }

    public UserOwnershipInfo() {
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

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    private String[] getMarketsName(){
        return this.ownership.split(";");
    }

    /**
     * @toString
     */

    @Override
    public String toString() {
        return "UserOwnershipInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", ownership='" + ownership + '\'' +
                '}';
    }
}
