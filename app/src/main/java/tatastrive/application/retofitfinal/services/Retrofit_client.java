package tatastrive.application.retofitfinal.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_client {

   public static Retrofit getApiClient(String baseUrl)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( baseUrl )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();
        return retrofit;
    }


}
