package com.example.sqlitedemo;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

public class SQLiteDemo extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "demo.db");
        Database db = helper.getWritableDb();
        DaoMaster mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getSession() {
        return this.mDaoSession;
    }
}
