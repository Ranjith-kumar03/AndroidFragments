package tk.onlinesilkstore.helloranjith;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

                Intent intent= getIntent();

                String Message=intent.getStringExtra( "EXTRA_MESSAGE");
        TextView textview =findViewById(R.id.Display_Message);
        textview.setText(Message);
    }

    public void OPenFInalActivity(View view) {

        startActivity(new Intent(this,FinalActivity.class));
    }
}
