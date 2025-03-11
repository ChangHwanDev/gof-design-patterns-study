package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Post post = new Post();
        post.addComment("첫 번째 댓글");
        Thread.sleep(10);
        post.addComment("두 번째 댓글");
        Thread.sleep(10);
        post.addComment("세 번째 댓글");

        List<Comment> Comments = post.getComments();
        Iterator<Comment> iterator = Comments.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0 ; i < Comments.size() ; i++) {
            Comment Comment = Comments.get(i);
            System.out.println(Comment.getComment());
        }

        Iterator<Comment> recentCommentIterator = post.getRecentCommentIterator();
        while(recentCommentIterator.hasNext()) {
            System.out.println(recentCommentIterator.next().getComment());
        }
    }
}
