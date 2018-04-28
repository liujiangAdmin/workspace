package com.ucmed.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by ZY-LJ-1446 on 2018/3/20.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private double money;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }


}
