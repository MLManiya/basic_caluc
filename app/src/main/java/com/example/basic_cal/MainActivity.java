package com.example.basic_cal;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  //  Button button;
    EditText editText1,editText2;
    TextView Ans;

    int n1,n2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
     //   button=findViewById(R.id.button);
        Ans=findViewById(R.id.Ans);

      //  button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String str1 = charSequence.toString();
                String str2 = editText2.getText().toString();

                if(str2.isEmpty())
                {
                    n2=0;
                }
                else
                {
                    n2 = Integer.parseInt(editText2.getText().toString());
                }
                if(str1.isEmpty())
                {
                    n1=0;
                }
                else
                {
                    n1 = Integer.parseInt(editText1.getText().toString());
                }
                int sum = n1+n2;
                Ans.setText(""+sum);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

//                    try {
//
//            if(editText1.getText().toString()!="" && editText2.getText().toString()!="")
//             {
//
//             int n1 = Integer.parseInt(editText1.getText().toString());
//
//              int n2 = Integer.parseInt(editText2.getText().toString());
//
//              int sum = n1 + n2;
//              Ans.setText("" +sum);
//                 System.out.println(""+n1);
//                 if(editText1.getText().toString()=="" )
//                 {
//                     Ans.setText(""+n1);
//                    // Ans.setText(""+n2);
//                 }
//                 else if(n2>n1)
//                 {
//                     Ans.setText(""+n2);
//                 }
//            }
//
//
//                    }catch (Exception ex)
//                    {
//                    System.out.println(""+ex.getMessage());
//                    }

//
//                int n1 = Integer.parseInt(editText1.getText().toString());
//                int n2 = Integer.parseInt(editText2.getText().toString());
//
//                int sum = n1 + n2;
//                Ans.setText(""+sum);
       //     }
      //  });
    }
}