package services;

import models.User;

public class UserService {

    public User initiateUser(String nickname) {
        return new User(nickname);
    }

}