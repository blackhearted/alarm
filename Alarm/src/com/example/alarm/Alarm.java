package com.example.alarm;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Alarm {
    public static final String AUTHORITY = "com.example.alarm.Alarm";
    
	public static final String TABLE_NAME_ALARMS = "ALARMS";
	public static final String TABLE_NAME_COORDS = "COORDS";
	
	private static final String SCHEME = "content://";
	public static final String PATH_TIMES = "/times";
	public  static final String PATH_COORDS = "/coords";
	
	public static final String ID = "ID";
	public static final String TIME = "TIME";
	public static final String COORDS = "COORDS";

    // This class cannot be instantiated
    private Alarm() {
    }
    
    public static final Uri TIMES_URI =  Uri.parse(SCHEME + AUTHORITY + PATH_TIMES);
    public static final Uri COORDS_URI =  Uri.parse(SCHEME + AUTHORITY + PATH_COORDS);
}