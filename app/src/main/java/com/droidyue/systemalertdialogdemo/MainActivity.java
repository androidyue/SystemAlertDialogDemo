package com.droidyue.systemalertdialogdemo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showSystemAlertDialog();
    }

    private void showSystemAlertDialog() {
        AlertDialog.Builder  dialogBuilder = new AlertDialog.Builder(getApplicationContext());
        dialogBuilder.setTitle("Title");
        dialogBuilder.setMessage("Use Application Context");
        AlertDialog dialog = dialogBuilder.create();
        dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        dialog.show();
    }
}
