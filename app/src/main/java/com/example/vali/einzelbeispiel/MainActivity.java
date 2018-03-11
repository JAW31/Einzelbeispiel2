package com.example.vali.einzelbeispiel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button meinButton;
    EditText txtEdit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity geladen




        meinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ispalindrom;
                Button meinButton = findViewById(R.id.ckeck_button);
                txtEdit = findViewById(R.id.string_eingabe);

                ispalindrom = (txtEdit).getText().toString().toLowerCase();

                //String palindrom = txtEdit.getText().toString();

                if (ispalindrom.equals(" ")) {
                    Toast.makeText(MainActivity.this, "kein Palindrom gefunden", Toast.LENGTH_SHORT).show();
                } else if (ispalindrom.length() < 5) {
                    Toast.makeText(MainActivity.this, "es müssen mindesten 5 Zeichen sein", Toast.LENGTH_SHORT).show();

                }
                       if (isPalindrome(ispalindrom) == true){
                           Toast.makeText(MainActivity.this, "Ist Palindrom", Toast.LENGTH_SHORT).show();
                       }
                        else{
                       Toast.makeText(MainActivity.this, "Ist kein Palindrom", Toast.LENGTH_SHORT).show();
                       }
                   }




               // if (isPalindrome(palindrom)){
                 //   Toast.makeText(MainActivity.this, "Ist Palindrom", Toast.LENGTH_SHORT).show();}
                   //else{
                    //Toast.makeText(MainActivity.this, "Ist kein Palindrom", Toast.LENGTH_SHORT).show();
                //}
           // }
        });
        }


    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

   /* @Override
    public void onClick(View v) {

        txtView.setText(txtEdit.getText().toString());
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }*/
}