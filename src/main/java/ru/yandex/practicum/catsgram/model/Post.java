package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;

    public Post(Long id, long authorId, String description, Instant postDate) {
        this.id = id;
        this.authorId = authorId;
        this.description = description;
        this.postDate = postDate;
    }

    public Long getId() {
        return this.id;
    }

    public long getAuthorId() {
        return this.authorId;
    }

    public String getDescription() {
        return this.description;
    }

    public Instant getPostDate() {
        return this.postDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPostDate(Instant postDate) {
        this.postDate = postDate;
    }

    public String toString() {
        return "Post(id=" + this.getId() + ", authorId=" + this.getAuthorId() + ", description=" + this.getDescription() + ", postDate=" + this.getPostDate() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Post)) return false;
        final Post other = (Post) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Post;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }
}
