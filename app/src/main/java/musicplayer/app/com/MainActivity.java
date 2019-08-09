package musicplayer.app.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import musicplayer.app.com.MainApp.model.MainAppModel;
import skin.support.SkinCompatManager;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.change_skin);
        button2=findViewById(R.id.change_skin_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinCompatManager.getInstance().loadSkin("night", null, SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN);//切换皮肤名为night的皮肤
            }


    });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinCompatManager.getInstance().restoreDefaultTheme();//恢复默认皮肤
            }
        });
    }


}
