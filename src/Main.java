import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute("VSU", "Университетская, 1");
        System.out.println(institute.toString());
        System.out.println();

        Employee dean = new Employee(1, "Деканов Декан Деканович", "1234567788@gmail.com", 4000, "dean");
        System.out.println(dean.toString());
        System.out.println();

        AdministrativeEmployee someAdmin = new AdministrativeEmployee(2, "admin adminovich", "adminmail@gmail.com",
                41, "admin");
        System.out.println(someAdmin.toString());
        System.out.println();

        Lecturer lecturer = new Lecturer(38, "Ivanov Bob", "ivanovbb@mail.ru", 50000, "lecturer", new ArrayList<>());
        System.out.println(lecturer.toString());
        System.out.println();

        Course course = new Course(5, "Введение в программирование", 500);
        lecturer.addCourse(course);
        lecturer.teachCourse(course);
        System.out.println();

        Project project = new Project("kursovaya", new Date(125, 11, 17), new Date(125, 11, 31), new ArrayList<>());
        System.out.println(project.toString());
        System.out.println();

        Participation participation = new Participation(5, new ResearchAssociate(
                18, "some name", "someemail@yandex.ru", 5000, "pos"), project);
        System.out.println(participation.toString());
        System.out.println();
    }
}
