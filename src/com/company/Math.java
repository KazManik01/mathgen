package com.company;

import java.util.Random;

public class Math {
    public int level;
    public String sign;

    public Math(int level, String sign) {
        this.level = level;
        this.sign = sign;
    }

    public static String aboba(int level, String sign){
        int answer = 0;
        String barabere = "";
        Random r = new Random();
        int a;
        int b;
        int x;
        switch (level){
            case (1):

                if (sign.equals("+")) {
                    a = r.nextInt(1000);
                    b = r.nextInt(1000);
                    answer = a + b;
                    barabere = (a + "+" + b + "|" + answer );
                    return String.valueOf(barabere);
                }
                if (sign.equals("-")) {
                     a = r.nextInt(1000);
                     b = r.nextInt(1000);
                     answer = a - b;
                     barabere = (a + " - " + b + "|" + answer  );

                     return String.valueOf(barabere);
                }
                if (sign.equals("*")) {
                     a = r.nextInt(100);
                     b = r.nextInt(100);
                    answer = a * b;
                    barabere = (a + " * " + b + "|" + answer );

                    return String.valueOf(barabere);
                }
                /*if (sign.equals("/")) {
                    int a = r.nextInt(100);
                    int b = r.nextInt(100);
                    answer = a / b;
                    return String.valueOf(answer);
                }*/
            case (2):
                int c = r.nextInt(3);

                switch (c){
                    case (1)://линейные уравнения
                        if (sign.equals("+")) {
                            a = r.nextInt(100);
                            b = r.nextInt(100);
                            x = r.nextInt(10);
                            answer = a * x  + b;
                            barabere = (a + "x + " + b + "=" + answer + "|" + x);
                            return String.valueOf(barabere);
                        }
                        if (sign.equals("-")) {
                            a = r.nextInt(100);
                            b = r.nextInt(100);
                            x = r.nextInt(10);
                            answer = a * x - b;
                            barabere = (a + "x - " + b + "=" + answer + "|" + x );
                            return String.valueOf(barabere);
                        }
                        if (sign.equals("*")) {
                            a = r.nextInt(100);
                            b = r.nextInt(100);
                            x = r.nextInt(10);
                            answer = a * x * b;
                            barabere = (a + "x * " + b + "=" + answer + "|" + x);
                            return String.valueOf(answer);
                        }
                    case (2):
                        //неполное квадратное уравнение
                            a = r.nextInt(100);x = r.nextInt(10);
                            answer = a * x * x;
                            barabere = (a + "x^2 + " + "=" + answer + "|" + x + "|" + -x);
                            return String.valueOf(barabere);
                    case (3):

                            a = r.nextInt(100);
                            x = r.nextInt(10);
                            b = answer - x * a;
                            barabere = (a + "x^2"+"" + b + "xv" + "=" + answer + "|" + x + "|" + 0);
                            return String.valueOf(barabere);
                }

            case (3):

        }

        return null;
    }


}
