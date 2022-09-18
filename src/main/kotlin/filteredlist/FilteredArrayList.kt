package filteredlist

import java.util.ArrayList

fun main(){
    val student1 = Student(1,"Vaqif","840a1")
    val student2 = Student(2,"Asif","3a1")
    val student3 = Student(3,"Elmir","440a2")

    val studentList = ArrayList<Student>()
    studentList.add(student1)
    studentList.add(student2)
    studentList.add(student3)


    val filtr = studentList.filter { it.no == 2 }
    for (i in filtr){
        println("***********")
        println("No: ${i.no}")
        println("Name: ${i.name}")
        println("Grade: ${i.grade}")
        println("***********")
    }



}

