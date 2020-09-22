package io.kotlinwithgradle.todolist.repo

import io.kotlinwithgradle.todolist.items.Itemslist
import org.springframework.data.jpa.repository.JpaRepository

interface RepoItems: JpaRepository<Itemslist, Int>