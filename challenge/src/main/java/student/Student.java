package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        major = new Major("23", "computer science");
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return getId() + "- " + getCne() + " " + getFirstName() + " " + getSecondName() + " ";
    }
    public String getFullNameFormatted(){
        String fullName = String.format("%s %s", getFirstName().toUpperCase(), getSecondName());
        return fullName;
    }


}

