package co.edu.unab.Hernandez.Yeison.seriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private ImageView imageUnab;
    private Button btnLogin;
    private EditText nameUser, passUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageUnab= findViewById(R.id.imageUnab);
        btnLogin=findViewById(R.id.btn_login);
        nameUser=findViewById(R.id.editName);
        passUser=findViewById(R.id.editPass);
        setTitle(R.string.text_login_segundo_corte);
        Picasso.get().load("https://www.periodico15.com/wp-content/uploads/2017/10/Unab-Logo_1_0.png").into(imageUnab);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCredenciales(nameUser.getText().toString(),passUser.getText().toString());
            }
        });

    }
    public void validarCredenciales(String name, String pass){
        if(name.equalsIgnoreCase(getString(R.string.nameUser))&& pass.equalsIgnoreCase(getString(R.string.passUser))){
            Toast.makeText(this, "Bienvenido "+name, Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(MainActivity.this,ListadoSeriesActivity.class);
            intent.putExtra("NameUser",name);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }

    }
}
