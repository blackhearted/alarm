package com.example.alarm.test;

import com.example.alarm.Alarm;
import com.example.alarm.AlarmDataProvider;

import junit.framework.TestCase;

public class DataProviderTest extends TestCase {
	
	AlarmDataProvider provider = new AlarmDataProvider();

	protected void setUp() throws Exception {		
		super.setUp();
		provider.onCreate();
	}

	protected void tearDown() throws Exception {
		super.tearDown();		
	}

	public void testQueryUriStringArrayStringStringArrayString() {
		provider.query(Alarm.TIMES_URI, AlarmDataProvider.timesProjectionMap, selection, selectionArgs, sortOrder)
	}

	public void testInsertUriContentValues() {
		fail("Not yet implemented");
	}

	public void testDeleteUriStringStringArray() {
		fail("Not yet implemented");
	}

	public void testUpdateUriContentValuesStringStringArray() {
		fail("Not yet implemented");
	}

}
