import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseTest {
    List<Student> studentList = new ArrayList<Student>();
    List<Module> moduleList = new ArrayList<Module>();
    List<Student> studentList2 = new ArrayList<Student>();
    List<Module> moduleList2 = new ArrayList<Module>();
    Course c1 = new Course("CompSci", moduleList, studentList, new DateTime(2021, 9, 5, 9, 15), new DateTime(2022, 5,
            10, 15, 30));

    @Test
    public void testGetCourseName() {
        Assert.assertEquals(c1.getCourseName(), "CompSci");
    }
    @Test
    public void testSetCourseName() {
        c1.setCourseName("Commerce");
        Assert.assertEquals(c1.getCourseName(), "CompSci");
    }
    @Test
    public void testGetModuleList() {
       Assert.assertEquals(c1.getModuleList(), moduleList);
    }
    @Test
    public void testSetModuleList() {
        c1.setModuleList(moduleList2);
        Assert.assertEquals(c1.getModuleList(), moduleList);
    }
    @Test
    public void testGetStudentList() {
        Assert.assertEquals(c1.getStudentList(), studentList);
    }
    @Test
    public void testSetStudentList() {
        c1.setStudentList(studentList2);
        Assert.assertEquals(c1.getStudentList(), studentList2);
    }
    @Test
    public void testGetStartDate() {
       Assert.assertEquals(c1.getStartDate(), new DateTime(2021, 9, 5, 9, 15));
    }
    @Test
    public void testSetStartDate() {
        c1.setStartDate( new DateTime(2022, 9, 5, 9, 15));
        Assert.assertEquals(c1.getStartDate(), new DateTime(2022, 9, 5, 9, 15));
    }
    @Test
    public void testGetEndDate() {
        Assert.assertEquals(c1.getEndDate(), new DateTime(2022, 5,
                10, 15, 30)  );
    }
    @Test
    public void testSetEndDate() {
        c1.setEndDate(new DateTime(2023, 5,
                10, 15, 30));
        Assert.assertEquals(c1.getEndDate(), new DateTime(2023, 5,
                10, 15, 30)  );
    }
}
