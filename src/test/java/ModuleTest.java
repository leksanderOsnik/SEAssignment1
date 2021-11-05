import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ModuleTest {


    List<Student> studentList = new ArrayList<Student>();
    List<Course> courseList = new ArrayList<Course>();
    List<Student> studentList2 = new ArrayList<Student>();
    List<Course> courseList2 = new ArrayList<Course>();
    Module m1 = new Module("Graphics", "CT411", studentList, courseList);

    @Test
    public void testGetModuleName() {
        Assert.assertEquals(m1.getModuleName(), "Graphics");
    }

    @Test
    public void testSetModuleName() {
        m1.setModuleName("Machine Learning");
        Assert.assertEquals(m1.getModuleName(), "Machine Learning");
    }
    @Test
    public void testGetModuleId() {
        Assert.assertEquals(m1.getModuleId(), "CT411");
    }
    @Test
    public void testSetModuleId() {
        m1.setModuleId("CT417");
        Assert.assertEquals(m1.getModuleId(), "CT417");
    }
    @Test
    public void testGetStudentList() {
        Assert.assertEquals(m1.getStudentList(), studentList);
    }
    @Test
    public void testSetStudentList() {
        m1.setStudentList(studentList2);
        Assert.assertEquals(m1.getStudentList(), studentList2);
    }
    @Test
    public void testGetCourseList() {
        Assert.assertEquals(m1.getCourseList(), courseList);
    }
    @Test
    public void testSetCourseList() {
        m1.setCourseList(courseList2);
        Assert.assertEquals(m1.getCourseList(), courseList2);
    }
}
