package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, String> forumUserMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthday().getYear() <= 1999)
                .filter(forumUser -> forumUser.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser::toString));

                forumUserMap.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);
    }
}