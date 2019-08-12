package guruji.kashmiri.com.imagesendtosecondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {//implements  View.OnClickListener {
ImageView Image1,imageView;

    GridView simpleGrid;
    int logos[] = {R.drawable.liked, R.drawable.ic_launcher_background, R.drawable.unliked, R.drawable.ic_launcher_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView=findViewById(R.id.grid);

        GridAdapter customAdapter = new GridAdapter(getApplicationContext(), logos);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(MainActivity.this, SecondClass.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                startActivity(intent); // start Intent

            }
        });



       /* Image1=findViewById(R.id.uniform);
        imageView=findViewById(R.id.image);

        Image1.setOnClickListener(this);
        imageView.setOnClickListener(this);
*/
    }

   /* @Override
   *//* public void onClick(View v) {

        if (v.getId()==R.id.uniform)
        {
            Intent intent=new Intent(MainActivity.this, SecondClass.class);
            Bundle bundle=new Bundle();
            bundle.putInt("image",R.drawable.liked);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        else {
            Intent intent=new Intent(MainActivity.this, SecondClass.class);
            Bundle bundle=new Bundle();
            bundle.putInt("image",R.drawable.liked);
            intent.putExtras(bundle);
            startActivity(intent);
        }*/

    }


  /*  public void go(View view) {
        Intent intent=new Intent(MainActivity.this, SecondClass.class);
        Bundle bundle=new Bundle();
        bundle.putInt("image",R.drawable.liked);
        intent.putExtras(bundle);
        startActivity(intent);
    }*/

