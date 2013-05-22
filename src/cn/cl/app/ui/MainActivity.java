package cn.cl.app.ui;

import android.os.Bundle;
import android.view.Menu;
import cn.cl.app.R;

import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {
	
	//滑动菜单
	private SlidingMenu sm;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initSlidingMenu();
		setContentView(R.layout.activity_main);
	}

	/**
	 * 初始化滑动菜单组件
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
