package com.dorr.dev.pattern.princple.mingle.specification;

import java.util.ArrayList;
import java.util.List;

public class UserProvider implements IUserProvider {

    private List<User> users;


    public UserProvider(List<User> users) {
        this.users = users;
    }


    public void addUser(User user) {
        if (users == null) {
            this.users = new ArrayList<>();

        }

        this.users.add(user);
    }


    @Override
    public ArrayList<User> findUser(IUserSpecification ius) {

        ArrayList<User> result = new ArrayList<>();
        for (User user : users) {
            if (ius.isSatisfiedBy(user)) {
                result.add(user);

            }
        }


        return result;
    }
}
