package tatastrive.application.retofitfinal.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tatastrive.application.retofitfinal.model.User;

public interface Service_Api {
    @GET("register.php")
        //doregistration method
    Call<User> doRegistration(@Query("name") String name, @Query("email") String email, @Query("password") String password, @Query("phone") String phone);

    @GET("login.php")
        //login method
    Call<User> doLogin(@Query("email") String email,@Query("password") String password);
}
