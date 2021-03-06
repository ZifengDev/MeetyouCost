package com.meiyou.meetyoucostdemo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.meiyou.meetyoucost.CostLog;
import com.meiyou.meetyoucost.MeetyouCost;
import com.meiyou.meetyoucost.ui.LogView;
import com.meiyou.meetyoucostplugin.Cost;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);

        /*MeetyouCost.openLogUI(getApplicationContext(),true);
        MeetyouCost.setLogListener(new MeetyouCost.onLogListener() {

            @Override
            public void log(String log, String methodName, long costTimeMs) {
                Log.d(TAG, "MeetyouCost onLogListener:" + log);
                //String str="默认颜色<font color='#FF0000'>红颜色</font>";
                *//*if(costTimeMs>50){
                    String costLogs = "<font color='#ff74b9'>"+costTimeMs+"</font>";
                    mLogView.appendLog(methodName+":"+costLogs+" ms");
                }else {
                    mLogView.appendLog(methodName+":"+costTimeMs+" ms");
                }*//*

            }
        });
        MeetyouCost.openLogCache(true);*/
       /* MeetyouCost.setLogListener(new MeetyouCost.onLogListener() {

            @Override
            public void log(String log, String methodName, long costTimeMs) {

            }
        });
*/
       TestController.getInstance();
        CostLog costLog = new CostLog();
        Log.d(TAG,"costLog.isOk():"+costLog.isOk());

    }


    @Override
    @Cost
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
        showTest("", new View(this), 0);
        show("", new View(this));

    }

    @Cost
    public void show() {
        for (int i = 0; i < 100; i++) {

        }
        Log.d(TAG, "MeetyouCost getLogCache:" + MeetyouCost.getLogCache().toArray().toString());
    }

    //@Cost
    public void showTest(String str, View view, int value) {
        for (int i = 0; i < 100; i++) {

        }
    }

    //@Cost
    public void show(String str, View view) {
        for (int i = 0; i < 100; i++) {

        }
    }
}
