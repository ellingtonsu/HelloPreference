package tw.edu.au.csie.hellopreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String USER_CONF = "user_config";
    EditText vETName, vETAge, vETEmail, vETPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vETName = (EditText)findViewById(R.id.et_name);
        vETAge = (EditText)findViewById(R.id.et_age);
        vETEmail = (EditText)findViewById(R.id.et_email);
        vETPassword = (EditText)findViewById(R.id.et_password);
    }

    @Override
    protected void onResume() {
        super.onResume();

//        SharedPreferences pref = getSharedPreferences(USER_CONF, MODE_PRIVATE);
//        String mName = pref.getString("name", "");
//        int mAge = pref.getInt("age", 0);
//        String mEmail = pref.getString("email", "user@example.com");
//
//        vETName.setText(mName);
//        vETAge.setText(String.valueOf(mAge));
//        vETEmail.setText(mEmail);
    }

    @Override
    protected void onPause() {
        super.onPause();

//        SharedPreferences pref = getSharedPreferences(USER_CONF, MODE_PRIVATE);
//        pref.edit().putString("name", vETName.getText().toString()).commit();
//        pref.edit().putInt("age", Integer.valueOf(vETAge.getText().toString())).commit();
//        pref.edit().putString("email", vETEmail.getText().toString()).commit();
    }
}
