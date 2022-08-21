package com.example.loginactivitybyconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity_By_Constraint_Layout extends Activity implements
        View.OnClickListener {

    private TextView txtView;
    private EditText edtUsername,edtPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializeViews();
        initListner();
    }
    private void initializeViews(){
        txtView = findViewById(R.id.textView);
        button = findViewById(R.id.sign_in_button);
        edtUsername = findViewById(R.id.editText);
        edtPassword = findViewById(R.id.editText2);
    }
    private void initListner(){
        button.setOnClickListener(this);
        txtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==txtView){
            txtView.setText("");
        }else {
            if (edtUsername.getText().toString().equals("Vaishnavi") && edtPassword.getText().toString().equals("Vaishnavi@123")){
                txtView.setText("Welcome "+edtUsername.getText());
            }else {
                txtView.setText("Invalid User Name & Password");
            }
        }
    }
}