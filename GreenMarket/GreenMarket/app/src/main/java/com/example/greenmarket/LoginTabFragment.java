package com.example.greenmarket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    EditText email,password;
    TextView forgetPass;
    Button button;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

//        email  = root.findViewById(R.id.email_lg);
//        password  = root.findViewById(R.id.pass_lg);
//        forgetPass  = root.findViewById(R.id.forget_pass);
//        button  = root.findViewById(R.id.button_lg);
//
//        email.setTranslationX(800);
//        password.setTranslationX(800);
//        forgetPass.setTranslationX(800);
//        button.setTranslationX(800);
//
//
//        email.setAlpha(v);
//        password.setAlpha(v);
//        forgetPass.setAlpha(v);
//        button.setAlpha(v);
//
//
//        email.animate().translationX(0).alpha(1).setStartDelay(300).start();
//        password.animate().translationX(0).alpha(1).setStartDelay(500).start();
//        forgetPass.animate().translationX(0).alpha(1).setStartDelay(700).start();
//        button.animate().translationX(0).alpha(1).setStartDelay(700).start();
        return  root;
    }
}
