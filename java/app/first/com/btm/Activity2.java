package app.first.com.btm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void FirstActivity(View v) {
        intent = new Intent(this, Activity1.class);
        startActivity(intent);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Saving...",
                Toast.LENGTH_LONG);
        toast.show();

    }

}