package com.teenvan.financemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class OneoffActivity extends Activity {
	// Declaration of memeber variables
	protected TextView euroText, dollarText, rupeeText, poundText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_oneoff);
		euroText = (TextView) findViewById(R.id.euroText);
		dollarText = (TextView) findViewById(R.id.dollarText);
		rupeeText = (TextView) findViewById(R.id.rupeeText);
		poundText = (TextView) findViewById(R.id.poundText);
		euroText.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Start a new Activity
				Intent intent = new Intent(OneoffActivity.this,
						BudgetAmountActivity.class);
				intent.putExtra("Currency", "Euro");
				startActivity(intent);

			}
		});
		dollarText.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(OneoffActivity.this,
						BudgetAmountActivity.class);
				intent.putExtra("Currency", "Dollar");
				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.oneoff, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
