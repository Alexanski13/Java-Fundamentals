package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articles.add(article);
        }
        String input = scanner.nextLine();
        switch (input) {
            case "title":
                articles.stream()
                        .sorted((p1, p2) -> p1.title.compareTo(p2.title))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                articles.stream()
                        .sorted((p1, p2) -> p1.content.compareTo(p2.content))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                articles.stream()
                        .sorted((p1, p2) -> p1.author.compareTo(p2.author))
                        .forEach(article -> System.out.println(article.toString()));
                break;
        }

    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            // "{title} - {content}: {author}"
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
