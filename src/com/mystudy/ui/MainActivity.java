package com.mystudy.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView show;
	private MyPopupWindow popupWindow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		show=(ImageView) findViewById(R.id.show);
		show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (popupWindow==null) {
					popupWindow=new MyPopupWindow(MainActivity.this);
					popupWindow.init();
				}
				popupWindow.showMoreWindow(v, 200);
			}
		});
	}
}
