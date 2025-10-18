package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major() {
        name = "computer science";
        code = "23";
    }
    public Major(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Major.nextId = nextId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student[] getStudents() {
        return students;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    // Method to add a student
    public void addStudent(Student s) {
        if(getStudentCount() < 50) {
            if(students == null) {
                students = new Student[50];
            }
            students[getStudentCount()] = s;
            studentCount++;
        }else{
            System.out.println("Maximum number of students exceeded");
        }
    }

    // Display all students in the major
    public void displayStudents() {
        for(int i = 0; i < studentCount; i++){
            System.out.println(students[i]);
        }
    }

    public Student findStudentByCNE(String cne){
        for(int i = 0; i < studentCount; i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        Student student = findStudentByCNE(cne);
        if(student != null){
            studentCount--;
            student.setMajor(null);
            return true;
        }
        return false;
    }
    public double getOccupancyRate(){
        return (double) (studentCount * 100) /50;
    }
    public String getStudentListAsString(){
        StringBuilder studentList = new StringBuilder();
        for(int i = 0; i < studentCount; i++){
            studentList.append(students[i].toString());
        }
        return studentList.toString();
    }

}
