package com.example.lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // A bunch of Buttons and a TextView
    private Button btnAdd;
    private Button btnTake;
    private TextView txtValue;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;

    private int value = 0;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onCreate");
//    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        btnAdd = (Button) findViewById(R.id.btnAdd);
//        btnTake = (Button) findViewById(R.id.btnTake);
//        txtValue = (TextView) findViewById(R.id.txtValue);
//        btnGrow = (Button) findViewById(R.id.btnGrow);
//        btnShrink = (Button) findViewById(R.id.btnShrink);
//        btnReset = (Button) findViewById(R.id.btnReset);
//        btnHide = (Button) findViewById(R.id.btnHide);
//
//        btnAdd.setOnClickListener(this);
//        btnTake.setOnClickListener(this);
//        txtValue.setOnClickListener(this);
//        btnGrow.setOnClickListener(this);
//        btnShrink.setOnClickListener(this);
//        btnReset.setOnClickListener(this);
//        btnHide.setOnClickListener(this);
//
//        Log.i("info", "Done creating the app");
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.exploration_layout);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog= new MyDialog();
                // Create the dialog
                myDialog.show(getSupportFragmentManager(), "123");
            }
        });

        //    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // We only handle one button
//                // So no switching required
//                MyDialog myDialog = new MyDialog();
//                myDialog.show(getFragmentManager(), "123");
//            }
//        });
//
//    }

    }

    @Override
    public void onClick(View view) {
        float size;
        int viewId = view.getId();

        if (viewId == R.id.btnAdd) {
            value++;
            txtValue.setText(String.valueOf(value));
        } else if (viewId == R.id.btnTake) {
            value--;
            txtValue.setText(String.valueOf(value));
        } else if (viewId == R.id.btnReset) {
            value = 0;
            txtValue.setText(String.valueOf(value));
        } else if (viewId == R.id.btnGrow) {
            size = txtValue.getTextScaleX();
            txtValue.setTextScaleX(size + 1);
        } else if (viewId == R.id.btnShrink) {
            size = txtValue.getTextScaleX();
            txtValue.setTextScaleX(size - 1);
        } else if (viewId == R.id.btnHide) {
            if (txtValue.getVisibility() == View.VISIBLE) {
                // Currently visible so hide it
                txtValue.setVisibility(View.INVISIBLE);
                // Change text on the button
                btnHide.setText("SHOW");
            } else {
                // Currently hidden so show it
                txtValue.setVisibility(View.VISIBLE);
                // Change text on the button
                btnHide.setText("HIDE");
            }
        }
    }

    Note mTempNote = new Note();

    public void createNewNote(Note n){
        // Temporary code
        mTempNote = n;
    }
}