package yuri.kl.com.ua.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstMenuItem1 = (TextView) findViewById(R.id.menu_item_1);
        Log.i("MainActivity", (String) firstMenuItem1.getText());

        // Find second menu item TextView and print the text to the logs
        TextView firstMenuItem2 = (TextView) findViewById(R.id.menu_item_2);
        Log.i("MainActivity", (String) firstMenuItem2.getText());

        // Find third menu item TextView and print the text to the logs
        TextView firstMenuItem3 = (TextView) findViewById(R.id.menu_item_3);
        Log.i("MainActivity", (String) firstMenuItem3.getText());
    }
}