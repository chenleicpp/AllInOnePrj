package cn.cl.app.ui;

import java.util.ArrayList;
import java.util.List;
import cn.cl.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Òýµ¼Ñ§Ï°Ò³
 * @author chenleicpp
 *
 */
public class GuideActivity extends Activity {
	
	private ViewPager mPager;
	private Button mBtn_KSTY;
	private View mPage1,mPage2,mPage3,mPage4;
	private List<View> mViews = new ArrayList<View>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guide_activity);
		mPage1 = View.inflate(this, R.layout.activity_guide_page1, null);
		mPage2 = View.inflate(this, R.layout.activity_guide_page2, null);
		mPage3 = View.inflate(this, R.layout.activity_guide_page3, null);
		mPage4 = View.inflate(this, R.layout.activity_guide_page4, null);
		
		findViewById();
		setListener();
		
		mViews.add(mPage1);
		mViews.add(mPage2);
		mViews.add(mPage3);
		mViews.add(mPage4);
		mPager.setAdapter(new ViewPagerAdapter());
	}
	
	private void findViewById(){
		mPager = (ViewPager) findViewById(R.id.guide_activity_viewpager);
		mBtn_KSTY = (Button) mPage4.findViewById(R.id.guide_activity_btn);
	}
	
	private void setListener(){
		mBtn_KSTY.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(GuideActivity.this, MainActivity.class));
				finish();
			}
		});
	}
	
	private class ViewPagerAdapter extends PagerAdapter {

		public void destroyItem(View arg0, int arg1, Object arg2) {
			((ViewPager) arg0).removeView(mViews.get(arg1));
		}

		public void finishUpdate(View arg0) {

		}

		public int getCount() {

			return mViews.size();
		}

		public Object instantiateItem(View arg0, int arg1) {
			((ViewPager) arg0).addView(mViews.get(arg1));
			return mViews.get(arg1);

		}

		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		public void restoreState(Parcelable arg0, ClassLoader arg1) {

		}

		public Parcelable saveState() {
			return null;
		}

		public void startUpdate(View arg0) {

		}

	}
}
