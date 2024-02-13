package org.example.tahmiinbackend.testing;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
public class Testing {
    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )
    private Long id;
    private Long userId;
    private String title;
    private String body;

    public Testing() {
    }

    public Testing(Long id, Long userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public Testing(Long userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }
}
