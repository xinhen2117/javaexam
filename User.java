import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class User {

    static Map<Long,User> userMap = new HashMap<>();

    private Long userId;
    private String name;
    private String email;

    /**
     * 新增用户
     * @param user
     */
    public void addUser(User user){
        userMap.put(user.getUserId(),user);
    }

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user){
        userMap.put(user.getUserId(),user);
    }

    public void removeUser(Long userId){
        userMap.remove(userId);
    }
}
