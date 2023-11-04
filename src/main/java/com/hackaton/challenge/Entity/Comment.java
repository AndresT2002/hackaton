package com.hackaton.challenge.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "comment")
public class Comment {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="name")
    private String name;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_user")
    private User user;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_post")
    private Post post;




}
