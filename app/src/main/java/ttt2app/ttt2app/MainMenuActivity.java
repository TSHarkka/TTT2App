package ttt2app.ttt2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {

    ImageButton charBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        charBtn = (ImageButton) findViewById(R.id.charBtn);
    }

    /** Called when the user taps the Send button */
    public void navToCharsMenu(View view) {
        Intent intentToCharsMenu = new Intent(this, CharsMenuActivity.class); // this on contexti
        startActivity(intentToCharsMenu);
    }
}
