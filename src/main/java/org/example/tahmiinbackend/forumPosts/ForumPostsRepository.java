package org.example.tahmiinbackend.forumPosts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ForumPostsRepository extends JpaRepository<ForumPosts, Long>{
    @Query("SELECT f FROM ForumPosts f ORDER BY f.forum_post_id DESC")
    List<ForumPosts> findForumPostsByDescendingId();

    @Modifying
    @Query("UPDATE ForumPosts f SET f.likes = f.likes + 1 WHERE f.forum_post_id = ?1")
    void incrementLikes(Long forum_post_id);

}
