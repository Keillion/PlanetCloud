package github.keillion.planetcloud;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button navbtnScene;
    private Button navbtnDevice;

    private SceneMainFragment scene;
    private DeviceMainFragment device;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            Toast.makeText(getApplicationContext(),"Instance is not null!",Toast.LENGTH_SHORT).show();
            return;
        }

        navbtnScene = (Button) findViewById(R.id.navbtn_main_scene);
        navbtnScene.setOnClickListener(this);
        navbtnDevice = (Button) findViewById(R.id.navbtn_main_device);
        navbtnDevice.setOnClickListener(this);

        setDefaultFragment();
    }

    private void setDefaultFragment(){
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        scene=new SceneMainFragment();
        ft.add(R.id.content_main,scene);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.navbtn_main_scene:
                Toast.makeText(getApplicationContext(),"scene is clicked!",Toast.LENGTH_SHORT).show();
                if(null==scene){
                    scene=new SceneMainFragment();
                }
                ft.replace(R.id.content_main,scene);
                break;
            case R.id.navbtn_main_device:
                Toast.makeText(getApplicationContext(),"device is clicked!",Toast.LENGTH_SHORT).show();
                if(null==device){
                    Toast.makeText(getApplicationContext(),"device is null,create new!",Toast.LENGTH_LONG).show();
                    device=new DeviceMainFragment();
                }
                ft.replace(R.id.content_main,device);
                break;
        }
        ft.commit();
    }
}
