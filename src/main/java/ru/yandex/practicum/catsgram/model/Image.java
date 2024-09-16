package ru.yandex.practicum.catsgram.model;

public class Image {
    Long id;
    long postId;
    String originalFileName;
    String filePath;

    public Image(Long id, long postId, String originalFileName, String filePath) {
        this.id = id;
        this.postId = postId;
        this.originalFileName = originalFileName;
        this.filePath = filePath;
    }

    public Long getId() {
        return this.id;
    }

    public long getPostId() {
        return this.postId;
    }

    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "Image(id=" + this.getId() + ", postId=" + this.getPostId() + ", originalFileName=" + this.getOriginalFileName() + ", filePath=" + this.getFilePath() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Image)) return false;
        final Image other = (Image) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Image;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }
}
