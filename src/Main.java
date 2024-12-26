package org.example;
public class Main {
    public static void main(String[] args) {
        IUStudent iuStudent = new IUStudent("Ваня", "Помидоров", 4, 5);
        MathStudent mathStudent = new MathStudent("Илья", "Огурцов",1, 5);

        iuStudent.printInfo();
        iuStudent.writeExam();

        System.out.println();

        mathStudent.printInfo();
        mathStudent.writeExam();
    }
}
abstract class Student {
    protected String name;
    protected String surname;
    protected int course;
    protected int last_mark;

    public Student(String name, String surname, int course, int last_mark) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.last_mark = last_mark;
    }
    public abstract void writeExam();

    public void printInfo() {
        System.out.println("Имя: " + name + " " + surname +  ", Курс: " + course + ", Оценка: " + last_mark);
    }
}

class IUStudent extends Student {

    public IUStudent(String name, String surname, int course, int last_mark) {
        super(name, surname, course, last_mark);
    }

    @Override
    public void writeExam() {
        System.out.println(name + " " + surname + " пишет экзамен по Информатике.");
    }
}
class MathStudent extends Student {
    public MathStudent(String name, String surname, int course, int last_mark) {
        super(name, surname,  course, last_mark);
    }

    @Override
    public void writeExam() {
        System.out.println(name + " " + surname + " пишет экзамен по Математике.");
    }
}