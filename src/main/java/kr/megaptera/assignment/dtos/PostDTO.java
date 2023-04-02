package kr.megaptera.assignment.dtos;

import kr.megaptera.assignment.models.Post;

public class PostDTO {

    private String id;
    private String title;
    private String author;
    private String content;

    public PostDTO() {
    }

    public PostDTO(String id, String title, String author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public PostDTO(Post post) {
        this.id = post.id().toString();
        this.title = post.title();
        this.author = post.author();
        this.content = post.content().toString();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

}