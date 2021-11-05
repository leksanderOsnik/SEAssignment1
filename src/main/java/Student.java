import java.util.List;

public class Student {

    private String name;
    private int age;
    private String DOB;
    private long ID;
    private String username;
    private List<Course> courseList;
    private List<Module> moduleList;

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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
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

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }
    public void addModule(Module module){
        moduleList.add(module);
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }
}
