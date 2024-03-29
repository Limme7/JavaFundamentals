package L6ObjectsClasses.Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        //"Holy Ghost, content, John Sandford".split(", ")
        //-> ["Holy Ghost", "content", "John Sandford"]
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            //"{име на команда}: {нова стойност}".split(": ") -> ["{име на команда}", "{нова стойност}"]
            //"Edit: {new content}"
            //"ChangeAuthor: {new author}"
            //"Rename: {new title}"
            String commandName = command.split("\\: ")[0]; //"Edit", "ChangeAuthor", "Rename"
            String newValue = command.split("\\: ")[1];

            switch (commandName) {
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.rename(newValue);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
