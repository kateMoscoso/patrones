package main.java.com.factory;

public class Shop extends  Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}
