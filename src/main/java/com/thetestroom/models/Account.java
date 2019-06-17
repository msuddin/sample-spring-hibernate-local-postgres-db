package com.thetestroom.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// An Entity refers to a table, in this case an Account table
// Each instance of an Entity refers to a row in that table
public class Account {

    @Id
    // Id refers to the primary key of an Entity
    private Long id;
    private String name;

    public Account() { }

    public Account(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
