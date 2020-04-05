package com.udgs123.demo3gs;

import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;


import java.text.DateFormat;
import java.util.Calendar;

public class dangky_giasu extends AppCompatActivity {
    private Button buttondongy1;
    private Button buttonhuy1;
    DateFormat fmtDate = DateFormat.getDateInstance();
    TextView lblDate;
    Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }
    };

    private void updateLabel () {
        lblDate.setText(fmtDate.format(myCalendar.getTime()));
    }


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_dangky_giasu);
        lblDate = (TextView) findViewById(R.id.lblDate);
        Button btnDate = (Button) findViewById(R.id.btnDate);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(dangky_giasu.this, d,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        updateLabel();
        Spinner mondaySpin = (Spinner) findViewById(R.id.spinner_monday);
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(dangky_giasu.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mondaygs));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mondaySpin.setAdapter(myAdapter1);


        Spinner trinhdoSpin = (Spinner) findViewById(R.id.spinner_trinhdogs);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(dangky_giasu.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.trinhdogs));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trinhdoSpin.setAdapter(myAdapter);

        buttondongy1 = (Button) findViewById(R.id.buttondongy);
        buttondongy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangky_giasu.this, dangnhap.class);
                startActivity(intent);
            }
        });
        buttonhuy1 = (Button) findViewById(R.id.buttonhuy);
        buttonhuy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangky_giasu.this, ManHinhDauTien.class);
                startActivity(intent);
            }
        });
    }
}
