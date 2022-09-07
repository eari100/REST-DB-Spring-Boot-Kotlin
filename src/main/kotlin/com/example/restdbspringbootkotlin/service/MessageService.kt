package com.example.restdbspringbootkotlin.service

import com.example.restdbspringbootkotlin.entity.Message
import com.example.restdbspringbootkotlin.entity.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessage(): List<Message> = db.findMessage()

    fun post(message: Message) {
        db.save(message)
    }
}