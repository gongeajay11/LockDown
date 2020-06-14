package com.tkm.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkm.bank.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestEmployee {

	@Autowired
	private Employee emp;

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wc;
	@Autowired
	private ObjectMapper mapper;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
	}

	@Test
	public void saveEmployee() throws JsonProcessingException, Exception {
		MvcResult result = mockMvc.perform(
				post("api/save").
				contentType(MediaType.APPLICATION_JSON_VALUE).
				content(mapper.writeValueAsString(emp)))
				.andExpect(status().isCreated()).
				andReturn();

		Employee response = mapper.readValue(result.getResponse().getContentAsString(), Employee.class);
		assertEquals(emp, response);

	}

}
