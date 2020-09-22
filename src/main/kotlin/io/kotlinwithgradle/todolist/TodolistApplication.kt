package io.kotlinwithgradle.todolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@SpringBootApplication
class TodolistApplication

fun main(args: Array<String>) {
    runApplication<TodolistApplication>(*args)
}
