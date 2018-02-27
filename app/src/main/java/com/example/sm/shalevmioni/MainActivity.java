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
    boolean bool1;
    boolean bool2;

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
        bool1 = tb.isChecked();
    }

    public void shalev2(View view) {

        bool2 = st.isChecked();
    }

    public void shalev3(View view) {

        if (bool1 && bool2) {
            LL.setBackgroundColor(Color.MAGENTA);
        } else if (!bool1 && bool2) {
            LL.setBackgroundColor(Color.CYAN);
        }
        else if (bool1 && !bool2) {
                LL.setBackgroundColor(Color.GRAY);
            } else if (!bool1 && !bool2) {
                LL.setBackgroundColor(Color.LTGRAY);
            }
            }
        }








