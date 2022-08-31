package Blog;

import Blog.posts.Comment;
import Blog.posts.Post;
import Blog.users.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Database {
    private static final HashMap<Integer, User> RegisteredUsers = new HashMap<>();
    private static final List<Post> allPosts = new ArrayList<>();
    private static final List<Comment> allComments = new ArrayList<>();

    // RegisteredUsers
    public static User getUser(int id) {
        return RegisteredUsers.get(id);
    }

    public static void updateOrCreateUser(User user) {
        RegisteredUsers.put(user.getId(), user);
    }

    public static void deleteUser(int id) {
        RegisteredUsers.remove(id);
    }

    public static ArrayList<User> getAllUsers() {
        var x = RegisteredUsers.values();

        return new ArrayList<>(x);
    }

    public static boolean isExistingId(int id) {
        return getUser(id) != null;
    }

    public static User getUser(String username, String password) {
        var allUsers = getAllUsers();

        for (var user : allUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    // AllPosts
    public static void createPost(Post post) {
        allPosts.add(post);
    }

    public static Post getPost(int id) {
        return allPosts.get(id);
    }

    public static Post removePost(int id) {
        return allPosts.remove(id);
    }

    public static boolean isPostInList(int id) {
        return getPost(id) != null;
    }

    // AllComments

    public static void createComment(Comment comment) {
        allComments.add(comment);
    }

    public static Comment getComment(int id) {
        return allComments.get(id);
    }

    public static Comment removeComment(int id) {
        return allComments.remove(id);
    }

    public static  boolean isCommentInList(int id){
        return getComment(id) != null;
    }
}
