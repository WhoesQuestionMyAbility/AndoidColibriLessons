package com.rioter.saikou.mynotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager nm;
    private final int NOTIFICATION_ID = 127;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void showNotification(View view){

        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        Intent intent = new Intent(getApplicationContext(), FinishActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setLargeIcon(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.mipmap.ic_launcher_round))
                .setTicker("Новое уведомление")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle("Notifa")
                .setContentText("Нажмите, чтобы узнать секрет")
                .setProgress(100, 40, true);

        Notification notification = builder.build();
        notification.defaults = Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE | Notification.DEFAULT_LIGHTS;
//        notification.sound = Uri.parse("android.resource://com.rioter.saikou.mynotification" + R.raw.my_sound); + del Notification.DEFAULT_SOUND |
//        long [] vibrate = new long[] {1500, 1000, 1500, 1000};
//        notification.vibrate = vibrate;

//        notification.flags =  notification.flags | Notification.FLAG_ONGOING_EVENT;
        notification.flags =  notification.flags | Notification.FLAG_INSISTENT;

        nm.notify(NOTIFICATION_ID, notification);
    }

    public void cancelNotification(View view){
        nm.cancel(NOTIFICATION_ID);
    }
}
