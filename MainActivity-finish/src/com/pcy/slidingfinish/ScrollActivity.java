package com.pcy.slidingfinish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ScrollView;

import com.pcy.view.SlidingFinishLayout;
import com.pcy.view.SlidingFinishLayout.OnSlidingFinishListener;

public class ScrollActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll);

		ScrollView mScrollView = (ScrollView) findViewById(R.id.scrollView1);

		SlidingFinishLayout mSildingFinishLayout = (SlidingFinishLayout) findViewById(R.id.sildingFinishLayout);
		mSildingFinishLayout.setOnSlidingFinishListener(new OnSlidingFinishListener() {
			
			@Override
			public void onSlidingFinish() {
				ScrollActivity.this.finish();
			}
		});

		// 设置touchView到ScrollView上面
		mSildingFinishLayout.setTouchView(mScrollView);
	}
	
	
	// Press the back button in mobile phone点击手机的返回键时执行
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0, R.anim.base_slide_right_out);
	}

}
