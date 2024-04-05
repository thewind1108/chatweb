package com.iuh.ChatWebApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;

//Định nghĩa Entity class Image
@Entity
@Table(name = "images")
@Getter
@Setter
@Builder
public class Image {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(name = "image_name", nullable = false)
 private String name;

 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

// Phương thức để xây dựng đường dẫn ảnh gửi
 @Transient
 public String getImageSendPath() {
     if (name == null || id == 0) return null;

     return "/images-send/" + id + "/" + name;
 }
 
}

