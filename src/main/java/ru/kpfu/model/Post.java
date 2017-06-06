package ru.kpfu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Andrey on 05.06.2017.
 */
@Entity
@Table(name = "Posts")
public class Post {
    @Id
    private int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
