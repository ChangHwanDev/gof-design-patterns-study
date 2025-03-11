package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.time.LocalDateTime;

public class Comment {

    private String comment;

    private LocalDateTime localDateTime;

    public Comment(String comment) {
        this.comment = comment;
        this.localDateTime = LocalDateTime.now();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
