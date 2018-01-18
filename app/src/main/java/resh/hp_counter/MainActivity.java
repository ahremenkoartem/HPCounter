package resh.hp_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView XP1;
    TextView XP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymainactivity);
    }
    public void plus1(View view)
    {
        XP1 = (TextView) findViewById(R.id.text1);
        XP1.setText(Integer.parseInt(XP1.getText().toString())+1+"");
    }
    public void plus2(View view)
    {
        XP2 = (TextView) findViewById(R.id.text2);
        XP2.setText(Integer.parseInt(XP2.getText().toString())+1+"");
    }
    public void minus1(View view)
    {
        XP1 = (TextView) findViewById(R.id.text1);
        XP1.setText(Integer.parseInt(XP1.getText().toString())-1+"");
    }
    public void minus2(View view)
    {
        XP2 = (TextView) findViewById(R.id.text2);
        XP2.setText(Integer.parseInt(XP2.getText().toString())-1+"");
    }

}
