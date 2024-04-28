package com.dragon.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    定义变量（这是我定义的前面几个控件的名称
    private EditText et_username;
    private EditText et_password;
    private Button bu_login;
    private Button bu_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件，
        //如果想获得布局文件上的控件，必须要在加载布局文件后，才能够获得，否则是null
        myInit();//控件的初始化
        //添加事件（事件编程，当一个控件发送变化时，执行的代码）
        addEvent();
    }

    // 自己定义的事件
    private void addEvent() {
        bu_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示一个弹出框
                //MainActivity.this, 在哪一个activity上弹出
                // "匿名内部类的写法", 弹出的内容
                // Toast.LENGTH_SHORT (短)  显示的时间 Toast.LENGTH_LONG（长）
                String username = et_username.getText().toString();// 获得文本框中的内容
                Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();//显示
                String password = et_password.getText().toString();// 获得文本框中的内容
                Toast.makeText(MainActivity.this, password, Toast.LENGTH_LONG).show();//显示
            }
        });
        bu_login.setOnClickListener(new MyClick());

    }
    //内部类
    class MyClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        }
    }

    // 初始化控件
    private void myInit() {
        //findViewById() 通过Id获得控件
        bu_login = findViewById(R.id.button);
        bu_register = findViewById(R.id.button2);
        et_password = findViewById(R.id.editTextPhone2);
        et_username = findViewById(R.id.editTextPhone);

    }

}
