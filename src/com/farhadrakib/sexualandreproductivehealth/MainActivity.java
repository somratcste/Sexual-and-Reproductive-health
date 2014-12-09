package com.farhadrakib.sexualandreproductivehealth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{
	
	
	
	Button TeenAger,Adult,Help;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TeenAger = (Button) findViewById(R.id.teenager);
        Adult = (Button) findViewById(R.id.adult);
        Help = (Button) findViewById(R.id.help);
       
        TeenAger.setOnClickListener(this);
        Adult.setOnClickListener(this);
        Help.setOnClickListener(this);
        
       
        Typeface typeface = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
        TeenAger.setTypeface(typeface);
        Adult.setTypeface(typeface);
        Help.setTypeface(typeface);
		
		
        
    }
    	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==R.id.teenager){
		
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra("btnposition", 1);
			startActivity(intent);
			
		}
		
		if(v.getId()==R.id.adult){
					
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra("btnposition", 2);
			startActivity(intent);	
				}
		
		if(v.getId()==R.id.help){
			
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra("btnposition", 3);
			startActivity(intent);
		}
		
	}
}

	
 
