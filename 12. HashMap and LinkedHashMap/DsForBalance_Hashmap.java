// problem Statement

// Design a data structure to store:

// User ID
// Balance

// Implement two operations:

// 1. set(userId, balance)
// If the user does not exist → Insert the user.
// If the user already exists → Update the balance.
// 2. get(userId)

// Returns the balance of the given user.

import java.util.HashMap;


class UserList {
    HashMap<Integer, Integer> map = new HashMap<>();
    void set(int id, int balance){
        map.put(id, balance);
    }
    int get(int id){
        return map.getOrDefault(id, -1);
    }

}
public class DsForBalance_Hashmap {

    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.set(1, 100);
        userList.set(2, 2000);
        System.out.println(userList.get(1));
        System.out.println(userList.get(2));
        userList.set(2, 400);
        System.out.println(userList.get(2));
    }
    
}
