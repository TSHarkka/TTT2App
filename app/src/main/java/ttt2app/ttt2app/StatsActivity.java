package ttt2app.ttt2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);


        // Get the Intent that started this activity and extract the string
        Intent intentFromCharsMenu = getIntent();
        String message = intentFromCharsMenu.getStringExtra(CharsMenuActivity.EXTRA_MESSAGE);
        String message2 = intentFromCharsMenu.getStringExtra(CharsMenuActivity.EXTRA_MESSAGE2);

        System.out.println(message);
        System.out.println(message2);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView.setText(message);
        textView2.setText(message2);
    }
}

