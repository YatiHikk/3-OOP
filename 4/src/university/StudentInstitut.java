package university;

public class StudentInstitut extends Student{
    String institutName;
    String department;
    String speciality;
    int groupNumber;

    public StudentInstitut(String surname, String name, String middlename, int year, String institutName, String department, String speciality, int groupNumber) {
        super(surname, name, middlename, year);
        this.institutName = institutName;
        this.department = department;
        this.speciality = speciality;
        this.groupNumber = groupNumber;
    }

    public String getInstitutName() {
        return institutName;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setInstitutName(String institutName) {
        this.institutName = institutName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
