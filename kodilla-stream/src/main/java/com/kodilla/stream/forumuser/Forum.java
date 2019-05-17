package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public final List<ForumUser> getUserList() {

        List<ForumUser> userList = new ArrayList<>();

        userList.add(new ForumUser(1,"jasmena", 'F', LocalDate.of(1988, 07, 30), 13));
        userList.add(new ForumUser(2,"porucznik", 'M', LocalDate.of(1990, 01, 26), 1));
        userList.add(new ForumUser(3,"koks", 'M', LocalDate.of(1989, 06, 16), 120));
        userList.add(new ForumUser(4,"onX", 'M', LocalDate.of(1991, 06, 16), 120));
        userList.add(new ForumUser(5,"hmmm", 'M', LocalDate.of(1990, 06, 16), 0));
        userList.add(new ForumUser(6,"ala", 'F', LocalDate.of(1999, 06, 16), 120));
        userList.add(new ForumUser(7,"koks", 'M', LocalDate.of(2000, 06, 16), 1));

        return userList;
    }
}
