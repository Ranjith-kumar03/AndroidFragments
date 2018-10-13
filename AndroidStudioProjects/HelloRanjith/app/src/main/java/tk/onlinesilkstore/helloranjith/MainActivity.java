package tk.onlinesilkstore.helloranjith;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendMessage(View view)
    {
        EditText edittext=findViewById(R.id.user_message);
        String Message=edittext.getText().toString();
        Intent intent = new Intent(this,MessageActivity.class);
        intent.putExtra("EXTRA_MESSAGE",Message);
        startActivity(intent);
    }
}
