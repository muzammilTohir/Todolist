package io.kotlinwithgradle.todolist.items

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Itemslist(@Id @GeneratedValue var id:Int, var product:String, var checkingItem:Boolean)
