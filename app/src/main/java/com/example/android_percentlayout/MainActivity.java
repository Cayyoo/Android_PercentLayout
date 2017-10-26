package com.example.android_percentlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 百分比布局：
 * 由于LinearLayout本身已经支持按比例指定控件大小了，因此百分比布局只为FrameLayout和RelativeLayout进行了功能扩展，
 * 提供了PercentFrameLayout和PercentRelativeLayout两个布局。
 * PercentFrameLayout继承了FrameLayout所有属性。
 * PercentRelativeLayout继承了RelativeLayout所有属性。
 *
 * Android团队将百分比布局定义在了support库中，
 * 因此需要在build.gradle中引入百分比布局库的依赖，才能保证在Android所有系统版本上的兼容性。
 *
 * 在.xml文件中的使用：
 * 由于百分比布局并不是内置在系统SDK当中，所以需要把完整的包路径写出来，
 *   <android.support.percent.PercentRelativeLayout /> ,
 *   <android.support.percent.PercentFrameLayout />
 * 还必须定义一个app的命名空间，才能使用百分比布局的自定义属性。
 *   app:layout_widthPercent="50%"
 *   app:layout_heightPercent="50%"
 *
 *   支持的属性：
 *   - heightPercent
 *   - widthPercent
 *   - marginBottomPercent
 *   - marginEndPercent
 *   - marginLeftPercent
 *   - marginPercent
 *   - marginRightPercent
 *   - marginStartPercent
 *   - marginTopPercent
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.percent_frame_layout);
        setContentView(R.layout.percent_relative_layout);
    }
}
