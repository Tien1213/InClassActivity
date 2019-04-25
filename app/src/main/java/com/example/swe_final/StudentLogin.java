package com.example.swe_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import org.json.JSONObject;

public class StudentLogin extends AppCompatActivity {

    EditText studentUsername;
    EditText studentPassword;
    TextView registerLink;
    TextView studentLoginMessage;
    static TextView loginMessage;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentUsername = (EditText) findViewById(R.id.username);
        studentPassword = (EditText) findViewById(R.id.password);
        registerLink = (TextView) findViewById(R.id.here);
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentLogin.this, student_registration.class);
                startActivity(intent);
            }
        });
        studentLoginMessage = (TextView) findViewById(R.id.error);
        /*       student_registration();*/

    }

    public void onLogin(View v) {
        String studentID = studentLoginMessage.getText().toString();
        String password = studentLoginMessage.getText().toString();
        String type = "login";
        if (studentID.isEmpty() || password.isEmpty()) {
            studentLoginMessage.setText("Check Missing Input Value!!!");
        } else {
            BackgroundWorker Background_Worker = new BackgroundWorker(this);
            Background_Worker.execute(type, studentID, password);
        }


    }
}
/*

@Override
    protected JSONObject doInBackground(String... params){
        String teacher_login_url = "http://ww.cc.puv.fi/~e1100617/AssignmentTrackingApp/teacherLogin.php";
        username = params[0];
        password = params[1];
}
    studentInfo = json.getJSONArray("teacherInfo");
    if(studentInfo.isNull(0)){
        teacherLoginMessage.setText("Logging Error: Incorrect Username or Password");
    }
    JSONObject j = studentInfo.getJSONObject(0);
    student.setFirstName(j.optString("firstName"));
    student.setLastName(j.optString("lastName"));
    student.setPassword(j.optString("password"));
    student.setUserName(j.optString("userName"));
    DB_student_Id = student.getUserName();
    B_password = student.getPassword();
    if (DB_teacher_Id.equalsIgnoreCase(username)
            && DB_password.equalsIgnoreCase(password))
    {
        Intent intent = new
                Intent("com.example.feranmi.assignmenttrackingapp.TeacherPage");
        intent.putExtra("teacher", teacher);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);}
}
*/
