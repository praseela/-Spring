package com.journaldev.spring;

import javax.annotation.Generated;

import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;

import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.model.Person;
import com.journaldev.spring.service.PersonService;

@Generated(value = "org.junit-tools-1.1.0")
@ContextConfiguration(locations = { "classpath:pathTo/servlet-context.xml" })
public class PersonControllerTest {

	@Autowired
	PersonDAO personService;

	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new PersonController()).build();
	}

	private PersonController createTestSubject() {
		return new PersonController();
	}

	@MethodRef(name = "setPersonService", signature = "(QPersonService;)V")
	@Test
	public void testSetPersonService() throws Exception {
		PersonController testSubject;
		PersonService ps = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setPersonService(ps);
	}

	@MethodRef(name = "listPersons", signature = "(QModel;)QString;")
	@Test
	public void testListPersons() throws Exception {
		PersonController testSubject;
		Model model = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.listPersons(model);
	}

	@MethodRef(name = "getPersonsById", signature = "(I)QPerson;")
	@Test
	public void testGetPersonsById() throws Exception {
		PersonController testSubject;
		int id = 2;
		Person result;

		// default test
		testSubject = createTestSubject();
		this.mockMvc.perform(MockMvcRequestBuilders.get("/persons/2"));
       /* .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"));
}*/
		result = personService.getPersonById(id);
		// result = testSubject.getPersonsById(id);
	}

	@MethodRef(name = "addPerson", signature = "(QPerson;)QString;")
	@Test
	public void testAddPerson() throws Exception {
		PersonController testSubject;
		Person p = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.addPerson(p);
	}

	@MethodRef(name = "removePerson", signature = "(I)QString;")
	@Test
	public void testRemovePerson() throws Exception {
		PersonController testSubject;
		int id = 0;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.removePerson(id);
	}

	@MethodRef(name = "editPerson", signature = "(IQModel;)QString;")
	@Test
	public void testEditPerson() throws Exception {
		PersonController testSubject;
		int id = 0;
		Model model = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.editPerson(id, model);
	}
}