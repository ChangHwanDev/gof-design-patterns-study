package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Post {

    List<Comment> comments = new ArrayList<>();

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        this.comments.add(new Comment(comment));
    }

    public Iterator<Comment> getRecentCommentIterator() {
        return new RecentCommentIterator(this.comments);
    }
}
