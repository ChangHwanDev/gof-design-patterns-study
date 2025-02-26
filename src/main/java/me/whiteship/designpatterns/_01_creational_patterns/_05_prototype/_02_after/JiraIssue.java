package me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after;

import java.util.Objects;

public class JiraIssue implements Cloneable {

    private Long id;

    private String title;

    private JiraComment comment;

    public JiraIssue(JiraComment comment) {
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JiraComment getComment() {
        return comment;
    }

    public void setComment(JiraComment comment) {
        this.comment = comment;
    }

    public String getCommentUrl() {
        return String.format("https://jira.com/%s/issues/%d",
                comment.getId(),
                this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JiraIssue that = (JiraIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, comment);
    }
}
