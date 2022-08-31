package Blog.users;

import Blog.users.enums.PermissionLevel;

//8. Направити класу ModeratorUser која наслеђује класу User
//        - `int id`
//        - Имплементира `getPermissionLevel()` - Враћа `Moderator`
public class ModeratorUser extends User{

    public ModeratorUser(String username, String password) {
        super(username, password);
    }

    @Override
    public PermissionLevel getPermissionLevel() {
        return PermissionLevel.MODERATOR;
    }
}
