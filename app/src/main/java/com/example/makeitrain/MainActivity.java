package com.example.makeitrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static com.example.makeitrain.R.id.button_reset_money;

public class MainActivity extends AppCompatActivity {
    private Button showMoney;
    private Button showTag;
    private Button setClear;
    private int moneyCounter =0;

    private TextView monetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMoney=findViewById(R.id.button_make_rain);
        showTag= findViewById(R.id.button_show_tag);
        monetText=findViewById(R.id.money_text);
        setClear= findViewById(R.id.button_reset_money);


    }
    public void setClear(View v)
    {   int i=0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        monetText.setText(String.valueOf(numberFormat.format(i)));
        Log.d("MY","onClick: reset Money"  );

    }

    public void makeItRain(View v)
    {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter +=1000;
        monetText.setText(String.valueOf(numberFormat.format(moneyCounter)));
        Log.d("MIR","makeItRain: Tapped " + moneyCounter);

       switch (moneyCounter)
       {
           case 20000:
                monetText.setTextColor(getResources().getColor(R.color.myColor));
            break;
           case 40000:
               monetText.setTextColor(getResources().getColor(R.color.myColor1));
               break;
           case 60000:
               monetText.setTextColor(getResources().getColor(R.color.myColor2));

       }   }
    public void showTag(View v)
    {
        Toast.makeText(getApplicationContext(),"Hello there", Toast.  LENGTH_LONG)
                .show();
        Log.d("MYTAG","onClick: Show Money"  );

    }

}
