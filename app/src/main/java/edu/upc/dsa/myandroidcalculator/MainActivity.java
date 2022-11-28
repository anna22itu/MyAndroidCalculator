package edu.upc.dsa.myandroidcalculator;
// logica de la aplicación

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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
        btn_deg = findViewById(R.id.btn_deg);
        btn_rad = findViewById(R.id.btn_rad);
        textView = findViewById(R.id.textViewTitle);
        editText = findViewById(R.id.plaintext1);
    }


    public double op1;
    public double op2;
    public String operacion = "";
    public double resultado;
    double dig;

    public Boolean rad = false;  //por defecto esta grados
    public Boolean deg = true;

    private void operantePrimero(String digito){
         this.op1 = Double.parseDouble(digito);
    }

    private void operacion(String operacion){
        this.operacion = operacion;

    }
    private void operanteSegundo(String digito){
        this.op2 = Double.parseDouble(digito);
    }

    private double resultado(){
        switch (operacion) {
            case "+":
                resultado = op1 + op2;
                break;
            case "-":
                resultado = op1 - op2;
                break;
            case "x":
                resultado = op1 * op2;
                break;
            case "%":
                resultado = op1 / op2;
                break;
        }
        return resultado;
}


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
        this.op1 = 0.0;
        this.op2 = 0.0;
        this.operacion = "";
    }

    public void RadOnClick(View view) {
        rad = true;
        deg = false;
    }

    public void DegOnClick(View view) {
        deg = true;
        rad = false;
    }

    public void SenOnClick(View view) {
        if (this.rad){
            this.dig = Double.parseDouble(editText.getText().toString());
        }
        else{
            this.dig = Double.parseDouble(editText.getText().toString())*Math.PI/180;
        }

        if (this.operacion.equals("")){
            double res = Math.sin(this.dig);
            editText.getText().clear();
            editText.getText().append(String.valueOf(res));
        }
        else {
            operanteSegundo(String.valueOf(Math.sin(this.dig)));
            editText.getText().clear();
            Double mostrarResult = resultado();
            editText.getText().append(mostrarResult.toString());
        }
    }

    public void CosOnClick(View view) {
        double dig;
        if (this.rad){
            dig = Double.parseDouble(editText.getText().toString())*Math.PI/180;
        }
        else{
            dig = Double.parseDouble(editText.getText().toString());
        }

        if (this.operacion.equals("")){
            double res = Math.cos(dig);
            editText.getText().clear();
            editText.getText().append(String.valueOf(res));
        }
        else {
            operanteSegundo(String.valueOf(Math.cos(dig)));
            editText.getText().clear();
            Double mostrarResult = resultado();
            editText.getText().append(mostrarResult.toString());
        }
    }

    public void TanOnClick(View view) {
        double dig;
        if (this.rad){
            dig = Double.parseDouble(editText.getText().toString())*Math.PI/180;
        }
        else{
            dig = Double.parseDouble(editText.getText().toString());
        }

        if (this.operacion.equals("")){
            double res = Math.tan(dig);
            editText.getText().clear();
            editText.getText().append(String.valueOf(res));
        }
        else {
            operanteSegundo(String.valueOf(Math.tan(dig)));
            editText.getText().clear();
            Double mostrarResult = resultado();
            editText.getText().append(mostrarResult.toString());
        }
    }

    public void MultiOnClick(View view) {
        operantePrimero(editText.getText().toString());
        operacion("x");
        editText.getText().clear();
    }

    public void DivisionOnClick(View view) {
        operantePrimero(editText.getText().toString());
        operacion("%");
        editText.getText().clear();
    }

    public void SumaOnClick(View view) {
        operantePrimero(editText.getText().toString());
        operacion("+");
        editText.getText().clear();
    }

    public void RestaOnClick(View view) {
        operantePrimero(editText.getText().toString());
        operacion("-");
        editText.getText().clear();
    }

    public void EqualOnClick(View view) {
        operanteSegundo(editText.getText().toString());
        editText.getText().clear();

        Double mostrarResult = resultado();

        editText.getText().append(mostrarResult.toString());
    }

}