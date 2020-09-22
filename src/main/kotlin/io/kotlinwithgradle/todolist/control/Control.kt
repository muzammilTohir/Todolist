package io.kotlinwithgradle.todolist.control

import io.kotlinwithgradle.todolist.items.Itemslist
import io.kotlinwithgradle.todolist.repo.RepoItems
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todolists")
class Control {

    @Autowired
    var repoItems: RepoItems?=null

    @GetMapping
    fun getAll(): MutableList<Itemslist> {
        return repoItems!!.findAll()
    }

    @GetMapping("/{id}")
    fun getItem(@PathVariable id:Int):Optional<Itemslist>{
        return repoItems!!.findById(id)
    }

    @PostMapping
    fun saveItem(@RequestBody itemslist: Itemslist): Itemslist {
        return repoItems!!.save(itemslist)
    }

  //@RequestMapping(method = [RequestMethod.PUT])

    @PutMapping
    fun swappingItem(@RequestBody itemslist: Itemslist): Itemslist {
        return repoItems!!.save(itemslist)
    }

    @DeleteMapping
    fun deleteAll(){
        return repoItems!!.deleteAll()
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id:Int):String{
        //val deleted = repoItems!!.getOne(id)
        //repoItems!!.delete(deleted)
        repoItems!!.deleteById(id)
        return ""
    }

    @PatchMapping("/{id}")
    fun updateItem(@RequestBody @PathVariable id:Int):String{
        val take = repoItems!!.findById(id).get()
        take.apply {
            checkingItem = true
        }
        repoItems!!.save(take)
        return ""
    }
}