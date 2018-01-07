package com.example.ikhan.procrastinationapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ikhan on 1/6/2018.
 */

public class RegisterRequest extends StringRequest {
    private static final String Register_Request_URL="https://comexampleikhanprocrastinationapp.000webhostapp.com/Register.php";
    private Map<String, String>params;
    public RegisterRequest(String name, String username, String password, Response.Listener<String> listener){
        super(Method.POST, Register_Request_URL, listener, null);
        params=new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        params.put("name", name);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
