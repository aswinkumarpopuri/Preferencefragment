package com.brighterbrain.preferencefragment;
//
//import android.preference.PreferenceFragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import static android.R.*;
//import static com.brighterbrain.preferencefragment.MainActivity.*;
//
//public class AppPreferences extends AppCompatActivity {
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_note_detail);
//
//        android.app.FragmentManager fragmentManager = getFragmentManager();
//
//        android.app.FragmentTransaction fragmentTransaction=  fragmentManager.beginTransaction().add(R.id.note_container).commit();
//
//
//    public static class settingsFragment extends PreferenceFragment {
//
//
//        @Override
//        public void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//
//            addPreferencesFromResource(R.xml.app_preferences);
//
//        }
//    }
//}
