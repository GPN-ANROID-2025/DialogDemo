package com.example.dialogdemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button btnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnDialog=findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // showDialog();
                //showDialogWithOptions();
                //showDialogWithSingleChoiceOptions();
                showCustomDialog();
            }
        });
    }


    public void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit ?");
        builder.setMessage("Are You sure you want to exit");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }

    public void showDialogWithOptions(){
        CharSequence[] cities=new CharSequence[]{"Nashik","Pune","Mumbai"};
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select City ");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setItems(cities, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Log.d("mytag",cities[i].toString());
            }
        });
        builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }

    public void showDialogWithSingleChoiceOptions(){
        String[] choices = {"Item One", "Item Two", "Item Three"};
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select Item ");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setSingleChoiceItems(choices, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Log.d("mytag",choices[i]);
            }
        });
        builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

       MyDialog md=new MyDiloag(MainActivyty,this);
       md.show();
       md.dissmiss()

               ,d.sette
    }

    public void showCustomDialog(){

        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.custom_dialog_2);
        dialog.setCancelable(true);
        Button  buttonSubmit=dialog.findViewById(R.id.btnSubmit);
        EditText editTextName=dialog.findViewById(R.id.etName);
        ImageView ivClose=dialog.findViewById(R.id.ivClose);
        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("mytag",editTextName.getText().toString());
                dialog.dismiss();
            }
        });
        dialog.getWindow().setAttributes(new WindowManager.LayoutParams(WindowManager.LayoutParams.TYPE_SYSTEM_DIALOG, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();


    }
}