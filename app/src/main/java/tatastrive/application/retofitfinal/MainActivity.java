package tatastrive.application.retofitfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import tatastrive.application.retofitfinal.constant.Constant;
import tatastrive.application.retofitfinal.extras.AppPreference;
import tatastrive.application.retofitfinal.fragment.LoginFragment;
import tatastrive.application.retofitfinal.fragment.ProfileFragment;
import tatastrive.application.retofitfinal.fragment.RegistrationFragment;
import tatastrive.application.retofitfinal.services.MyInterface;
import tatastrive.application.retofitfinal.services.Retrofit_client;
import tatastrive.application.retofitfinal.services.Service_Api;

public class MainActivity extends AppCompatActivity implements MyInterface {
FrameLayout container_layout;
    public static String c_date;
    public static AppPreference appPreference;
public static Service_Api service_api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        container_layout=findViewById( R.id.fragment_container );

        //call to baseurl &connect service
        service_api= Retrofit_client.getApiClient(Constant.baseUrl.BASE_URL).create(Service_Api.class);
    }

    @Override
    public void register() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new RegistrationFragment()).addToBackStack(null).commit();
    }

    @Override
    public void login(String name, String email, String ceated_at) {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new LoginFragment()).commit();
    }

    @Override
    public void logout() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
    }
}
