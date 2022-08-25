/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author maxla
 */
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    
    @Column(name = "content", length = 250)
    private String content;
    
    @ManyToOne()
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    
    @Column(name = "creation_date", length = 100)
    private String creationDate;
//teeest
    public Comment() {
        
    }

    public Comment(User user, String content, Movie movie, String creationDate) {
        this.user = user;
        this.content = content;
        this.movie = movie;
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    public void copy(Comment data) {
        if (data.getContent() != null) {
            this.content = data.getContent();
        }
        if (data.getMovie() != null) {
            this.movie = data.getMovie();
        }
        if (data.getCreationDate() != null) {
           this.creationDate = data.getCreationDate();
        }
        if (data.getUser() != null) {
           this.user = data.getUser();
        }
    }
}