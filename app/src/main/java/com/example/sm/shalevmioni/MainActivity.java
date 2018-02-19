package com.example.sm.shalevmioni;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch st;
    Button btn;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        st = (Switch) findViewById(R.id.st);
        btn = (Button) findViewById(R.id.btn);
        LL = (LinearLayout) findViewById(R.id.LL);
    }

    public void shalev1(View view) {

        boolean bool1 = ((ToggleButton) view).isChecked();

        if (bool1) {
            LL.setBackgroundColor(Color.BLUE);
        } else {
            LL.setBackgroundColor(Color.MAGENTA);
        }
    }

    public void shalev2(View view) {

        boolean bool2 = ((Switch) view).isChecked();

        if (bool2) {
            LL.setBackgroundColor(Color.YELLOW);
        } else {

            LL.setBackgroundColor(Color.RED);
        }
    }

    public void shalev3(View view) {

        if (tb.isChecked()) {

            Toast.makeText(this, "ToggleButton is ON", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "ToggleButton is OFF", Toast.LENGTH_LONG).show();
        }
        if (st.isChecked()) {

            Toast.makeText(this, "Switch is ON", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Switch is OFF", Toast.LENGTH_LONG).show();
        }
    }
}







