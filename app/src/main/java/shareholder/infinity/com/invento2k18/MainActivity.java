package shareholder.infinity.com.invento2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageButton contactsButton;
    public ImageButton registerButton;
    public ImageButton mapButton;
    public ImageButton eventButton;
    private ImageButton imageButtonSch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //SEND INTENT TO CONTACTS ACTIVITY
        contactsButton= (ImageButton) findViewById(R.id.contactsButton);
        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Contacts.class);
                startActivity(i);
            }
        });



        //SEND INTENT TO REGISTER ACTIVITY
        registerButton = (ImageButton) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent i = new Intent(MainActivity.this,googledoc.class);
                    startActivity(i);
                }


            }
        });


        //SEND INTENT TO MAP ACTIVITY
        mapButton= (ImageButton) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, map.class);
                startActivity(i);
            }
        });

        //SEND INTENT TO EVENTS ACTIVITY
        eventButton = (ImageButton) findViewById(R.id.eventsButton);
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,ManagingEventsActivity.class);
                startActivity(i);
            }
        });

        //SEND INTENT TO Schedule Fragment
        imageButtonSch = (ImageButton) findViewById(R.id.scheduleButton) ;

        imageButtonSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ScheduleActivity.class);
                startActivity(intent);

            }
        });
    }
}
