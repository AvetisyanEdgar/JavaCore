package classwork.lesson16.students.storage;

import classwork.lesson16.students.model.Lesson;
import classwork.lesson16.students.model.Student;

public class LessonStorage {
    private static Lesson[] lessons = new Lesson[10];
    private static int  size = 0;


    public static void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    public void printLessons() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i].toString());
        }
        System.out.println();
    }

    private static void extend() {
        Lesson[] temp = new Lesson[lessons.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = lessons[i];
        }
        lessons = temp;
    }

    public boolean isEmpty(Student[] array) {
        return (size == 0);
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        } else {
            for (int i = index; i < size; i++) {
                lessons[i] = lessons[i + 1];
            }
            size--;
        }
    }

    public void add(int index, Lesson lesson) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
            System.out.println();
        } else {
            for (int i = index; i < lessons.length - 1; i++) {
                lessons[i + 1] = lessons[i];
                lessons[index] = lesson;
            }
            System.out.println("User has been added");
        }
    }

    public int getSize() {
        return size;
    }

    public Lesson getLessonByIndex(int index){
        if (index < 0 || index > size){
            return null;
        }else{
            return lessons[index];
        }
    }
}
