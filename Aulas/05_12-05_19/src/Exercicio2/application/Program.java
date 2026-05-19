package Exercicio2.application;

import Exercicio2.entities.Comment;
import Exercicio2.entities.Post;

public class Program {
    public static void main(String[] args) {
        Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!");
        Comment comment1Post1 = new Comment("Have a nice trip");
        Comment comment2Post1 = new Comment("Wow that's awesome!");
        post1.addComment(comment1Post1);
        post1.addComment(comment2Post1);

        for (int i = 0; i < 12; i++)
            post1.addLike();

        Post post2 = new Post("Good night guys", "See you tomorrow");
        Comment comment1Post2 = new Comment("Good night");
        Comment comment2Post2 = new Comment("May the Force be with you");
        post2.addComment(comment1Post2);
        post2.addComment(comment2Post2);

        for (int i = 0; i < 5; i++)
            post2.addLike();

        System.out.printf("%s\n",post1.toString());
        System.out.printf("%s",post2.toString());
    }
}
