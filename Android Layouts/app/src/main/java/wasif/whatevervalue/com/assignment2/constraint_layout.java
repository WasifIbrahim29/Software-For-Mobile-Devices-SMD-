package wasif.whatevervalue.com.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class constraint_layout extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,RadioGroup.OnCheckedChangeListener {

    Button btnMale;
    Button btnFemale;
    CheckBox acceptTerms;
    Button btnRegister;
    TextView txtEmail;
    TextView txtPassword;
    RadioGroup radioGroup;
    Button selectedRadioButton;
    int checked=0;
    int male=0;
    int female=0;
    private Animation uncheckedTerms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        txtEmail=findViewById(R.id.editText);
        txtPassword=findViewById(R.id.editText2);
        btnMale=findViewById(R.id.radioButton1);
        btnFemale=findViewById(R.id.radioButton2);

        uncheckedTerms= AnimationUtils.loadAnimation(constraint_layout.this,R.anim.unchecked_terms);
        uncheckedTerms.setRepeatCount(1);

        acceptTerms = findViewById(R.id.checkBox);
        btnRegister=findViewById(R.id.button);
        radioGroup=findViewById(R.id.radioGroup);
        acceptTerms.setOnCheckedChangeListener(constraint_layout.this);
        radioGroup.setOnCheckedChangeListener(constraint_layout.this);




        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checked==0){
                    btnRegister.startAnimation(uncheckedTerms);
                    Toast.makeText(constraint_layout.this,"Accept terms and conditions first.",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    int allFilled = 0;
                    if ((txtEmail.getText().toString()).matches("")) {
                        allFilled++;
                        Toast.makeText(constraint_layout.this, "Please enter Email",
                                Toast.LENGTH_SHORT).show();
                    }
                    if ((txtPassword.getText().toString()).matches("")) {
                        allFilled++;
                        Toast.makeText(constraint_layout.this, "Please enter Password.",
                                Toast.LENGTH_SHORT).show();
                    }
                    if (male == 0 && female == 0) {
                        allFilled++;
                        Toast.makeText(constraint_layout.this, "Please choose Gender.",
                                Toast.LENGTH_SHORT).show();
                    }
                    if (allFilled == 0) {
                        String radio = "";
                        if (male == 1) {
                            radio = "Male.";
                        } else if (female == 1) {
                            radio = "Female";
                        }
                        Toast.makeText(constraint_layout.this,
                                "Email: " + txtEmail.getText() + "\n" +
                                        "Password: " + txtPassword.getText() + "\n" +
                                        "Gender is: " + radio, Toast.LENGTH_LONG).show();

                        txtEmail.setText("");
                        radioGroup.clearCheck();
                        txtPassword.setText("");
                    } else {

                    }
                }
            }
        });


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton1:
                male=1;
                female=0;
                break;
            case R.id.radioButton2:
                female=1;
                male=0;
                break;
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.checkBox:
                if(!isChecked){
                    checked=0;

                }
                else{
                    checked=1;
                }
        }
    }
}
