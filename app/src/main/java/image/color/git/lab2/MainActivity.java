package image.color.git.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int numberOfClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button " + numberOfClicks);

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfClicks++;
                Log.d("numberOfClicks", "numberOfClick: " + numberOfClicks);
                gameButton.setText("Hello, I'm the button " + numberOfClicks);
            }
        });
        setContentView(gameButton);
    }

}
