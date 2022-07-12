package br.com.telaserick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Login;
    private Button Cadastrar;
    private Button Explorar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.loginButton);
        Cadastrar = findViewById(R.id.cadastroButton);
        Explorar = findViewById(R.id.explorarButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                startActivity(intent);

                Cadastrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent2 = new Intent(getApplicationContext(), CadastroActivity.class);

                        startActivity(intent2);

                        Explorar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                Intent intent3 = new Intent(getApplicationContext(), CamisasActivity.class);

                                startActivity(intent3);
                            }
                        });

                    }
                });

            }
        });

    }
}