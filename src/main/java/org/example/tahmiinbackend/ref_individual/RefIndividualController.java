package org.example.tahmiinbackend.ref_individual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RefIndividualController {
    private final RefIndividualService refIndividualService;

    public RefIndividualController(RefIndividualService refIndividualService) {
        this.refIndividualService = refIndividualService;
    }

    @GetMapping("/auth/fetch-ref-individual-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        refIndividualService.fetchRefIndividualDataAndSaveToDatabase();
    }
}
