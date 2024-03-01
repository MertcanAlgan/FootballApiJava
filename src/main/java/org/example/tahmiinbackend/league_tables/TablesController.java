package org.example.tahmiinbackend.league_tables;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TablesController {
    private final TablesService tablesService;

    public TablesController(TablesService tablesService) {
        this.tablesService = tablesService;
    }

    @GetMapping("/auth/fetch-tables-and-save-to-database")
    public void fetchTablesAndSaveToDatabase() {
        tablesService.fetchTablesAndSaveToDatabase();
    }

    @GetMapping("/auth/get-tables-by-id/{main_tables_id}")
    public MainTables getTablesById(@PathVariable Long main_tables_id){
        return tablesService.getTablesById(main_tables_id);
    }

}
