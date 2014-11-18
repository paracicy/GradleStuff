package com.example.liyue.helloandroidstudio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.UpdateManager;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView t = (TextView)findViewById(R.id.mytext);
        t.setText("name: " + BuildConfig.VERSION_NAME + "\ncode: " + BuildConfig.VERSION_CODE);

        checkForUpdates();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void checkForUpdates() {
        // Remove this for store builds!
        UpdateManager.register(this, "c6635b7b612505806fc44e48efad26a8");
    }
}
