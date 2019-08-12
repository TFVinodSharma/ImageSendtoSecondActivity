package guruji.kashmiri.com.imagesendtosecondactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_class);

        ImageView Ima=findViewById(R.id.image);
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
        Ima.setImageResource(pic);
    }
}
