package me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        JiraComment comment = new JiraComment();
        comment.setId(1L);

        JiraIssue jiraIssue = new JiraIssue(comment);
        jiraIssue.setId(1L);
        jiraIssue.setTitle("긴급 장애 발생");

        String url = jiraIssue.getCommentUrl();
        System.out.println(url);

        JiraIssue clone = (JiraIssue) jiraIssue.clone();
        System.out.println(clone.getCommentUrl());

        comment.setId(2L);

        System.out.println(clone != jiraIssue);
        System.out.println(clone.equals(jiraIssue));
        System.out.println(clone.getClass() == jiraIssue.getClass());
        System.out.println(clone.getComment() == jiraIssue.getComment());
        System.out.println(clone.getCommentUrl());
    }

}
