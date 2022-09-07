package com.example.restdbspringbootkotlin.entity

import org.springframework.data.relational.core.mapping.Table

@Table("messages")
data class Message(val id: String?, val text: String)
