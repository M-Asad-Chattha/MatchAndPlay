package com.asadchattha.matchandplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewSelectedItem;
    private ImageView imageViewBaseball;
    private ImageView imageViewBasketball;
    private ImageView imageViewCestaPunta;
    private ImageView imageViewCycling;

    private Button buttonAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSelectedItem = findViewById(R.id.image_view_selectedItem);
        imageViewBaseball = findViewById(R.id.image_view_baseball);
        imageViewBasketball = findViewById(R.id.image_view_basketball);
        imageViewCestaPunta = findViewById(R.id.image_view_cestaPunta);
        imageViewCycling = findViewById(R.id.image_view_cycling);

        buttonAccept = findViewById(R.id.button_accept);

    }

    public void onClickAcceptButton(View view) {
        Intent intent = new Intent(MainActivity.this, SignupGoogleActivity.class);
        startActivity(intent);
    }

    public void onClickSportType(View view) {
        int tag = Integer.parseInt((String) view.getTag());

        switch (tag) {
            case 1:
                imageViewBaseball.setImageResource(R.drawable.ic_baseball_white);
                imageViewBaseball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                imageViewSelectedItem.setImageResource(R.drawable.ic_baseball_white);
                imageViewSelectedItem.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                /*UnSelect Others*/
                imageViewBasketball.setImageResource(R.drawable.ic_basketball_grey);
                imageViewBasketball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCestaPunta.setImageResource(R.drawable.ic_cesta_grey);
                imageViewCestaPunta.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCycling.setImageResource(R.drawable.ic_cycling_grey);
                imageViewCycling.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));

                /*Change Button Background Color*/
                buttonAccept.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                break;

            case 2:
                imageViewBasketball.setImageResource(R.drawable.ic_basketball_white);
                imageViewBasketball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));
                imageViewSelectedItem.setImageResource(R.drawable.ic_basketball_white);
                imageViewSelectedItem.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                /*UnSelect Others*/
                imageViewBaseball.setImageResource(R.drawable.ic_baseball_grey);
                imageViewBaseball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCestaPunta.setImageResource(R.drawable.ic_cesta_grey);
                imageViewCestaPunta.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCycling.setImageResource(R.drawable.ic_cycling_grey);
                imageViewCycling.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));

                /*Change Button Background Color*/
                buttonAccept.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                break;
            case 3:
                imageViewCestaPunta.setImageResource(R.drawable.ic_cesta_white);
                imageViewCestaPunta.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));
                imageViewSelectedItem.setImageResource(R.drawable.ic_cesta_white);
                imageViewSelectedItem.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                /*UnSelect Others*/
                imageViewBaseball.setImageResource(R.drawable.ic_baseball_grey);
                imageViewBaseball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewBasketball.setImageResource(R.drawable.ic_basketball_grey);
                imageViewBasketball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCycling.setImageResource(R.drawable.ic_cycling_grey);
                imageViewCycling.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));

                /*Change Button Background Color*/
                buttonAccept.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                break;
            case 4:
                imageViewCycling.setImageResource(R.drawable.ic_cycling_white);
                imageViewCycling.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                imageViewSelectedItem.setImageResource(R.drawable.ic_cycling_white);
                imageViewSelectedItem.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                /*UnSelect Others*/
                imageViewBaseball.setImageResource(R.drawable.ic_baseball_grey);
                imageViewBaseball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewBasketball.setImageResource(R.drawable.ic_basketball_grey);
                imageViewBasketball.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));
                imageViewCestaPunta.setImageResource(R.drawable.ic_cesta_grey);
                imageViewCestaPunta.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorLightGrey));

                /*Change Button Background Color*/
                buttonAccept.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),
                        R.color.colorGreen));

                break;
        }

    }
}
