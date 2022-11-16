package evaluacion.smoya.factspaws;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class accountsetingsactivity extends AppCompatActivity {

    NotificationManagerCompat notificationManagerCompat;
    Notification notificacion;
    CheckBox notificacionespush;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsetingsactivity);
        notificacionespush = findViewById(R.id.checkBox3);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("miCh", "Mi Channel", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"miCh")
                .setSmallIcon(android.R.drawable.stat_notify_sync)
                .setContentTitle("Gracias por activar a las notificaciones")
                .setContentText("Ahora estarás al día con las novedades");

        notificacion = builder.build();

        notificationManagerCompat = NotificationManagerCompat.from(this);

        notificacionespush.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(notificacionespush.isChecked()){
                    notificationManagerCompat.notify(1, notificacion);
                }else{

                }

            }
        }
        );
    }


}