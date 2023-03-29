package com.rookie.bigdata.liuyubobobo.array;

/**
 * @Classname Student
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/3 15:06
 * @Version 1.0
 */
public class Student {

    private String name;
    private int score;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {

        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 66));
        arr.addLast(new Student("Charlie", 88));
        System.out.println(arr);
    }
}
