package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class CapitalizeAndGenerateMD5Hex {
    public static void main(String[] args) {

        System.out.println("This program will capitalize the input string and generate MD5 hex\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        String outputString = getCapitalize(inputString);
        String md5String = getMd5String(inputString);

        System.out.println("Capitalized String is: " + outputString);
        System.out.println("MD5 hex is :" + md5String);

    }

    public static String getMd5String(String inputString) {
        return DigestUtils.md5Hex(inputString);
    }

    public static String getCapitalize(String inputString) {
        return StringUtils.capitalize(inputString);
    }


}