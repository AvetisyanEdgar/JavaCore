package classwork.lesson16.students;

public class StudentStorage {

    private Student[] students = new Student[10];
    private int size = 0;
//    private int index;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
    //Գրել մեթոդ getStudentByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

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

    public void printStudentByLessonName(String lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
    }

    public void changeStudentLesson(int index, String newLesson) {
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


}




