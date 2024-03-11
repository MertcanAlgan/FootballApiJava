package org.example.tahmiinbackend.forumPosts;

import jakarta.persistence.*;
import lombok.*;
import org.example.tahmiinbackend.user.User;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
public class ForumPosts {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "forum_post_sequence")
    @SequenceGenerator(name = "forum_post_sequence", sequenceName = "forum_post_sequence", allocationSize = 1)
    private Long forum_post_id;
    private Integer userId;
    private Integer matchId;
    private String highlightedStat;
    private String comment;
    private String date;
    private Integer likes = 0;
    public ForumPosts() {
    }
}
