package evaluacion.smoya.factspaws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boton_sig;
    private String txtPass, txtUsuario;
    private EditText tvUsuario, tvPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.SplashTheme);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_sig = findViewById(R.id.btnLogin);

        try {
            Bundle datos = MainActivity.this.getIntent().getExtras();
            txtUsuario = datos.getString("usuario");
            txtPass = datos.getString("contraseña");
            Toast toast = Toast.makeText(this,"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
            toast.show();
        }
        catch(Exception e) {

        }
    }

    public void buttonLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        Bundle datos = MainActivity.this.getIntent().getExtras();
        txtUsuario = datos.getString("usuario");
        txtPass = datos.getString("contraseña");
        tvUsuario = findViewById(R.id.editTextTextPersonName3);
        tvPass = findViewById(R.id.editTextTextPassword2);
        if(tvUsuario.getText().toString().equals(txtUsuario) && tvPass.getText().toString().equals(txtPass)){
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(this,"wey te equivocaste"+"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
            toast.show();
        }

    }

    public void btnCreateAccount(View view) {
        Intent intent = new Intent (this, createaccountactivity.class);
        startActivity(intent);
    }




}