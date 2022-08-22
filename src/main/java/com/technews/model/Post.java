package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "post")
public class Post implements Serializable {
}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

@Transient
private String username;
@Transient
private int voteCount;


// this variable is not to be allowed to be null in the database
@NotNull
// allows type date in the database and signals to the JPA that these fields will house data of that type
@Temporal(TemporalType.DATE);
// designates the names of the columns
@Column(name = "posted_at")
private Date postedAt = new Date();

@NotNull
@Temporal(TemporalType.DATE)
@Column(name = "updated_at")
private Date updatedAt = new Date();


public class Post {
    private Integer id;
    private String title;
    private String postUrl;
    private String userName;
    private int voteCount;
    private Integer userId;
    private Date postedAt = new Date();
    private Date updatedAt = new Date();
    private List<Comment> comments;
}
