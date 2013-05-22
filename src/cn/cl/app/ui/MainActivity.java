package cn.cl.app.ui;

import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingFragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import cn.cl.app.R;

public class MainActivity extends SlidingFragmentActivity {
	
	//�����˵�
	private SlidingMenu sm;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initSlidingMenu();
		setContentView(R.layout.activity_main);
	}

	/**
	 * ��ʼ�������˵����
	 */
	private void initSlidingMenu() {
		setBehindContentView(R.layout.behind_slidingmenu);
		// customize the SlidingMenu
		sm = getSlidingMenu();
		sm.setMode(SlidingMenu.LEFT);
		sm.setShadowWidth(getWindowManager().getDefaultDisplay().getWidth() / 40);
		sm.setShadowDrawable(R.drawable.slidingmenu_shadow);
		sm.setBehindOffset(250);
		sm.setFadeEnabled(true);
		sm.setFadeDegree(0.4f);
		sm.setBehindScrollScale(0);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
