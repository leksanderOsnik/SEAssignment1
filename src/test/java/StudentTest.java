import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {


    List<Student> studentList = new ArrayList<Student>();
    List<Course> courseList = new ArrayList<Course>();
    List<Course> courseList2 = new ArrayList<Course>();
    List<Module> moduleList = List.of(new Module("Graphics", "CT411", studentList, courseList
    ), new Module("Machine Learning", "CT412", studentList, courseList));
    List<Module> moduleList2 = List.of(new Module("Graphics", "CT411", studentList, courseList ) );
    Student s1 = new Student("Tom Kane", 19, new LocalDate(2002, 10, 1),123456, courseList, moduleList);

    @Test
    public void testGetName() {
        Assert.assertEquals(s1.getName(), "Tom Kane");
    }

    @Test
    public void testSetName() {
        s1.setName("John Doe");
        Assert.assertEquals(s1.getName(), "John Doe");
    }
    @Test
    public void testGetAge() {
        Assert.assertEquals(s1.getAge(), 19);
    }
    @Test
    public void testSetAge() {
        s1.setAge(20);
        Assert.assertEquals(s1.getAge(), 20);
    }
    @Test
    public void testGetDOB() {
        Assert.assertEquals(s1.getDOB(), new LocalDate(2002, 10, 1) );
    }
    @Test
    public void testSetDOB() {
        s1.setDOB(new LocalDate(2002, 11, 1));
        Assert.assertEquals(s1.getDOB(),new LocalDate(2002, 11, 1) );
    }
    @Test
    public void testGetID() {
        Assert.assertEquals(s1.getID(), 123456);
    }
    @Test
    public void testSetID() {
        s1.setID(1);
        Assert.assertEquals(s1.getID(), 1);
    }
    @Test
    public void testGetUsername() {
        Assert.assertEquals(s1.getUsername(), s1.getName() + s1.getAge());
    }

    @Test
    public void testGetCourseList() {
        Assert.assertEquals(s1.getCourseList(), courseList);
    }

    @Test
    public void testSetCourseList() {
        s1.setCourseList( courseList2);
        Assert.assertEquals(s1.getCourseList(), courseList2);
    }
    @Test
    public void testGetModuleList() {
        Assert.assertEquals( s1.getModuleList(), moduleList );
    }

    @Test
    public void testSetModuleList() {
        s1.setModuleList(moduleList2);
        Assert.assertEquals(s1.getModuleList(), moduleList2);
    }
}
