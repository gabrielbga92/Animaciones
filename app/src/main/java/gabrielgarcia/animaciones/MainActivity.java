package gabrielgarcia.animaciones;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
    return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView = (ImageView) findViewById(R.id.banda);
        switch (item.getItemId()){
            case R.id.alpha:

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                textView.startAnimation(animation);
                return true;

            case R.id.rotate:
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageView.startAnimation(animation);
                return true;

            case R.id.translate:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                textView.startAnimation(animation);
                return true;

            case R.id.scale:
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                imageView.startAnimation(animation);
                return true;

            case R.id.property:
                ObjectAnimator flip = ObjectAnimator.ofFloat(imageView, "rotation",0f,180f);
                flip.setDuration(2000);
                flip.start();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
