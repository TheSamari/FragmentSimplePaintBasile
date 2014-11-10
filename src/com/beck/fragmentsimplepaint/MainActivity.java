package com.beck.fragmentsimplepaint;



import java.util.Random;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new MyFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
        case R.id.plus:
        	GetterSetter.size = GetterSetter.size + 10;
            return true;
        
        case R.id.minus:
        	GetterSetter.size = GetterSetter.size - 10;
            return true;
            
        case R.id.red:
        	GetterSetter.blue = 0;
        	GetterSetter.green = 0;
        	GetterSetter.red = 255;
            return true;
            
        case R.id.blue:
        	GetterSetter.red = 0;
        	GetterSetter.green = 0;
        	GetterSetter.blue = 255;
            return true;
            
        case R.id.green:
        	GetterSetter.red = 0;
        	GetterSetter.blue = 0;
        	GetterSetter.green = 255;
            return true;
            
        //case R.id.random:
        	//final Random rnd = new Random();
        	//int x = rnd(256);
        	//int y = rnd(256);
        	//int z = rnd(256);
            //return true;
        default:
            return super.onOptionsItemSelected(item);
		}
	}
}
	/**
	 * A placeholder fragment containing a simple view.
	 */
	
