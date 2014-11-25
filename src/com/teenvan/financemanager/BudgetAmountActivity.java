package com.teenvan.financemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BudgetAmountActivity extends Activity {
	// Declaration of member variables
	protected EditText numberEdit;
	protected Button continueButton;
	protected String amount;
	protected TextView budgetAmount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_budget_amount);
		budgetAmount = (TextView) findViewById(R.id.budgetTextView);
		numberEdit = (EditText) findViewById(R.id.numberEdit);

		continueButton = (Button) findViewById(R.id.continueButton);
		continueButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Start new activity
				amount = numberEdit.getText().toString();

				Intent intent = new Intent(BudgetAmountActivity.this,
						MainFinanceActivity.class);
				intent.putExtra("Value", amount);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.budget_amount, menu);
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
