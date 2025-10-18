package student;

public class Subject {
    int id;
    String code;
    String title;
    public Subject(int id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        String[] words = title.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words){
            if(word.length() > 0){
                char first = Character.toUpperCase(word.charAt(0));
                String rest = word.substring(1);
                capitalized.append(first).append(rest).append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public boolean isIntroCourse(){
        if(title.toLowerCase().contains("intro")){
            return true;
        }
        if(code.startsWith("INTRO-")){
            return true;
        }
        return false;
    }
    public String syllabusLine(Instructor instructor){
        StringBuilder syllabus = new StringBuilder();
        syllabus.append(code + " - " + title + " (Instructor: " + instructor.getSecondName() + " " + instructor.getFirstName() + ")");
        return syllabus.toString();
    }

}
