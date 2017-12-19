package com.example.user.inboxstylenotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//mainActivity class extending AppCompatActivity
public class MainActivity extends AppCompatActivity {

    //making object of button
    Button startBtn;

    //onCreate Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         //setting ContentView
        startBtn=findViewById(R.id.startBtn);           //setting reference for start Button

        //setting onClick Listener for startBtn
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //making object of  Notification builder
                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Event Details");             //setting title and Icon

                //making object of Inbox Style notification
                NotificationCompat.InboxStyle inboxStyle=new NotificationCompat.InboxStyle();

               //setting BigContentTitle
                inboxStyle.setBigContentTitle("Events Details!");

               //adding lines to display as messages
                inboxStyle.addLine("Hii!!");
                inboxStyle.addLine("How are you?");
                inboxStyle.addLine("Hii..");
                inboxStyle.addLine("I'm fine");
                inboxStyle.addLine("How are you?All is well?");
                inboxStyle.addLine("yes Everything is right");

                //building inboxStyle
                builder.setStyle(inboxStyle);
                //making object of notification Maneger getting Notification Services
                NotificationManager notificationManager= (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
              //calling notify
                notificationManager.notify(101,builder.build());


            }
        });
    }
}
