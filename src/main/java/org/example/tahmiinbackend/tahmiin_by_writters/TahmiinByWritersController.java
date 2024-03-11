package org.example.tahmiinbackend.tahmiin_by_writters;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/auth/tahmiin-by-writers")
public class TahmiinByWritersController {
    private final TahmiinByWritersService tahmiinByWritersService;

    public TahmiinByWritersController(TahmiinByWritersService tahmiinByWritersService) {
        this.tahmiinByWritersService = tahmiinByWritersService;
    }

    @PostMapping("/add-tahmiin-by-writers")
    public void addTahmiinByWriters(@RequestBody TahmiinByWriters tahmiinByWriters) {
        tahmiinByWritersService.addTahmiinByWriters(tahmiinByWriters);
    }

    @GetMapping("/get-all-tahmiin-by-writers")
    public List<TahmiinByWriters> getAllTahmiinByWriters() {
        return tahmiinByWritersService.getAllTahmiinByWriters();
    }

    @PostMapping("/like-tahmiin-by-writers/{tahmiin_by_writers_id}")
    public void likeTahmiinByWriters(@PathVariable("tahmiin_by_writers_id") Long tahmiin_by_writers_id) {
        tahmiinByWritersService.incrementLikes(tahmiin_by_writers_id);
    }
}
