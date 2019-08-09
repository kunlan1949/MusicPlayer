package musicplayer.app.com.MainApp.presenter.ActivityPresenter;

import android.content.Context;
import android.content.Intent;

import musicplayer.app.com.MainActivity;
import musicplayer.app.com.MainApp.View.Activity.MainAppActivity;
import musicplayer.app.com.MainApp.model.MainAppModel;

public class MainAppPresenter {
    private String TAG="MainAppPresenter";
    private MainAppModel model;

    public MainAppPresenter(MainAppModel model) {
        this.model = model;
    }

    public void openmenu(Context context,Class c){
        Intent intent=new Intent(context,c);
        context.startActivity(intent);
        model.onClickMenuButton();
    }

}
