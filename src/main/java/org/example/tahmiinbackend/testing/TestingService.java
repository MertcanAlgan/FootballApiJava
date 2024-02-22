package org.example.tahmiinbackend.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;

@Service
public class TestingService {
    private static final String EXTERNAL_API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private TestingRepository testingRepository;

    private final RestTemplate restTemplate;

    public TestingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Transactional
    public void fetchDataAndSaveToDatabase() {
        Testing[] testDataArray = restTemplate.getForObject(EXTERNAL_API_URL, Testing[].class);

        if (testDataArray != null) {
            testingRepository.saveAll(Arrays.asList(testDataArray));

            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı!");
        }
    }

    public Optional<Testing> getTestDataById(Long id) {
        return testingRepository.findTestingById(id);
    }

}
