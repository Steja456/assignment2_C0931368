package com.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {
    @Test
    void testValidBlogPostCreation() {
        BlogPost post = BlogPost.builder()
                .id("B003")
                .authorId("P003")
                .postContent("This is Alice's first blog post content.")
                .build();

        assertEquals("B003", post.getId());
        assertEquals("P003", post.getAuthorId());
        assertEquals("This is Alice's first blog post content.", post.getPostContent());
    }

    @Test
    void testInvalidBlogPostCreation() {
        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .id(null)
                .authorId("P003")
                .postContent("Content")
                .build());

        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .id("B004")
                .authorId(null)
                .postContent("Content")
                .build());
    }
}
