package musicplayer.app.com.MainApp.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import musicplayer.app.com.MainActivity;
import musicplayer.app.com.MainApp.model.MainAppModel;
import musicplayer.app.com.MainApp.presenter.ActivityPresenter.MainAppPresenter;
import musicplayer.app.com.R;

public class MainAppActivity extends AppCompatActivity implements MainAppModel {
    private String TAG="MainAppActivity";
    private MainAppPresenter mainAppPresenter;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        mainAppPresenter = new MainAppPresenter(this);
        imageView=findViewById(R.id.menu_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mainAppPresenter.openmenu(MainAppActivity.this,MainActivity.class);
            }
        });

    }

    @Override
    public void onClickMenuButton() {
        Log.d(TAG, "onClickMenuButton: 点击了！！！");
    }
}
