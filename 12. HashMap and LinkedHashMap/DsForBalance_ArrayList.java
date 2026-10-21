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

import java.util.ArrayList;

class User {
    int id, balance;
    User(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
}

class UserList {
    ArrayList<User> list;
    UserList() {
        list = new ArrayList<>();
    }

    int get(int id){
        for(User u : list){
            if(u.id == id){
                return u.balance;
            }
        }
        return -1;
    }

    void set(int id, int balance){
        for(User u:list){
            if(u.id == id){
                u.balance = balance;
                return;
            }
        }
        list.add(new User(id, balance));
    }

}
public class DsForBalance_ArrayList {

    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.set(1, 100);
        userList.set(2, 200);
        System.out.println(userList.get(1));
        System.out.println(userList.get(2));
        userList.set(2, 300);
        System.out.println(userList.get(2));
    }
    
}
