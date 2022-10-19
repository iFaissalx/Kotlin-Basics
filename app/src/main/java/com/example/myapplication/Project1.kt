package com.example.myapplication
fun main() {

var todo = Todo()
    var task1 = Task("Project1", "complete the project", true)
    var task2 = Task("assignment", "do it bt tomorrow ", false)
    todo.add(task1)
    todo.add(task2)
    todo.show()
    println("remove:")
    todo.remove(task1)
    todo.show()
    println("change:")
    todo.change(task2, true)
    todo.show()
}

data class Task(var name: String,var note: String, var isComplete: Boolean)

class Todo(){
    val todo = arrayListOf<Task>()
    fun add(task:Task){
        todo.add(task)
    }
    fun show(){
        for (task in todo){
            println("task: ${task.name} note: ${task.note} completion: ${task.isComplete}")

        }
    }
    fun remove(task:Task){
        todo.remove(task)
    }
    fun change(task:Task, completed:Boolean){

        todo[ todo.indexOf(task) ].isComplete = completed
    }
}
