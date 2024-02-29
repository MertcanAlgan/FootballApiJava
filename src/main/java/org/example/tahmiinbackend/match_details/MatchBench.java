package org.example.tahmiinbackend.match_details;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
public class MatchBench {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long match_bench_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_id", referencedColumnName = "match_bench_id")
    private List<MatchBenchTeamA> team_a;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_id", referencedColumnName = "match_bench_id")
    private List<MatchBenchTeamB> team_b;

    public MatchBench() {
    }

}
