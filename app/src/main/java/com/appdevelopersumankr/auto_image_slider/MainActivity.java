package com.appdevelopersumankr.auto_image_slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        int imagearray[]={R.drawable.hello,R.drawable.hellotwo,R.drawable.background4,R.drawable.background5};
        viewFlipper=findViewById ( R.id.flipperid);

        for (int i=0;i<imagearray.length;i++)
            showimage ( imagearray[i] );
    }
    public void showimage(int img){
        ImageView imageView=new ImageView ( this );
        imageView.setBackgroundResource ( img);

        viewFlipper.addView ( imageView );
        viewFlipper.setFlipInterval ( 3000 );
        viewFlipper.setAutoStart ( true );
        viewFlipper.setInAnimation ( this,android.R.anim.slide_in_left );
        viewFlipper.setOutAnimation ( this, android.R.anim.slide_out_right );
    }
}