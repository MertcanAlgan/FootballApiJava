package org.example.tahmiinbackend.tahmiin_by_writters;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TahmiinByWritersService {
    private final TahmiinByWritersRepository tahmiinByWritersRepository;

    public TahmiinByWritersService(TahmiinByWritersRepository tahmiinByWritersRepository) {
        this.tahmiinByWritersRepository = tahmiinByWritersRepository;
    }

    public TahmiinByWriters addTahmiinByWriters(TahmiinByWriters tahmiinByWriters) {
        return tahmiinByWritersRepository.save(tahmiinByWriters);
    }

    public List<TahmiinByWriters> getAllTahmiinByWriters() {
        return tahmiinByWritersRepository.findTahmiinByWritersByDescendingId();
    }

    @Transactional
    public void incrementLikes(Long tahmiin_by_writers_id) {
        tahmiinByWritersRepository.incrementLikes(tahmiin_by_writers_id);
    }

}
