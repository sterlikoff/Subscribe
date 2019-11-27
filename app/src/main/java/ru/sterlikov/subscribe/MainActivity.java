package ru.sterlikov.subscribe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText nameEdit = findViewById(R.id.nameEditText);
                EditText emailEdit = findViewById(R.id.emailEditText);
                TextView resultView = findViewById(R.id.resultView);

                String name = nameEdit.getText().toString();
                String email = emailEdit.getText().toString();

                String result = "Подписка на рассылку успешно оформлена для пользователя " + name + "на email: " + email;

                resultView.setText(result);

            }

        });

    }
}
