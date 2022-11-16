package evaluacion.smoya.factspaws;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private RecyclerView Lista;
    private RecyclerAdapter adpater;
    private List<ItemList> items;
        String[] datos = {"Profile", "Posts", "Following", "Profile View", "Other"};


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    Spinner spin = (Spinner) findViewById(R.id.spinnerProfile);
    spin.setOnItemSelectedListener(this);

    ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, datos);
    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    spin.setAdapter(aa);
    }

    private void initViews(){

        Lista = findViewById(R.id.lista);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}