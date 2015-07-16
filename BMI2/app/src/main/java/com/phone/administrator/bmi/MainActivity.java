package com.phone.administrator.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(calcBMI);
        Button bt=(Button)findViewById(R.id.help);
        bt.setOnClickListener(aboutBMI);



       /* bt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view){

            }
        });*/


    }

    private OnClickListener aboutBMI=new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,OtherActicity.class);
            startActivity(intent);

        }
    };

    private OnClickListener calcBMI = new OnClickListener() {
        public void onClick(View view) {


            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText) findViewById(R.id.shengao2);
            EditText fieldweight = (EditText) findViewById(R.id.tizhong2);

            double height = Double.parseDouble(fieldheight.getText().toString()) / 100;
            double weight = Double.parseDouble(fieldweight.getText().toString());
            double BMI = weight / (height * height);
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Your BMI is:"+ nf.format(BMI));

            TextView fieldsuggest = (TextView) findViewById(R.id.suggest);
            if (BMI < 16) {
                fieldsuggest.setText(R.string.weight_thin1);
            } else if (BMI >= 16&&BMI<18.5) {

                fieldsuggest.setText(R.string.weight_thin2);
            } else if (BMI >= 18.5&&BMI<25) {

                fieldsuggest.setText(R.string.weight_perfect);
            } else if (BMI >= 25&&BMI<30) {

                fieldsuggest.setText(R.string.weight_fat1);
            } else if (BMI >= 30&&BMI<35) {

                fieldsuggest.setText(R.string.weight_fat2);
            } else if (BMI >= 35&&BMI<40) {

                fieldsuggest.setText(R.string.weight_fat3);
            } else {
                fieldsuggest.setText(R.string.weight_fat4);
            }


        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


