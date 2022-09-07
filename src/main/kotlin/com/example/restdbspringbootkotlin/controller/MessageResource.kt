package com.example.restdbspringbootkotlin.controller

import com.example.restdbspringbootkotlin.entity.Message
import com.example.restdbspringbootkotlin.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = service.findMessage()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}