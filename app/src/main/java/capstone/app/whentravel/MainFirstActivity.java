package capstone.app.whentravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_first);

        Button btn_create_travel = findViewById(R.id.btn_create_travel);
        btn_create_travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainFirstActivity.this,CreateTravelActivity.class);
                startActivity(intent);
            }
        });
    }
}