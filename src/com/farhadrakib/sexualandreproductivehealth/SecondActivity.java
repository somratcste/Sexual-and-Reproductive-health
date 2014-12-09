package com.farhadrakib.sexualandreproductivehealth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
		
		Typeface typeface = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
		
		
		Intent intent = getIntent();
		int  get = intent.getIntExtra("btnposition", 0);
		
		if(get==1){
			setContentView(R.layout.teenager);
			
			Button SanitaryNapkin;
			
			SanitaryNapkin = (Button) findViewById(R.id.SanitaryNapkin);
			//Cuming = (Button) findViewById(R.id.Cuming);
			
			SanitaryNapkin.setTypeface(typeface);
			//Cuming.setTypeface(typeface);
			
		}
		else if(get==2){
			setContentView(R.layout.adult);
			Button Famicon,Condom;
			
			Famicon = (Button) findViewById(R.id.Famicon);
			Condom = (Button) findViewById(R.id.Condom);
			
			Famicon.setTypeface(typeface);
			Condom.setTypeface(typeface);
			
		}
		else if(get==3){
			setContentView(R.layout.help);
			
			Button CallToDoctor,EmailToAuthroity,ContactWithHelathMinistry;
		
			CallToDoctor = (Button) findViewById(R.id.CallToDoctor);
			EmailToAuthroity = (Button) findViewById(R.id.EmailToAuthroity);
			ContactWithHelathMinistry = (Button) findViewById(R.id.ContactWithHelathMinistry);
		
			CallToDoctor.setTypeface(typeface);
			EmailToAuthroity.setTypeface(typeface);
			ContactWithHelathMinistry.setTypeface(typeface);
			}
	}
}
