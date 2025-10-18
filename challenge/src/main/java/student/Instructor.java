package student;

public class Instructor extends Person{
    String employeeNumber;
    public Instructor(String employeeNumber){
        this.employeeNumber = employeeNumber ;
    }
    public void cleanEmployeeNumber(){
        employeeNumber = employeeNumber.replaceAll("\\s+", "");

    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, getSecondName(), getFirstName());
    }
    public String toCard(){
        StringBuilder card = new StringBuilder() ;
        card.append("Instructor \n");
        card.append("--------\n");
        card.append("Employee #: " + employeeNumber + "\n");
        card.append("Name: " + getSecondName() +", " + getFirstName() + "\n");
        card.append("Email: " + getEmail() + "\n");
        card.append("Phone: " + getPhone() + "\n");
        return card.toString();
    }
    public String displayName(){
        StringBuilder displayName = new StringBuilder() ;
        displayName.append("Instructor: ");
        if(getFirstName() != null ){
            displayName.append(getFirstName()) ;
        }
        if(getSecondName() != null ){
            displayName.append(getSecondName()) ;
        }
        return displayName.toString();
    }
}
