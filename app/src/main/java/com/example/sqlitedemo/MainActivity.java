package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(dbSession().getUserDao().loadAll().size() == 0) {
            User user = new User(1L, "Mirmohammad Saadati", "mir", "", "");
            dbSession().getUserDao().insert(user);
        }

        List<User> usersWithName = dbSession().getUserDao().queryBuilder()
                .where(UserDao.Properties.Name.eq("Mirmohammad Saadati")).build().list();
        Log.d("MAIN", "onCreate: " + usersWithName.toString());
    }

    public void addUser(View view) {
        String name = ((EditText)findViewById(R.id.nameET)).getText().toString();
        String username = ((EditText)findViewById(R.id.usernameET)).getText().toString();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        User user = new User(name, username, dateFormat.format(date), "");
        dbSession().getUserDao().insert(user);
    }

    public void loadUsers(View view) {
        for(User user: dbSession().getUserDao().loadAll()) {
            Log.d("MAIN", "loadUser: " + user.toString());
        }
    }

    private DaoSession dbSession() {
        return ((SQLiteDemo)getApplication()).getSession();
    }
}
