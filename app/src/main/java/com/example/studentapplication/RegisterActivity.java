package com.example.studentapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b1,b2;
    String getName,getAddress,getPhoneNumber,getEmailId,getUsername,getPassword,getConfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.Address);
        ed3=(EditText)findViewById(R.id.PhoneNumber);
        ed4=(EditText) findViewById(R.id.Emailid);
        ed5=(EditText) findViewById(R.id.Username);
        ed6=(EditText) findViewById(R.id.Password);
        ed7=(EditText) findViewById(R.id.ConfirmPassword);
        b1=(AppCompatButton)findViewById(R.id.Register);
        b2=(AppCompatButton)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getName= ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getName , Toast.LENGTH_SHORT).show();
                getAddress= ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getAddress , Toast.LENGTH_SHORT).show();
                getPhoneNumber= ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getPhoneNumber , Toast.LENGTH_SHORT).show();
                getEmailId= ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmailId , Toast.LENGTH_SHORT).show();
                getUsername= ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getUsername , Toast.LENGTH_SHORT).show();
                getPassword= ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getPassword , Toast.LENGTH_SHORT).show();
                getConfirmPassword= ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getConfirmPassword , Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnclickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });


    }
}