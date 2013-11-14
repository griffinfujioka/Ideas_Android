package com.example.ideas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/* DatabaseWrapper is inherited from the SQLiteOpenHelper class 	*/ 
public class DatabaseWrapper extends SQLiteOpenHelper {
	
	public static final String TABLE_NAME = "Ideas";	
    public static final String IDEA_ID = "ideaId";
    public static final String IDEA_TITLE = "title";
    public static final String IDEA_DESCRIPTION = "description";
    public static final String IDEA_SYSTEM_REQUIREMENTS = "systemRequirements"; 
    public static final String IDEA_USE_CASES = "useCases"; 
    public static final String IDEA_PLATFORMS = "platforms"; 
    public static final String IDEA_TAGS = "tags"; 
    
    private static final String DATABASE_NAME = "Ideas.db";
    private static final int DATABASE_VERSION = 1;
    
    /* TODO: Add remaining columns to the DATABASE_CREATE statement 	*/ 
    private static final String DATABASE_CREATE = "create table " + TABLE_NAME
    		+ "(" + IDEA_ID + " integer primary key autoincrement, "
    		+ IDEA_TITLE + " text not null, "
    		+ IDEA_DESCRIPTION + " text not null);";



	public DatabaseWrapper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO: Add some version logging here 
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		onCreate(db);


	}

}
