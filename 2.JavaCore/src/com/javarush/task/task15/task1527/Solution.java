package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.substring(s.indexOf('?') + 1);
        String[] arr = s.split("&");
        String param = "";
        String names = "";

        for (String i : arr) {
            param += i;
            param += " ";
        }

        System.out.println(param.trim());

        if (s.contains("obj")) {
            for (int i = 0; i < arr.length; i++) {
                String[] x = arr[i].split("=");
                names += x[0];
                names += " ";
            }
            System.out.println(names.trim());

            for (String value : arr) {
                if (value.contains("obj")) {
                    String[] x = value.split("=");
                    if (x[1].contains(".")) {
                        alert(Double.parseDouble(x[1]));
                    }
                    else {
                        alert(x[1]);
                    }
                }
            }
        }

        else {
            for (int i = 0; i < arr.length; i++) {
                String[] x = arr[i].split("=");
                names += x[0];
                names += " ";
            }
            System.out.println(names.trim());
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String paramsSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = paramsSubString.split("&");
        String objValue = null;

        StringBuilder resultBuilder = new StringBuilder();
        for (String splitParam : splitParams) {
            String[] paramAndValue = splitParam.split("=");
            resultBuilder.append(paramAndValue[0]);
            resultBuilder.append(" ");

            if (paramAndValue[0].equals("obj")) {
                objValue = paramAndValue[1];
            }
        }

        System.out.println(resultBuilder.toString().trim());

        if (objValue != null) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException nfe) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
