package student;

public class Test {
    public static void main(String[] args) {
        Major computerScience = new Major();
        Major medicalScience = new Major("21", "medical science");
        Major literatureScience = new Major("22", "literature science");

        Student amal = new Student("SAFI", "Amal", "0687632163", "amal@mail.com", "22885676", computerScience );
        Student samir = new Student("ALAMI", "Samir","0687632163", "samir@mail.com", "22885678", computerScience);
        Student lamyae = new Student("CHELI", "Lamyae","0687632163", "lamyae@mail.com", "22885676", medicalScience);
        Student ali = new Student("PANI", "Ali","0687632163", "lamyae@mail.com", "22885676", literatureScience );

        System.out.println("=========================================================");
        // Display computer science students
        System.out.println("The list of students in the computer science major is: ");
        computerScience.displayStudents();
        System.out.println("=========================================================");
        System.out.println("The students counts in the cs major before removing samir is : " + computerScience.getStudentCount());
        System.out.println("=========================================================");
        System.out.println("Removing student Samir from cs... ");
        computerScience.removeStudent("22885678");
        System.out.println("The list of students in the cs major is: ");
        computerScience.displayStudents();
        System.out.println("=========================================================");
        System.out.println("The occupancy rate of computer science students is: " + computerScience.getOccupancyRate() + "%");
        System.out.println("=========================================================");
        System.out.println(computerScience.getStudentListAsString());
        System.out.println("=========================================================");

        // Testing instructor/subject part
        Instructor instructor = new Instructor(" AB 123");
        instructor.setFirstName("John");
        instructor.setSecondName("Doe");
        instructor.setEmail("JohnDoe@gmail.com");
        instructor.setPhone("01236958756");
        instructor.cleanEmployeeNumber();
        System.out.println("The instructor employeeNum has been cleaned: " + instructor.employeeNumber);
        System.out.println("=========================================================");
        Subject subject = new Subject(1, "cs-101", "Intro to computer science");
        System.out.println("Normalized subject code: " + subject.normalizedCode());
        System.out.println("=========================================================");
        System.out.println("Capitalized title: " + subject.properTitle());
        System.out.println("=========================================================");
        System.out.println("Employee Summary Line: ");
        System.out.println(instructor.summaryLine());
        System.out.println("=========================================================");
        System.out.println("Is CS course an Intro course?  " + subject.isIntroCourse());
        System.out.println("=========================================================");
        System.out.println("Instructor Card: " + instructor.toCard());
        System.out.println("=========================================================");
        System.out.println("Syllabus Line: " + subject.syllabusLine(instructor));
        System.out.println("=========================================================");
        System.out.println("Displaying the name of an instructor where firstName is null: ");
        instructor.setFirstName(null);
        System.out.println(instructor.displayName());


    }
}

