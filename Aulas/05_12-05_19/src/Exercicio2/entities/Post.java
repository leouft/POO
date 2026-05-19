package Exercicio2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private int likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(String title, String content) {
        moment = new Date();
        this.title = title;
        this.content = content;
    }

    public void addLike(){
        likes++;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = sdf.format(moment);

        sb.append(String.format("%s\n", title));
        sb.append(String.format("%d Likes - %s\n", likes, date));
        sb.append(String.format("%s\n", content));
        sb.append(String.format("Comments:\n"));
        for (Comment comment : comments) {
            sb.append(comment.getComment()+"\n");
        }

        return sb.toString();
    }
}
