package com.iuh.ChatWebApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;

//Định nghĩa Entity class Friend
@Entity
@Table(name = "friends")
@Getter
@Setter
@Builder
public class Friend {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(name = "sender", nullable = false)
 private String sender;

 @Column(name = "receiver", nullable = false)
 private String receiver;

 @Column(name = "owner", nullable = false)
 private String owner;

 @Column(name = "status")
 private boolean status;
}
