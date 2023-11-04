package com.hackaton.challenge.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_user")
    @JsonIgnore
    private User user;

    @Column(name="participant")
    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Challenge.class, cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Challenge> challenges;

    @Column(name="position")
    private long position;





}
