package edu.upc.dsa.myandroidcalculator;
// logica de la aplicación

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btn_equal;
    private Button btn_ac;
    private Button btn_del;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;
    private Button btn_punto;
    private Button btn_shift;
    private Button btn_deg;
    private Button btn_rad;
    private Button btn_sen;
    private Button btn_cos;
    private Button btn_tan;

    private TextView textView;
    private EditText editText;



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

}