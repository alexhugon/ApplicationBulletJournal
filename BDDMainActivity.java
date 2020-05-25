package com.example.applibullet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
public class DatabaseHandler extends SQLiteOpenHelper
{
    public static String USER_TABLE_CREATE =
        "CREATE TABLE UTILISATEUR(" +
                "id_user INTEGER PRIMARY KEY AUTOINCREMENT," +
                "pseudo_user TEXT," +
                "mail_user  TEXT" +
                "mdp_user TEXT);";
    public static String TRACKER_TABLE_CREATE =
            "CREATE TABLE TRACKER(" +
                    "id_track INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "libe_track TEXT;";
    public static String CALENDRIER_TABLE_CREATE =
            "CREATE TABLE CALENDRIER(" +
                    "jour DATE PRIMARY KEY," +
                    "humer INT," +
                    "resume TEXT;";

    public DatabaseHandler(Context context, String name, CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(USER_TABLE_CREATE);
        db.execSQL(TRACKER_TABLE_CREATE);
        db.execSQL(CALENDRIER_TABLE_CREATE);
    }
}
