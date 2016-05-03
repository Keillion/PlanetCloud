package github.keillion.planetcloud;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Keillion on 2016/5/2.
 */
public class DeviceMainFragment extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_device_main, container, false);

        view.findViewById(R.id.navbtn_device_main_favorite).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_frequent).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_room).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_class).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_add).setOnClickListener(this);

        setDefaultFragment();
        return view;
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
            case R.id.navbtn_device_main_favorite:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_device_main_frequent:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_device_main_room:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_device_main_class:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
            case R.id.navbtn_device_main_add:
                ft.replace(R.id.content_main,new SceneMainFragment());
                break;
        }

    }
}
