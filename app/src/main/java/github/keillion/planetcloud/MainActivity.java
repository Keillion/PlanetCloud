package github.keillion.planetcloud;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.navbtn_main_scene).setOnClickListener(this);
        findViewById(R.id.navbtn_main_device).setOnClickListener(this);
        findViewById(R.id.navbtn_main_plan).setOnClickListener(this);
        findViewById(R.id.navbtn_main_setting).setOnClickListener(this);

        setDefaultFragment();
    }

    private void setDefaultFragment(){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.content_main,new SceneMainFragment());
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        switch (v.getId()){
            case R.id.navbtn_main_scene:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_main_device:
                ft.replace(R.id.content_main,new DeviceMainFragment());
                break;
            case R.id.navbtn_main_plan:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_main_setting:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
        }
    }
}
