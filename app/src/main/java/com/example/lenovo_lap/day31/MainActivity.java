package com.example.lenovo_lap.day31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int score = 0;
    RadioGroup radiogroup;
    Button submit;
    Button reset;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.b1);
        reset = (Button) findViewById(R.id.b2);
        radiogroup = (RadioGroup) findViewById(R.id.rg);
        ed = (EditText) findViewById(R.id.edittext);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.rb1:
                                score = score + 1;
                                break;
                            case R.id.rb2:
                                break;
                            case R.id.rb3:
                                break;
                            case R.id.rb4:
                                break;
                        }
                    }
                });

                CheckBox qAnswer1 = (CheckBox) findViewById(R.id.c1);
                boolean isChecked1 = qAnswer1.isChecked();
                CheckBox qAnswer2 = (CheckBox) findViewById(R.id.c2);
                boolean isChecked2 = qAnswer2.isChecked();
                CheckBox qAnswer3 = (CheckBox) findViewById(R.id.c3);
                boolean isChecked3 = qAnswer3.isChecked();
                CheckBox qAnswer4 = (CheckBox) findViewById(R.id.c4);
                boolean isChecked4 = qAnswer4.isChecked();
                if (isChecked1 && isChecked3 && !isChecked2 && !isChecked4) {
                    score = score + 1;
                }

                String e = ed.getText().toString();
                if ((e).equals(getString(R.string.answer))) {
                    score = score + 1;
                }
                Toast.makeText(MainActivity.this, "Score =" + score, Toast.LENGTH_SHORT).show();
            }

        });

        public void resetButton(View V) {
            ViewGroup vg = (ViewGroup) findViewById(R.id.activity_main);
            vg.invalidate();
            setContentView(R.layout.activity_main);
        }
    }
}
