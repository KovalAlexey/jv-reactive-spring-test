package com.dev.demo;

import com.dev.demo.controller.NodeController;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebFluxTest(NodeController.class)
public class JvReactiveTestApplicationTests {
}
