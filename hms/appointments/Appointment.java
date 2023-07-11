package hms.appointments;


public class Appointment {
    private int aid;
    private String name;
    private String issue;
    private String gender;
    private int age;
    private String comment;
    private String a_date;

    public Appointment(int aid, String name, String issue, String gender, int age, String comment, String a_date) {
        this.aid = aid;
        this.name = name;
        this.issue = issue;
        this.gender = gender;
        this.age = age;
        this.comment = comment;
        this.a_date = a_date;
    }


    // setters and getters
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

}
