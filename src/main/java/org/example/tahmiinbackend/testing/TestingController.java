package org.example.tahmiinbackend.testing;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth/test")
public class TestingController {
    private final TestingService testingService;

    public TestingController(TestingService testingService) {
        this.testingService = testingService;
    }
    @GetMapping("/fetchDataAndSaveToDatabase")
    public void fetchDataAndSaveToDatabase() {
        testingService.fetchDataAndSaveToDatabase();
    }
    @GetMapping("/id/{id}")
    public Optional<Testing> getTestingDataById(@PathVariable("id") Long id) {
        System.out.println("id: " + id);
        return testingService.getTestDataById(id);
    }
}
