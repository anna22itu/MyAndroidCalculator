package edu.upc.dsa.myandroidcalculator;
// logica de la aplicación

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.INotificationSideChannel;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button btn_equal;
    public Button btn_ac;
    public Button btn_suma;
    public Button btn_resta;
    public Button btn_multiplicacion;
    public Button btn_division;
    public Button btn_punto;
    public Button btn_shift;
    public Button btn_deg;
    public Button btn_rad;
    public Button btn_sen;
    public Button btn_cos;
    public Button btn_tan;

    public TextView textView;
    public EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn_punto = findViewById(R.id.btn_point);
        btn_suma = findViewById(R.id.btn_suma);
        btn_resta = findViewById(R.id.btn_resta);
        btn_multiplicacion = findViewById(R.id.btn_multiplication);
        btn_division = findViewById(R.id.btn_division);
        btn_equal = findViewById(R.id.button_equal);
        btn_ac = findViewById(R.id.btn_ac);
        btn_sen = findViewById(R.id.btn_sen);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_shift = findViewById(R.id.btn_shift);
        btn_deg = findViewById(R.id.btn_deg);
        btn_rad = findViewById(R.id.btn_rad);
        textView = findViewById(R.id.textView1);
        editText = findViewById(R.id.plaintext1);


    }


    private char op1;
    private char op2;


    public void OnClick0(View view) {
        editText.getText().append("0");
    }

    public void OnClick1(View view) {
        editText.getText().append("1");
    }

    public void OnClick2(View view) {
        editText.getText().append("2");
    }

    public void OnClick3(View view) {
        editText.getText().append("3");
    }

    public void OnClick4(View view) {
        editText.getText().append("4");
    }

    public void OnClick5(View view) {
        editText.getText().append("5");
    }

    public void OnClick6(View view) {
        editText.getText().append("6");
    }

    public void OnClick7(View view) {
        editText.getText().append("7");
    }

    public void OnClick8(View view) {
        editText.getText().append("8");
    }

    public void OnClick9(View view) {
        editText.getText().append("9");
    }

    public void PointOnClick(View view) {
        editText.getText().append(".");
    }

    public void AcOnClick(View view) {
        editText.getText().clear();
    }

    public void ShiftOnClick(View view) {
    }

    public void RadOnClick(View view) {
    }

    public void DegOnClick(View view) {
    }

    public void SenOnClick(View view) {
        editText.getText().append("sen");
    }

    public void CosOnClick(View view) {
        editText.getText().append("cos");
    }

    public void TanOnClick(View view) {
        editText.getText().append("tan");
    }

    public void MultiOnClick(View view) {
        editText.getText().append("x");
        String mutltiplicacion = editText.getText().toString();
    }

    public void DivisionOnClick(View view) {
        editText.getText().append("%");
        String division = editText.getText().toString();
    }

    public void SumaOnClick(View view) {
        editText.getText().append("+");
        String suma = editText.getText().toString();
    }

    public void RestaOnClick(View view) {
        editText.getText().append("-");
        String resta = editText.getText().toString();
    }

    public void EqualOnClick(View view) {
        String igual = editText.getText().toString();
    }
        editText.
}