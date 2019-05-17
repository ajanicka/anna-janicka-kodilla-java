package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    final int id, posts;
    final String name;
    final char sex;
    final LocalDate birthday;

    public ForumUser(final int id, final String name, final char sex, final LocalDate birthday, final int posts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", posts=" + posts;
    }
}
