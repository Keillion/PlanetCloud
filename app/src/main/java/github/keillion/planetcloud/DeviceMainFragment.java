package github.keillion.planetcloud;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Keillion on 2016/5/2.
 */
public class DeviceMainFragment extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_device_main, container, false);

        Toast.makeText(getActivity(),"here is device!",Toast.LENGTH_LONG).show();

        view.findViewById(R.id.navbtn_device_main_favorite).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_frequent).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_room).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_class).setOnClickListener(this);
        view.findViewById(R.id.navbtn_device_main_add).setOnClickListener(this);

        setDefaultFragment();

        return view;
    }

    private void setDefaultFragment(){
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.content_device_main,new DeviceFavoriateFragment());
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.navbtn_device_main_favorite:
                ft.replace(R.id.content_main,null);
                break;
            case R.id.navbtn_device_main_frequent:
                ft.replace(R.id.content_main,null);
                ft.commit();
                break;
            case R.id.navbtn_device_main_room:
                ft.replace(R.id.content_main,null);
                break;
            case R.id.navbtn_device_main_class:
                ft.replace(R.id.content_main,null);
                break;
            case R.id.navbtn_device_main_add:
                ft.replace(R.id.content_main,null);
                break;
        }
        ft.commit();
    }
}
