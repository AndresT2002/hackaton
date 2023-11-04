package com.hackaton.challenge.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "post")
public class Post {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_by")
    private Long createdBy;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;


    @Column(name="multi")
    private String multi;

    @Column(name="creation_date")
    private Date creationDate;


    @Column(name="is_video")
    private Boolean isVideo;






}
