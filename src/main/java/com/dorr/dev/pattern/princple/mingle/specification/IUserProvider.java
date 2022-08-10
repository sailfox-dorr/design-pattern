package com.dorr.dev.pattern.princple.mingle.specification;

import java.util.ArrayList;

public interface IUserProvider {
     ArrayList<User> findUser(IUserSpecification ius);
}
