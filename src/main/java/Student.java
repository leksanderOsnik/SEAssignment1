import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private List<Course> courseList;
    private List<Module> moduleList;

    public Student(String name, int age, LocalDate DOB, long ID, List<Course> courseList, List<Module> moduleList) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courseList = courseList;
        this.moduleList = moduleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return getName() + getAge();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Course> getCourseList() {
        return courseList;
    }


    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }
}
