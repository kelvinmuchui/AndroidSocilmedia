package com.kelvin.socialMedia.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key= AAAAKrb9sHs:APA91bGl2G3DVm1X2d6X9dZUC8qKs4Y4cVvMqGl_5jvRXURFLCS9gitSw6CLJsuzUmUo-de-jJv0lCV2jhnup_pJRKCe1pdG1HxfIINo9QbcsUq3zxaSoES9daNqmR_W9pIGY9zRcyMb"

    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
