package com.example.MobilehelpDesk.repository;

import com.example.MobilehelpDesk.Model.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, String> users = new HashMap<>();

    static {
        // Pre-populate with a user (username: admin, password: password)
        users.put("admin", "password");
        users.put("femi","test");
    }

    public static boolean validateUser(String username, String password) {
        return password.equals(users.get(username));
    }
}
