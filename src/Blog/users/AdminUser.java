package Blog.users;

import Blog.users.enums.PermissionLevel;

public class AdminUser extends User{
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public PermissionLevel getPermissionLevel() {
        return PermissionLevel.ADMIN;
    }
}
