package org.example.tahmiinbackend.forumPosts;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/auth/forum-posts")
public class ForumPostsController {
    private final ForumPostsService forumPostsService;

    public ForumPostsController(ForumPostsService forumPostsService) {
        this.forumPostsService = forumPostsService;
    }

    @PostMapping("/add-forum-post")
    public void addForumPost(@RequestBody ForumPosts forumPost) {
        forumPostsService.addForumPost(forumPost);
    }

    @GetMapping("/get-all-forum-posts")
    public List<ForumPosts> getAllForumPosts() {
        return forumPostsService.getAllForumPosts();
    }

    @PostMapping("/like-forum-post/{forum_post_id}")
    public void likeForumPost(@PathVariable("forum_post_id") Long forum_post_id) {
        forumPostsService.incrementLikes(forum_post_id);
    }
}
