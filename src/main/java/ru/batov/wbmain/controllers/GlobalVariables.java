package ru.batov.wbmain.controllers;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;


public class GlobalVariables {
    public static int ThreadCount = 0;
    public static int NewProductCount = 0;
    public static int UpdateProductCount = 0;
    public static int ExceptionCount = 0;
    public static int DuplicateProductCount = 0;
    public static int NullProductCount = 0;

    public static LocalDateTime start = null;

    public static HashMap<String, Integer> HashMap = null;

    public static List<Thread> ThreadList = null;
}
