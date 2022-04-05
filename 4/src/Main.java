import university.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        StudentInstitut studentInstitutinstitut = new StudentInstitut("Ponomareva", "Katy","Romanovna",2000,"ENI","VYiKG","Applied Informatics",941);
        System.out.println(studentInstitutinstitut.getSurname()+ " " + studentInstitutinstitut.getName()+ " " + studentInstitutinstitut.getMiddlename() + " "  + studentInstitutinstitut.getYear()+ " год. ");
        System.out.println(studentInstitutinstitut.getInstitutName()+ " " + studentInstitutinstitut.getDepartment()+" "+ studentInstitutinstitut.getSpeciality()+" "+ studentInstitutinstitut.getGroupNumber());
        System.out.println("Номер студенческой книжки: " + studentInstitutinstitut.getStudentBookNumber());

        Date date = new Date();
        Conference conference = new Conference("Владивосток", date, "Проблемы управления Ж/Д путями");
        Competition competition = new Competition("Хабаровск", date, 150000);
        Olympiad olympiad = new Olympiad("Биробиджан", date, 2);

        studentInstitutinstitut.addCompetition(competition);
        studentInstitutinstitut.addConference(conference);
        studentInstitutinstitut.addOlympiad(olympiad);

        studentInstitutinstitut.printEvents();

    }
}