package th.ac.kmutnb.toktak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void register(View v){
        Intent regis = new Intent(this,Register.class);
        startActivity(regis);
    }

    public void login(View v){
        Intent login = new Intent(this,FullScreenVideo.class);
        startActivity(login);
    }
}