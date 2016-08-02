package com.pcy.slidingfinish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.pcy.view.SlidingFinishLayout;
import com.pcy.view.SlidingFinishLayout.OnSlidingFinishListener;

public class NormalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_normal);

		SlidingFinishLayout mSildingFinishLayout = (SlidingFinishLayout) findViewById(R.id.sildingFinishLayout);
		mSildingFinishLayout.setOnSlidingFinishListener(new OnSlidingFinishListener() {
			
			@Override
			public void onSlidingFinish() {
				NormalActivity.this.finish();
			}
		});

		mSildingFinishLayout.setTouchView(mSildingFinishLayout);
	}
	
	// Press the back button in mobile phone点击手机的返回键时执行
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0, R.anim.base_slide_right_out);
	}

}
