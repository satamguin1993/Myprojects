package com.myProjects;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;


public class MyFirstCode {

    public static void main(String[] args) {

        print(1, 7);


    }

    public static void print(int current, int limit) {

        if(current == limit)
            return;
        else {
            System.out.println(current);
            print(++current, limit);
        }

        System.out.println();

    }

}
