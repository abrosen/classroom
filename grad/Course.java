public class Course {


    private String courseName;
    private String courseNumber;
    private Teacher theTeach;
    private Student[] roster;


    public Course(String courseName, String courseNumber, Teacher theTeach, Student[] roster) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.theTeach = theTeach;
        this.roster = roster;
    }



    public void runCourse(){
        for(int i = 0 ; i < roster.length; i++) {
            theTeach.teach(roster[i]);
        }
    }


}
