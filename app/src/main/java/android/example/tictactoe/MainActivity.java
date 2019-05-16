package android.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String player1, player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void letsPlay(View view) {
        EditText editText = findViewById(R.id.player1Name);
        EditText editText1 = findViewById(R.id.player2Name);
        if(TextUtils.isEmpty(editText.getText())) {
            editText.setError("Name is Required");
        } else if (TextUtils.isEmpty(editText1.getText())) {
            editText1.setError("Name is Required");
        } else {
            player1 = String.valueOf(editText.getText());
            player2 = String.valueOf(editText1.getText());
            Intent intent = new Intent(this, Home.class);
            intent.putExtra("Player1", player1);
            intent.putExtra("Player2", player2);
            startActivity(intent);
        }
    }
}
