package classwork.lesson16.students.storage;

import classwork.lesson16.students.model.Lesson;
import classwork.lesson16.students.model.Student;

public class StudentStorage {

    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
        System.out.println();
    }

    private void extend() {
        Student[] temp = new Student[students.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = students[i];
        }
        students = temp;
    }

    public boolean isEmpty(Student[] array) {
        return (size == 0);
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        } else {
            for (int i = index; i < size; i++) {
                students[i] = students[i + 1];
            }
            size--;
        }
    }

    public void add(int index, Student student) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
            System.out.println();
        } else {
            for (int i = index; i < students.length - 1; i++) {
                students[i + 1] = students[i];
                students[index] = student;
            }
            System.out.println("User has been added");
        }
    }

    public void printStudentByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().getName().equalsIgnoreCase(lessonName)) {
                System.out.println(students[i]);
            }
        }
    }

    public void changeStudentLesson(int index, Lesson newLesson) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        } else {


            students[index].setLesson(newLesson);
            System.out.println("The lesson name has been changed!");
        }
    }

    public int getSize() {
        return size;
    }


    public Student getStudentByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            return students[index];

        }
    }
}



