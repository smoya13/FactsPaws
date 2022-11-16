package evaluacion.smoya.factspaws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class createaccountactivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtApellido;
    EditText txtUsuario;
    EditText txtEmail;
    EditText txtPass;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccountactivity);
    }

    public void btnSiguiente(View view) {
        txtNombre  = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("usuario", txtUsuario.getText().toString());
        intent.putExtra("contraseña", txtPass.getText().toString());
        startActivity(intent);
    }
}