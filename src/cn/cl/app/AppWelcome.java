package cn.cl.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import cn.cl.app.ui.GuideActivity;
import cn.cl.app.ui.MainActivity;

/**
 * ª∂”≠ΩÁ√Ê
 * @author chenleicpp
 *
 */
public class AppWelcome extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState); 
		View view = View.inflate(this, R.layout.activity_welcome, null);
		setContentView(view);
		
		AlphaAnimation aa = new AlphaAnimation(0.3f, 1.0f);
		aa.setDuration(2000);
		view.startAnimation(aa);
		aa.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				jumpTo();
			}
		});
	}

	private void jumpTo(){
		startActivity(new Intent(this, GuideActivity.class));
		finish();
	}

}
