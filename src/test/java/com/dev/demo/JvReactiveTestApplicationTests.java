package com.dev.demo;

import com.dev.demo.controller.NodeController;
import com.dev.demo.model.Node;
import com.dev.demo.service.NodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@WebFluxTest(NodeController.class)
public class JvReactiveTestApplicationTests {
//
//	@Autowired
//    WebTestClient webTestClient;
//
//	@MockBean
//	private NodeService nodeService;
//
//	@Test
//	public void testGet() {
//		Node node = new Node();
//
//		Mono<Employee> employeeMono = Mono.just(node);
//
//		when(employeeService.getEmployeeById(1)).thenReturn(employeeMono);
//
//		webTestClient.get()
//				.uri("/employees/1")
//				.accept(MediaType.APPLICATION_JSON)
//				.exchange()
//				.expectStatus().isOk()
//				.expectBody(Employee.class)
//				.value(employee1 -> employee.getAge(), equalTo(23));
//	}
//
//
//
//	@Test
//	public void testCreate() {
//
//		Employee employee = Employee.builder().id(1).city("delhi").age(23).name("ABC").build();
//		Mono<Employee> employeeMono = Mono.just(employee);
//		when(employeeService.createEmployee(employee)).thenReturn(employeeMono);
//
//		webTestClient.post()
//				.uri("/employees")
//				.contentType(MediaType.APPLICATION_JSON)
//				.accept(MediaType.APPLICATION_JSON)
//				.body(Mono.just(employee), Node.class)
//				.exchange()
//				.expectStatus().isCreated();
//
//	}
}
