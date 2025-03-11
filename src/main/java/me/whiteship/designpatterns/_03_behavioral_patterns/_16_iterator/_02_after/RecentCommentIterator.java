package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentCommentIterator implements Iterator<Comment> {

    private Iterator<Comment> internalIterator;


    public RecentCommentIterator(List<Comment> comments) {
        Collections.sort(comments, (o1, o2) -> o2.getLocalDateTime().compareTo(o1.getLocalDateTime()));
        this.internalIterator = comments.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Comment next() {
        return this.internalIterator.next();
    }
}
