package com.farhadrakib.sexualandreproductivehealth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class SplashActivity extends Activity {

	TextView Titletext,Bottomtext,VersionText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);
		
        Titletext= (TextView)findViewById(R.id.Title);
        Bottomtext = (TextView)findViewById(R.id.BottomtextView);
        VersionText = (TextView)findViewById(R.id.VersiontextView);
		Typeface typeface = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
		Titletext.setTypeface(typeface);
		
		
		startAnimating();
		
	}
	
	private void startAnimating() {
     
	
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Titletext.startAnimation(fade1);
    
       
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
       Bottomtext.startAnimation(fade2);
        
 fade2.setAnimationListener(new AnimationListener() {
	
	public void onAnimationStart(Animation animation) {
	
	
		
	}
	
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent(SplashActivity.this, MainActivity.class);
		startActivity(intent);
		SplashActivity.this.finish();
		
	}
});
 Animation spinin = AnimationUtils.loadAnimation(this, R.anim.custom_animation);
 LayoutAnimationController controller = new LayoutAnimationController(spinin);
 TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);
 for (int i = 0; i < table.getChildCount(); i++) {
     TableRow row = (TableRow) table.getChildAt(i);
     row.setLayoutAnimation(controller);
 }    
        
	}
	
	@Override
	protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	
	
    Titletext.clearAnimation();
	
  Bottomtext = (TextView) findViewById(R.id.BottomtextView);
    Bottomtext.clearAnimation();
    
	TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);
    for (int i = 0; i < table.getChildCount(); i++) {
        TableRow row = (TableRow) table.getChildAt(i);
        row.clearAnimation();
    }
	}
	
	@Override
	protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	startAnimating();
	}

}
