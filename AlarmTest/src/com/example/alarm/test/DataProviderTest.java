package com.example.alarm.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.test.ProviderTestCase2;
import android.test.mock.MockContentResolver;

import com.example.alarm.Alarm;
import com.example.alarm.AlarmDataProvider;

@SuppressLint("SimpleDateFormat")
public class DataProviderTest extends ProviderTestCase2<AlarmDataProvider> {
	
	public DataProviderTest() {
		super(AlarmDataProvider.class, Alarm.AUTHORITY);
	}

	private MockContentResolver mMockResolver;
		
	private static final String[] PROJECTION_TIMES =
            new String[] {
                Alarm.ID,
                Alarm.TIME,
                Alarm.COORDS
        };

	protected void setUp() throws Exception {		
		super.setUp();
		mMockResolver = getMockContentResolver();
	}

	protected void tearDown() throws Exception {
		super.tearDown();	
		
	}

	public void testQueryUriStringArrayStringStringArrayString() {		
		Cursor cursor = mMockResolver.query(Alarm.TIMES_URI
									, PROJECTION_TIMES
									, null
									, null
									, null);
		assertEquals( cursor.getCount() , 0);
	}

	public void testInsertUriContentValues() {
		ContentValues values = new ContentValues();
		values.put(Alarm.ID, 1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date date = new Date(0);
		values.put(Alarm.TIME, dateFormat.format(date) );
		values.put(Alarm.COORDS, "NA");
		Uri uri = mMockResolver.insert(Alarm.TIMES_URI, values);
		assertEquals(uri, Alarm.TIMES_URI);
		
		Cursor cursor = mMockResolver.query(Alarm.TIMES_URI
				, PROJECTION_TIMES
				, null
				, null
				, null);
		assertEquals( cursor.getCount() , 1);
	}

	public void testDeleteUriStringStringArray() {
		fail("Not yet implemented");
	}

	public void testUpdateUriContentValuesStringStringArray() {
		fail("Not yet implemented");
	}

}