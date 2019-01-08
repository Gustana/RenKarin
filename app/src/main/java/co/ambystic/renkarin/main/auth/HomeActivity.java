package co.ambystic.renkarin.main.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.ambystic.renkarin.R;

public class HomeActivity extends Activity {

    private Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initLayout();
        buttonClicked();
    }

    private void buttonClicked() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog registerTypeDialog = new Dialog(HomeActivity.this);
                registerTypeDialog.setContentView(R.layout.dialog_register_type_user);

                Button btnProviderType = registerTypeDialog.findViewById(R.id.btnProviderType);
                Button btnCostumerType = registerTypeDialog.findViewById(R.id.btnCostumerType);

                btnProviderType.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this, SignUpAdminActivity.class));
                    }
                });
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SignInActivity.class));
            }
        });
    }

    private void initLayout() {
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
    }
}
