package com.example.ideas;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	@SuppressLint("NewApi")
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.new_idea:
	        	item.collapseActionView(); 
	        	item.setVisible(false); 
	        	this.invalidateOptionsMenu();
	        	NewIdea(); 
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void NewIdea()
	{
		Intent intent = new Intent(this, NewIdea.class);
		startActivity(intent);
		
	}

}
