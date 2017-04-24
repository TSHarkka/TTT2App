package ttt2app.ttt2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CharsMenuActivity extends AppCompatActivity {

    ImageButton charBtn;
    public static final String EXTRA_MESSAGE = "ttt2app.MESSAGE"; // sisalto tunnistus tarkoituksiin
    public static final String EXTRA_MESSAGE2 = "TTT2APP.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chars);

        charBtn = (ImageButton) findViewById(R.id.charBtn);
    }

    /** Called when the user taps the Send button */
    public void sendCharNameToStats(View view) {
        Intent intentFromMainMenu = getIntent();

        Intent intentToStats = new Intent(this, StatsActivity.class); // this on contexti
        String message = "hahmon nimi tahan";
        intentToStats.putExtra(EXTRA_MESSAGE, message);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message2 = editText.getText().toString();
        intentToStats.putExtra(EXTRA_MESSAGE2, message2);

        startActivity(intentToStats);
    }
}

