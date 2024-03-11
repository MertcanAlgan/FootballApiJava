package org.example.tahmiinbackend.forumPosts;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumPostsService {
    private final ForumPostsRepository forumPostsRepository;

    public ForumPostsService(ForumPostsRepository forumPostsRepository) {
        this.forumPostsRepository = forumPostsRepository;
    }

    public ForumPosts addForumPost(ForumPosts forumPost) {
        return forumPostsRepository.save(forumPost);
    }

    public List<ForumPosts> getAllForumPosts() {
        return forumPostsRepository.findForumPostsByDescendingId();
    }

    @Transactional
    public void incrementLikes(Long forum_post_id) {
        forumPostsRepository.incrementLikes(forum_post_id);
    }

}
