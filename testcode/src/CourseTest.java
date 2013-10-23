import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CourseTest {
	
	Course course1;
	Professor schramm;
	Student pippin;
	
	@Before
	public void setUp() throws Exception {
	course1=new Course("3010","SYSC3010");
	schramm = new Professor("Cheryl","Schramm");
	pippin = new Student("Peregrin","Took");
	}

	@After
	public void tearDown() throws Exception {
		course1=null;
		schramm = null;
		pippin = null;
	}

	
	@Test
	public void testCourse() {
		assertEquals(course1.getId(),"3010");
		assertEquals(course1.getName(),"SYSC3010");
	}

	@Test
	public void testGetId() {
		assertEquals(course1.getId(),"3010");
	}
		

	@Test
	public void testGetName() {
		assertEquals(course1.getName(),"SYSC3010");
	}

	@Test
	public void testToString() {
		assertEquals(course1.toString(),"3010SYSC3010");
	}

	@Test
	public void testEqualsObject() {
		assertEquals(course1.equals(course1),true);
	}

	@Test
	public void testSetProfessor() {
		course1.setProfessor(schramm);
		assert(course1.getProfessor().equals(schramm));
	}

	@Test
	public void testGetProfessor() {
		course1.setProfessor(schramm);
		assert(course1.getProfessor().equals(schramm));
	}

	@Test
	public void testAddStudent() {
		course1.addStudent(pippin);
		assertEquals(pippin,course1.getStudents()[0]);
	}

	@Test
	public void testRemoveStudent() {
		course1.addStudent(pippin);
		course1.removeStudent(pippin);
		assertEquals(null,course1.getStudents()[0]);
	}

	@Test
	public void testGetStudents() {
		course1.addStudent(pippin);
		assertEquals(pippin,course1.getStudents()[0]);
	}

}
