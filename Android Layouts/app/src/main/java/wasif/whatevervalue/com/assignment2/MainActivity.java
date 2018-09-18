package wasif.whatevervalue.com.assignment2;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnConstraint;
    Button btnRelative;
    TextView txtView;
    static Typeface wonderbarDemo;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnConstraint = findViewById(R.id.btn1);
        btnRelative = findViewById(R.id.btn2);
        txtView = findViewById(R.id.textView);
        linearLayout=findViewById(R.id.animate);
        wonderbarDemo = Typeface.createFromAsset(getAssets(), "fonts/Wonderbar Demo.otf");
        btnConstraint.setTypeface(wonderbarDemo);
        btnRelative.setTypeface(wonderbarDemo);

        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Created by: Wasif Ibrahim", Toast.LENGTH_SHORT).show();
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, constraint_layout.class);
                animateLayout();
                startActivity(intent);

            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, relative_layout.class);
                animateLayout();
                startActivity(intent);
            }
        });
    }

    private void animateLayout(){

        int xBottomRight=linearLayout.getLeft()+linearLayout.getRight();
        int yBottomRight= linearLayout.getTop() + linearLayout.getBottom();

        int radius= Math.max(linearLayout.getWidth(),linearLayout.getHeight());

        Animator animator;


        animator= ViewAnimationUtils.createCircularReveal(linearLayout,xBottomRight,yBottomRight,radius,0);

        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                int xTopLeft=0;
                int yTopLeft=0;
                int radius= Math.max(linearLayout.getWidth(),linearLayout.getHeight());
                Animator animator;
                animator= ViewAnimationUtils.createCircularReveal(linearLayout,xTopLeft,yTopLeft,0,radius);
                animator.setDuration(1000);
                animator.start();


            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        animator.setDuration(1500);
        animator.start();
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
}
