package com.hackaton.challenge.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hackaton.challenge.Utils.EStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name="challenge")
@Getter
@Setter
@NoArgsConstructor
public class Challenge {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="status")
    private EStatus status;

    @Column(name="id_discipline")
    private Long discipline;










}
