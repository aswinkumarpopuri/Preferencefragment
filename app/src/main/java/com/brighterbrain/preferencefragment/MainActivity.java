package com.brighterbrain.preferencefragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;

import com.brighterbrain.preferencefragment.R;
public class MainActivity extends AppCompatActivity {
@Override
public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

    SettingsFragment settingsFragment = new SettingsFragment();

        android.app.FragmentManager fragmentManager=getFragmentManager();

        android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction().add(R.id.note_container, settingsFragment);
                fragmentTransaction.commit();
        }


public static class SettingsFragment extends PreferenceFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.app_preferences);

    }
}
}