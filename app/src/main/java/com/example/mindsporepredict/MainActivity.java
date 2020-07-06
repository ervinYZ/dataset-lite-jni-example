package com.example.mindsporepredict;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    static{
        System.loadLibrary("dataset_lite");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Debug.startMethodTracing("testms");
        //mnistTest2();
        //Debug.stopMethodTracing();
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                decodeTest();
                Toast.makeText(MainActivity.this, "test done",
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    public native String stringFromJNI();
    public native void pathTest(String path);
    public native void mnistTest2();
    public native void decodeTest();
}
