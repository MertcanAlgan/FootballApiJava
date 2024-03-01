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
    private String header;
    private String content;
    private String date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    public ForumPosts() {
    }
}
