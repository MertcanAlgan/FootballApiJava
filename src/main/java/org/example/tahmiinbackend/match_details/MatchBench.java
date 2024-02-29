package org.example.tahmiinbackend.match_details;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
public class MatchBench {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_bench_sequence")
    @SequenceGenerator(name = "match_bench_sequence", sequenceName = "match_bench_sequence", allocationSize = 1)
    private Long match_bench_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_id", referencedColumnName = "match_bench_id")
    private List<MatchBenchTeamA> team_a;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_id", referencedColumnName = "match_bench_id")
    private List<MatchBenchTeamB> team_b;

    public MatchBench() {
    }

    public MatchBench(Long match_bench_id, List<MatchBenchTeamA> team_a, List<MatchBenchTeamB> team_b) {
        this.match_bench_id = match_bench_id;
        this.team_a = team_a;
        this.team_b = team_b;
    }

    public MatchBench(List<MatchBenchTeamA> team_a, List<MatchBenchTeamB> team_b) {
        this.team_a = team_a;
        this.team_b = team_b;
    }
}
