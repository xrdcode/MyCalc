package mycalculator.xrdcode.com.mycalc;

import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnRst, btnHasil, btnDel,
            btnMin, btnMult, btnDiv, btnPow, btnPoint, btnPersen;
    EditText texBox;
    String currentOp = null;
    String[] opList = {"+", "-", ":", "*", "^"};
    double tmpRes = 0;
    double currentResult = 0;
    double tmpCheckRes = 0;
    boolean isCurrentResult = false;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //disable keyboard
        EditText edtView=(EditText)findViewById(R.id.textBox);
        edtView.setInputType(0);

        texBox = (EditText) findViewById(R.id.textBox);

        btnRegist();
        btnListen();
        btnPow.setText(Html.fromHtml("x<small><sup>y</sup></small>"));
    }

    public void btnRegist() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnMin = (Button) findViewById(R.id.opMin);
        btnDel = (Button) findViewById(R.id.btnBackspace);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        btnAdd = (Button) findViewById(R.id.opPlus);
        btnMult = (Button) findViewById(R.id.opMult);
        btnDiv = (Button) findViewById(R.id.opDiv);
        btnRst = (Button) findViewById(R.id.btnReset);
        btnPow = (Button) findViewById(R.id.btnPow);
        btnPoint = (Button) findViewById(R.id.koma);
        btnPersen = (Button) findViewById(R.id.btnPersen);
     }

    public void btnListen() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnRst.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnPersen.setOnClickListener(this);
        btnHasil.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnPow.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        char[] txt = texBox.getText().toString().toCharArray();
        switch (view.getId()) {
            case R.id.btn0:
                //System.out.println(txt[0] == '0');
                if(isCurrentResult) {
                    texBox.setText("0");
                    isCurrentResult = false;
                } else {
                    if (txt[0] != '0' || isHasComma(txt)) {
                        texBox.setText(texBox.getText() + "0");
                    }
                }
                break;
            case R.id.btn1:
                if(isCurrentResult) {
                    texBox.setText("1" );;
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "1");
                }
                break;
            case R.id.btn2:
                if(isCurrentResult) {
                    texBox.setText("2");
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "2");
                }
                break;
            case R.id.btn3:
                if(isCurrentResult) {
                    texBox.setText("3" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "3");
                }
                break;
            case R.id.btn4:
                if(isCurrentResult) {
                    texBox.setText("4" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "4");
                }
                break;
            case R.id.btn5:
                if(isCurrentResult) {
                    texBox.setText("5");
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "5");
                }
                break;
            case R.id.btn6:
                if(isCurrentResult) {
                    texBox.setText("6" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "6");
                }
                break;
            case R.id.btn7:
                if(isCurrentResult) {
                    texBox.setText("7" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "7");
                }
                break;
            case R.id.btn8:
                if(isCurrentResult) {
                    texBox.setText("8" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "8");
                }
                break;
            case R.id.btn9:
                if(isCurrentResult) {
                    texBox.setText("9" );
                    isCurrentResult = false;
                } else {
                    if (txt[0] == '0' && !isHasComma(txt)) texBox.setText("");
                    texBox.setText(texBox.getText() + "9");
                }
                break;
            case R.id.koma:
                char[] check = texBox.getText().toString().toCharArray();
                System.out.println(check.length);
                if((txt[0] == '-' && check.length <= 2) || check.length <= 1) {
                    texBox.setText(texBox.getText() + ".");
                } else {
                    if(!isHasComma(check)) {
                        System.out.println("Ada . ");
                        texBox.setText(texBox.getText() + ".");
                    }
                }

                break;
            case R.id.btnBackspace:
                break;
            case R.id.btnPersen:
                Double tmp = Double.parseDouble(texBox.getText().toString()) / 100;
                texBox.setText(String.valueOf(tmp));
                break;
            case R.id.opPlus:
                if(isCurrentResult) {
                    currentOp = "+";
                } else if(txt[0] != '0' && tmpRes != 0) {
                    hitungOperasi();
                    isCurrentResult = true;
                    tmpRes = currentResult;
                    currentOp = "+";
                } else if(currentOp != "+" && currentOp == null) {
                    currentOp = "+";
                    tmpRes = Double.parseDouble(texBox.getText().toString());
                    tmpCheckRes = Double.parseDouble(texBox.getText().toString());
                    texBox.setText("0");
                } else if(currentOp != "+") {
                    currentOp = "+";
                }
                break;
            case R.id.opMin:
                if(isCurrentResult) {
                    currentOp = "-";
                } else if(txt[0] != '0' && tmpRes != 0) {
                    hitungOperasi();
                    isCurrentResult = true;
                    tmpRes = currentResult;
                    currentOp = "-";
                } else if(currentOp != "-" && currentOp == null) {
                    currentOp = "-";
                    tmpRes = Double.parseDouble(texBox.getText().toString());
                    texBox.setText("0");
                } else if(currentOp != "-") {
                    currentOp = "-";
                }
                break;
            case R.id.opMult:
                if(isCurrentResult) {
                    currentOp = "*";
                } else if(txt[0] != '0' && tmpRes != 0) {
                    hitungOperasi();
                    isCurrentResult = true;
                    tmpRes = currentResult;
                    currentOp = "*";
                } else if(currentOp != "*" && currentOp == null) {
                    currentOp = "*";
                    tmpRes = Double.parseDouble(texBox.getText().toString()) ;
                    texBox.setText("0");
                } else if(currentOp != "*") {
                    currentOp = "*";
                }
                break;
            case R.id.opDiv:
                if(isCurrentResult) {
                    currentOp = ":";
                } else if(txt[0] != '0' && tmpRes != 0) {
                    hitungOperasi();
                    isCurrentResult = true;
                    tmpRes = currentResult;
                    currentOp = ":";
                } else if(currentOp != ":" && currentOp == null) {
                    currentOp = ":";
                    tmpRes = Double.parseDouble(texBox.getText().toString()) ;
                    texBox.setText("0");
                } else if(currentOp != ":") {
                    currentOp = ":";
                }
                break;
            case R.id.btnPow:
                if(isCurrentResult) {
                    currentOp = "^";
                } else if(txt[0] != '0' && tmpRes != 0) {
                    hitungOperasi();
                    isCurrentResult = true;
                    tmpRes = currentResult;
                    currentOp = "^";
                } else if(currentOp != "^" && currentOp == null) {
                    currentOp = "^";
                    tmpRes = Double.parseDouble(texBox.getText().toString()) ;
                    texBox.setText("0");
                } else if(currentOp != "^") {
                    currentOp = "^";
                }
                break;
            case R.id.btnReset:
                texBox.setText("0");
                currentOp = null;
                tmpRes = 0;
                break;
            case R.id.btnHasil:
                if (!isCurrentResult) {
                    hitungOperasi();
                }
                break;
        }

    }

    public boolean isHasComma(char[] arr) {
        if((arr[0] == '-' && arr.length <= 2) || arr.length <= 1) {
            return false;
        } else {
            for (int i =0; i < arr.length; i++) {
                if(arr[i] == '.' ) {
                    return true;
                }
            }
            return false;
        }
    }

    public void hitungOperasi() {
        if(currentOp != null ) {
            double tmp = Double.parseDouble(texBox.getText().toString());
            double hasRemainder;
            char[] check;
            switch (currentOp) {
                case "+":
                    tmp = tmp + tmpRes;
                    currentResult = tmp;
                    check = String.valueOf(tmp).toCharArray();
                    hasRemainder = tmp % 1;
                    if(!isHasComma(check) || hasRemainder == 0) {
                        texBox.setText(String.valueOf((int) tmp));
                    } else {
                        texBox.setText(String.valueOf(tmp));
                    }
                    tmpRes = 0;
                    currentOp = null;
                    break;
                case "-":
                    tmp = tmpRes - tmp;
                    currentResult = tmp;
                    System.out.println("- Masuk sini : " + tmp);
                    check = String.valueOf(tmp).toCharArray();
                    hasRemainder = tmp % 1;
                    if(!isHasComma(check) || hasRemainder == 0) {
                        texBox.setText(String.valueOf((int) tmp));
                    } else {
                        texBox.setText(String.valueOf(tmp));
                    }
                    currentOp = null;
                    tmpRes = 0;
                    break;
                case ":":
                    tmp = tmpRes / tmp;
                    currentResult = tmp;
                    System.out.println(": Masuk sini : " + tmp);
                    check = String.valueOf(tmp).toCharArray();
                    hasRemainder = tmp % 1;
                    if(!isHasComma(check) || hasRemainder == 0) {
                        texBox.setText(String.valueOf((int) tmp));
                    } else {
                        texBox.setText(String.valueOf(tmp));
                    }
                    currentOp = null;
                    tmpRes = 0;
                    break;
                case "*":
                    tmp = tmpRes * tmp;
                    currentResult = tmp;
                    System.out.println("* Masuk sini : " + tmp);
                    check = String.valueOf(tmp).toCharArray();
                    hasRemainder = tmp % 1;
                    if(!isHasComma(check) || hasRemainder == 0) {
                        texBox.setText(String.valueOf((int) tmp));
                    } else {
                        texBox.setText(String.valueOf(tmp));
                    }
                    currentOp = null;
                    tmpRes = 0;
                    break;
                case "^":
                    tmp = Math.pow(tmpRes, tmp);
                    currentResult = tmp;
                    System.out.println("^ Masuk sini : " + tmp);
                    check = String.valueOf(tmp).toCharArray();
                    hasRemainder = tmp % 1;
                    if(!isHasComma(check) || hasRemainder == 0) {
                        texBox.setText(String.valueOf((int) tmp));
                    } else {
                        texBox.setText(String.valueOf(tmp));
                    }
                    currentOp = null;
                    tmpRes = 0;
                    break;
            }
        }
    }

}

