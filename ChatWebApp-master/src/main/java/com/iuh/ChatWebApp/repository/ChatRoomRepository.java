package com.iuh.ChatWebApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuh.ChatWebApp.entity.ChatRoom;

public interface ChatRoomRepository extends JpaRepository<ChatRoom,Integer>{
	Optional<ChatRoom> findBySenderIdAndReceiverId(String senderId, String recipientId);
}
