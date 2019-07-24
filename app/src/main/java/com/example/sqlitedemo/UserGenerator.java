package com.example.sqlitedemo;

import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class UserGenerator {

    public static void main(String[] args) {
        Schema schema = new Schema(1, "com.example.sqlitedemo.users.db");
        schema.enableKeepSectionsByDefault();
    }

    private static Entity addUserEntity(final Schema schema) {
        Entity user = schema.addEntity("User");
        user.addIdProperty().primaryKey().autoincrement();
        user.addStringProperty("name");
        user.addStringProperty("username").unique().notNull();
        return user;
    }
}
