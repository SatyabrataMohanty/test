package com.example.menu_db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
//java file for creating table
public class create_table extends SQLiteOpenHelper{
public static final String name="dbname";
	public create_table(Context context, CursorFactory factory,
			int version) {
		super(context, name, null,version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql="create table clg_info1(c_id integer primary key autoincrement,c_name text,c_course text,c_university)";
		db.execSQL(sql);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
