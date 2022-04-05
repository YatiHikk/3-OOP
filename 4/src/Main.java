import university.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Иванов","Иван","Иванович");
        System.out.println("Номер студенческой книжки: " + student.getStudentBookNumber());

        Date date = new Date();
        Conference conference = new Conference("Владивосток", date, "Проблемы управления Ж/Д путями");
        Competition competition = new Competition("Хабаровск", date, 150000);
        Olympiad olympiad = new Olympiad("Биробиджан", date, 2);

        student.addCompetition(competition);
        student.addConference(conference);
        student.addOlympiad(olympiad);

        student.printEvents();

    }
}
