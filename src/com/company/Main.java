package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runTask1();
        runTask2();
        runTask3();
        runTask4();
        runTask5();
        runTask6();
        runTask7();
        runTask8();
        runTask9();
        runTask10();
        runTask11();
        runTask12();
        runTask13();
    }

    //Задание 1.
    //Считать строку, в которой должно быть число, и число. Найти их сумму.
    static void runTask1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число и нажмите Enter (разделитель целой и дробной части точка):");
        double d1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите второе число и нажмите Enter (разделитель целой и дробной части запятая):");
        double d2 = scanner.nextDouble();

        System.out.println("Сумма введённых чисел " + d1 + " и " + d2 + " составляет " + (d1 + d2));
    }

    //Задание 2.
    //Считывать любые числа пока не введётся 7.
    static void runTask2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль и нажмите Enter:");
        long necessary = Long.parseLong(scanner.nextLine());

        while (necessary != 7) {
            System.out.println("Пароль неверный, попробуйте ещё раз:");
            necessary = Long.parseLong(scanner.nextLine());
        }

        System.out.println("Пароль \"" + necessary + "\" принят.");
    }

    //Задание 3.
    //Найти сумму цифр в введённом числе.
    static void runTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        String input_string = scanner.nextLine();

        //- вариант 1: через методы классов работы со строками
        int sum = 0;
        for (int i = 0; i < input_string.length(); i++) {
            String str = String.valueOf(input_string.charAt(i));
            sum += Integer.parseInt(str);
        }

        System.out.println("Сумма цифр в введённом числе " + input_string + " составляет "
                + sum + ". Высчитано с использованием методов класса String.");

        //- вариант 2: через арифметические операции
        sum = 0;
        for (long number = Long.parseLong(input_string); number != 0L; number = number / 10) {
            sum += number % 10;
        }

        System.out.println("Сумма цифр в введённом числе " + input_string + " составляет "
                + sum + ". Высчитано арифметическим методом.");
    }

    //Задание 4.
    //В введённом числе поменять местами цифры задом наперёд (первая должна стать последней).
    static void runTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        String input_string = scanner.nextLine();

        //- вариант 1: через методы классов работы со строками
        StringBuilder string_builder = new StringBuilder(input_string);

        System.out.println("Введено число " + input_string
                + ". После замены цифр задом наперёд получилось число "
                + string_builder.reverse() + ". Использованы методы класса StringBuilder.");

        //- вариант 2: через арифметические операции
        long reversed_number = 0;
        for (long number = Long.parseLong(input_string); number > 0L; number = number / 10) {
            reversed_number = 10 * reversed_number + (number % 10);
        }

        System.out.println("Введено число " + input_string
                + ". После замены цифр задом наперёд получилось число "
                + reversed_number + ". Использованы арифметические операции.");
    }

    //Задание 5.
    //Ввести число чисел, затем ввести столько чисел сколько первое число было и вывести их сумму.
    static void runTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые нужно просуммировать, и нажмите Enter:");
        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        StringBuilder string_builder = new StringBuilder("Вы ввели " + n + " числа (");
        for (int i = n; i > 0; i--) {
            System.out.println("Осталось ввести числа ещё " + i + " раз(а). Введите число и нажмите Enter:");
            String str = scanner.nextLine();

            if (i != n) {
                string_builder.append(", ");
            }
            string_builder.append(str);

            sum += Double.parseDouble(str);
        }

        if (n != 0) {
            System.out.println(string_builder + "). Сумма чисел составляет " + sum + ".");
        } else {
            System.out.println("Как жаль, что вы отказались от ввода чисел." +
                    " Мы хотели только посчитать их сумму.");
        }
    }

    //Задание 6.
    //Ввести число чисел, затем ввести столько чисел сколько первое число было и вывести большее из них.
    static void runTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое количество чисел и нажмите Enter:");
        int n = Integer.parseInt(scanner.nextLine());

        double max = 0;
        StringBuilder string_builder = new StringBuilder("Вы ввели " + n + " числа (");
        for (int i = n; i > 0; i--) {
            System.out.println("Осталось ввести числа ещё " + i + " раз(а). Введите число и нажмите Enter:");
            String str = scanner.nextLine();

            if (i != n) {
                string_builder.append(", ");
            }
            string_builder.append(str);

            max = Double.max(Double.parseDouble(str), max);
        }

        if (n != 0) {
            System.out.println(string_builder + "). Наибольшим из них является " + max + ".");
        } else {
            System.out.println("Как жаль, что вы отказались от ввода чисел." +
                    " Мы только хотели определить наибольшее из них.");
        }
    }

    //Задание 7.
    //Сделать цикл for циклами while, do while и вывести каждое число в итерации.
    static void runTask7() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }

    //Задание 8.
    //Создать переменные всех указанных типов и вывести каждую в консоль.
    //Считать все переменные и вывести каждую в консоль.
    static void runTask8() {
        System.out.println("Целые числа и их классы обёртки:");
        long long_example = 34L;
        System.out.println("long => " + long_example);
        int int_example = 25;
        System.out.println("int => " + int_example);
        short short_example = 125;
        System.out.println("short => " + short_example);
        byte byte_example = 27;
        System.out.println("short => " + byte_example);
        Long long_wrapper_example = 53L;
        System.out.println("wrapper Long => " + long_wrapper_example);
        Integer integer_wrapper_example = 12;
        System.out.println("wrapper Integer => " + integer_wrapper_example);
        Short short_wrapper_example = 87;
        System.out.println("wrapper Short => " + short_wrapper_example);
        Byte byte_wrapper_example = 3;
        System.out.println("wrapper Byte => " + byte_wrapper_example);

        System.out.println("Цифры с запятой и их классы обёртки:");
        double double_example = 74.54;
        System.out.println("double => " + double_example);
        float float_example = 23.5F;
        System.out.println("float => " + float_example);
        Double double_wrapper_example = 4.4;
        System.out.println("wrapper Double => " + double_wrapper_example);
        Float float_wrapper_example = 3.7F;
        System.out.println("wrapper Float => " + float_wrapper_example);

        System.out.println("Символ и его класс обёртка:");
        char char_example = '#';
        System.out.println("char => " + char_example);
        Character char_wrapper_example = 'r';
        System.out.println("wrapper Character => " + char_wrapper_example);

        System.out.println("Булев тип и его класс обёртка:");
        boolean boolean_example = true;
        System.out.println("boolean => " + boolean_example);
        Boolean boolean_wrapper_example = false;
        System.out.println("wrapper Boolean => " + boolean_wrapper_example);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число типа long и нажмите Enter:");
        System.out.println("long => " + scanner.nextLong());

        System.out.println("Введите число типа int и нажмите Enter:");
        System.out.println("int => " + scanner.nextInt());

        System.out.println("Введите число типа short и нажмите Enter:");
        System.out.println("short => " + scanner.nextShort());

        System.out.println("Введите число типа byte и нажмите Enter:");
        System.out.println("byte => " + scanner.nextByte());

        System.out.println("Введите число типа double и нажмите Enter" +
                " (разделитель целой и дробной части запятая):");
        System.out.println("double => " + scanner.nextDouble());

        System.out.println("Введите число типа float и нажмите Enter" +
                " (разделитель целой и дробной части запятая):");
        System.out.println("float => " + scanner.nextFloat());

        System.out.println("Введите тип char и нажмите Enter:");
        System.out.println("char => " + scanner.next().charAt(0));

        System.out.println("Введите тип boolean и нажмите Enter:");
        System.out.println("boolean => " + scanner.nextBoolean());
    }

    //Задание 9.
    //Привести типы внутри групп, вне групп, числа в строки.
    static void runTask9() {
        long long_example = 34L;
        int int_example = 25;
        short short_example = 125;
        byte byte_example = 27;
        Long long_wrapper_example = 53L;
        Integer integer_wrapper_example = 12;
        Short short_wrapper_example = 87;
        Byte byte_wrapper_example = 3;
        double double_example = 74.54;
        float float_example = 23.5F;
        Double double_wrapper_example = 4.4;
        Float float_wrapper_example = 3.7F;
        char char_example = '#';
        Character character_wrapper_example = 'r';
        boolean boolean_example = true;
        Boolean boolean_wrapper_example = false;
        String str = "17";

        //Приведение к типу long
        long int_to_long = int_example;
        long short_to_long = short_example;
        long byte_to_long = byte_example;
        long long_wrapper_to_long = long_wrapper_example;
        long integer_wrapper_to_long = integer_wrapper_example.longValue();
        long short_wrapper_to_long = short_wrapper_example.longValue();
        long byte_wrapper_to_long = byte_wrapper_example.longValue();
        long double_to_long = (long) double_example;
        long float_to_long = (long) float_example;
        long double_wrapper_to_long = double_wrapper_example.longValue();
        long float_wrapper_to_long = (long) float_wrapper_example.longValue();
        long char_to_long = char_example;
        long character_wrapper_to_long = character_wrapper_example;
        long boolean_to_long = boolean_example ? 1L : 0L;
        long boolean_wrapper_to_long = boolean_wrapper_example ? 1L : 0L;
        long string_to_long = Long.parseLong(str);

        //Приведение к обёрточному классу Long
        Long long_to_long_wrapper = long_example;
        Long int_to_long_wrapper = (long) int_example;
        Long short_to_long_wrapper = (long) short_example;
        Long byte_to_long_wrapper = (long) byte_example;
        Long integer_wrapper_to_long_wrapper = integer_wrapper_example.longValue();
        Long short_wrapper_to_long_wrapper = short_wrapper_example.longValue();
        Long byte_wrapper_to_long_wrapper = byte_wrapper_example.longValue();
        Long double_to_long_wrapper = (long) double_example;
        Long float_to_long_wrapper = (long) float_example;
        Long double_wrapper_to_long_wrapper = double_wrapper_example.longValue();
        Long float_wrapper_to_long_wrapper = float_wrapper_example.longValue();
        Long char_to_long_wrapper = (long) char_example;
        Long character_wrapper_to_long_wrapper = (long) character_wrapper_example;
        Long boolean_to_long_wrapper = boolean_example ? 1L : 0L;
        Long boolean_wrapper_to_long_wrapper = boolean_wrapper_example ? 1L : 0L;
        Long string_to_long_wrapper = Long.parseLong(str);

        //Приведение к типу int
        int long_to_int = (int) long_example;
        int short_to_int = short_example;
        int byte_to_int = byte_example;
        int long_wrapper_to_int = long_wrapper_example.intValue();
        int integer_wrapper_to_int = integer_wrapper_example;
        int short_wrapper_to_int = short_wrapper_example.intValue();
        int byte_wrapper_to_int = byte_wrapper_example.intValue();
        int double_to_int = (int) double_example;
        int float_to_int = (int) float_example;
        int double_wrapper_to_int = double_wrapper_example.intValue();
        int float_wrapper_to_int = float_wrapper_example.intValue();
        int char_to_int = char_example;
        int character_wrapper_to_int = character_wrapper_example;
        int boolean_to_int = boolean_example ? 1 : 0;
        int boolean_wrapper_to_int = boolean_wrapper_example ? 1 : 0;
        int string_to_int = Integer.parseInt(str);

        //Приведение к обёрточному классу Integer
        Integer long_to_integer_wrapper = (int) long_example;
        Integer int_to_integer_wrapper = int_example;
        Integer short_to_integer_wrapper = (int) short_example;
        Integer byte_to_integer_wrapper = (int) byte_example;
        Integer long_wrapper_to_integer_wrapper = long_wrapper_example.intValue();
        Integer short_wrapper_to_integer_wrapper = short_wrapper_example.intValue();
        Integer byte_wrapper_to_integer_wrapper = byte_wrapper_example.intValue();
        Integer double_to_integer_wrapper = (int) double_example;
        Integer float_to_integer_wrapper = (int) float_example;
        Integer double_wrapper_to_integer_wrapper = double_wrapper_example.intValue();
        Integer float_wrapper_to_integer_wrapper = float_wrapper_example.intValue();
        Integer char_to_integer_wrapper = (int) char_example;
        Integer character_wrapper_to_integer_wrapper = (int) character_wrapper_example;
        Integer boolean_to_integer_wrapper = boolean_example ? 1 : 0;
        Integer boolean_wrapper_to_integer_wrapper = boolean_wrapper_example ? 1 : 0;
        Integer string_to_integer_wrapper = Integer.parseInt(str);

        //Приведение к типу short
        short long_to_short = (short) long_example;
        short int_to_short = (short) int_example;
        short byte_to_short = byte_example;
        short long_wrapper_to_short = long_wrapper_example.shortValue();
        short integer_wrapper_to_short = integer_wrapper_example.shortValue();
        short short_wrapper_to_short = short_wrapper_example;
        short byte_wrapper_to_short = byte_wrapper_example.shortValue();
        short double_to_short = (short) double_example;
        short float_to_short = (short) float_example;
        short double_wrapper_to_short = double_wrapper_example.shortValue();
        short float_wrapper_to_short = float_wrapper_example.shortValue();
        short char_to_short = (short) char_example;
        short character_wrapper_to_short = (short) character_wrapper_example.charValue();
        short boolean_to_short = (short) (boolean_example ? 1 : 0);
        short boolean_wrapper_to_short = (short) (boolean_wrapper_example ? 1 : 0);
        short string_to_short = Short.parseShort(str);

        //Приведение к обёрточному классу Short
        Short long_to_short_wrapper = (short) long_example;
        Short int_to_short_wrapper = (short) int_example;
        Short short_to_short_wrapper = short_example;
        Short byte_to_short_wrapper = (short) byte_example;
        Short long_wrapper_to_short_wrapper = long_wrapper_example.shortValue();
        Short integer_wrapper_to_short_wrapper = integer_wrapper_example.shortValue();
        Short byte_wrapper_to_short_wrapper = byte_wrapper_example.shortValue();
        Short double_to_short_wrapper = (short) double_example;
        Short float_to_short_wrapper = (short) float_example;
        Short double_wrapper_to_short_wrapper = double_wrapper_example.shortValue();
        Short float_wrapper_to_short_wrapper = float_wrapper_example.shortValue();
        Short char_to_short_wrapper = (short) char_example;
        Short character_wrapper_to_short_wrapper = (short) character_wrapper_example.charValue();
        Short boolean_to_short_wrapper = (short) (boolean_example ? 1 : 0);
        Short boolean_wrapper_to_short_wrapper = (short) (boolean_wrapper_example ? 1 : 0);
        Short string_to_short_wrapper = Short.parseShort(str);

        //Приведение к типу byte
        byte long_to_byte = (byte) long_example;
        byte int_to_byte = (byte) int_example;
        byte short_to_byte = (byte) short_example;
        byte long_wrapper_to_byte = long_wrapper_example.byteValue();
        byte integer_wrapper_to_byte = integer_wrapper_example.byteValue();
        byte short_wrapper_to_byte = short_wrapper_example.byteValue();
        byte byte_wrapper_to_byte = byte_wrapper_example;
        byte double_to_byte = (byte) double_example;
        byte float_to_byte = (byte) float_example;
        byte double_wrapper_to_byte = double_wrapper_example.byteValue();
        byte float_wrapper_to_byte = float_wrapper_example.byteValue();
        byte char_to_byte = (byte) char_example;
        byte character_wrapper_to_byte = (byte) character_wrapper_example.charValue();
        byte boolean_to_byte = (byte) (boolean_example ? 1 : 0);
        byte boolean_wrapper_to_byte = (byte) (boolean_wrapper_example ? 1 : 0);
        byte string_to_byte = Byte.parseByte(str);

        //Приведение к обёрточному классу Byte
        Byte long_to_byte_wrapper = (byte) long_example;
        Byte int_to_byte_wrapper = (byte) int_example;
        Byte short_to_byte_wrapper = (byte) short_example;
        Byte byte_to_byte_wrapper = byte_example;
        Byte long_wrapper_to_byte_wrapper = long_wrapper_example.byteValue();
        Byte integer_wrapper_to_byte_wrapper = integer_wrapper_example.byteValue();
        Byte short_wrapper_to_byte_wrapper = short_wrapper_example.byteValue();
        Byte double_to_byte_wrapper = (byte) double_example;
        Byte float_to_byte_wrapper = (byte) float_example;
        Byte double_wrapper_to_byte_wrapper = double_wrapper_example.byteValue();
        Byte float_wrapper_to_byte_wrapper = float_wrapper_example.byteValue();
        Byte char_to_byte_wrapper = (byte) char_example;
        Byte character_wrapper_to_byte_wrapper = (byte) character_wrapper_example.charValue();
        Byte boolean_to_byte_wrapper = (byte) (boolean_example ? 1 : 0);
        Byte boolean_wrapper_to_byte_wrapper = (byte) (boolean_wrapper_example ? 1 : 0);
        Byte string_to_byte_wrapper = Byte.parseByte(str);

        //Приведение к типу double
        double long_to_double = long_example;
        double int_to_double = int_example;
        double short_to_double = short_example;
        double byte_to_double = byte_example;
        double long_wrapper_to_double = long_wrapper_example.doubleValue();
        double integer_wrapper_to_double = integer_wrapper_example.doubleValue();
        double short_wrapper_to_double = short_wrapper_example.doubleValue();
        double byte_wrapper_to_double = byte_wrapper_example.doubleValue();
        double float_to_double = float_example;
        double double_wrapper_to_double = double_wrapper_example;
        double float_wrapper_to_double = float_wrapper_example.doubleValue();
        double char_to_double = char_example;
        double character_wrapper_to_double = character_wrapper_example;
        double boolean_to_double = boolean_example ? 1 : 0;
        double boolean_wrapper_to_double = boolean_wrapper_example ? 1 : 0;
        double string_to_double = Double.parseDouble(str);

        //Приведение к обёрточному классу Double
        Double long_to_double_wrapper = (double) long_example;
        Double int_to_double_wrapper = (double) int_example;
        Double short_to_double_wrapper = (double) short_example;
        Double byte_to_double_wrapper = (double) byte_example;
        Double long_wrapper_to_double_wrapper = long_wrapper_example.doubleValue();
        Double integer_wrapper_to_double_wrapper = integer_wrapper_example.doubleValue();
        Double short_wrapper_to_double_wrapper = short_wrapper_example.doubleValue();
        Double byte_wrapper_to_double_wrapper = byte_wrapper_example.doubleValue();
        Double double_to_double_wrapper = double_example;
        Double float_to_double_wrapper = (double) float_example;
        Double float_wrapper_to_double_wrapper = float_wrapper_example.doubleValue();
        Double char_to_double_wrapper = (double) char_example;
        Double character_wrapper_to_double_wrapper = (double) character_wrapper_example;
        Double boolean_to_double_wrapper = (double) (boolean_example ? 1 : 0);
        Double boolean_wrapper_to_double_wrapper = (double) (boolean_wrapper_example ? 1 : 0);
        Double string_to_double_wrapper = Double.parseDouble(str);

        //Приведение к типу float
        float long_to_float = long_example;
        float int_to_float = int_example;
        float short_to_float = short_example;
        float byte_to_float = byte_example;
        float long_wrapper_to_float = long_wrapper_example.floatValue();
        float integer_wrapper_to_float = integer_wrapper_example.floatValue();
        float short_wrapper_to_float = short_wrapper_example.floatValue();
        float byte_wrapper_to_float = byte_wrapper_example.floatValue();
        float double_to_float = (float) double_example;
        float double_wrapper_to_float = double_wrapper_example.floatValue();
        float float_wrapper_to_float = float_wrapper_example;
        float char_to_float = char_example;
        float character_wrapper_to_float = character_wrapper_example;
        float boolean_to_float = boolean_example ? 1 : 0;
        float boolean_wrapper_to_float = boolean_wrapper_example ? 1 : 0;
        float string_to_float = Float.parseFloat(str);

        //Приведение к обёрточному классу Float
        Float long_to_float_wrapper = (float) long_example;
        Float int_to_float_wrapper = (float) int_example;
        Float short_to_float_wrapper = (float) short_example;
        Float byte_to_float_wrapper = (float) byte_example;
        Float long_wrapper_to_float_wrapper = long_wrapper_example.floatValue();
        Float integer_wrapper_to_float_wrapper = integer_wrapper_example.floatValue();
        Float short_wrapper_to_float_wrapper = short_wrapper_example.floatValue();
        Float byte_wrapper_to_float_wrapper = byte_wrapper_example.floatValue();
        Float double_to_float_wrapper = (float) double_example;
        Float float_to_float_wrapper = float_example;
        Float double_wrapper_to_float_wrapper = double_wrapper_example.floatValue();
        Float char_to_float_wrapper = (float) char_example;
        Float character_wrapper_to_float_wrapper = (float) character_wrapper_example;
        Float boolean_to_float_wrapper = (float) (boolean_example ? 1 : 0);
        Float boolean_wrapper_to_float_wrapper = (float) (boolean_wrapper_example ? 1 : 0);
        Float string_to_float_wrapper = Float.parseFloat(str);

        //Приведение к типу char
        char long_to_char = (char) long_example;
        char int_to_char = (char) int_example;
        char short_to_char = (char) short_example;
        char byte_to_char = (char) byte_example;
        char long_wrapper_to_char = (char) long_wrapper_example.intValue();
        char integer_wrapper_to_char = (char) integer_wrapper_example.intValue();
        char short_wrapper_to_char = (char) short_wrapper_example.intValue();
        char byte_wrapper_to_char = (char) byte_wrapper_example.intValue();
        char double_to_char = (char) double_example;
        char float_to_char = (char) float_example;
        char double_wrapper_to_char = (char) double_wrapper_example.intValue();
        char float_wrapper_to_char = (char) float_wrapper_example.intValue();
        char character_wrapper_to_char = character_wrapper_example;
        char boolean_to_char = (char) (boolean_example ? 1 : 0);
        char boolean_wrapper_to_char = (char) (boolean_wrapper_example ? 1 : 0);
        char string_to_char = str.charAt(0);

        //Приведение к обёрточному классу Character
        Character long_to_character_wrapper = (char) long_example;
        Character int_to_character_wrapper = (char) int_example;
        Character short_to_character_wrapper = (char) short_example;
        Character byte_to_character_wrapper = (char) byte_example;
        Character long_wrapper_to_character_wrapper = (char) long_wrapper_example.intValue();
        Character integer_wrapper_to_character_wrapper = (char) integer_wrapper_example.intValue();
        Character short_wrapper_to_character_wrapper = (char) short_wrapper_example.intValue();
        Character byte_wrapper_to_character_wrapper = (char) byte_wrapper_example.intValue();
        Character double_to_character_wrapper = (char) double_example;
        Character float_to_character_wrapper = (char) float_example;
        Character double_wrapper_to_character_wrapper = (char) double_wrapper_example.intValue();
        Character float_wrapper_to_character_wrapper = (char) float_wrapper_example.intValue();
        Character character_to_character_wrapper = char_example;
        Character boolean_to_character_wrapper = (char) (boolean_example ? 1 : 0);
        Character boolean_wrapper_to_character_wrapper = (char) (boolean_wrapper_example ? 1 : 0);
        Character string_to_character_wrapper = str.charAt(0);

        //Приведение к типу boolean
        boolean long_to_boolean = long_example != 0;
        boolean int_to_boolean = int_example != 0;
        boolean short_to_boolean = short_example != 0;
        boolean byte_to_boolean = byte_example != 0;
        boolean long_wrapper_to_boolean = long_wrapper_example != 0;
        boolean integer_wrapper_to_boolean = integer_wrapper_example != 0;
        boolean short_wrapper_to_boolean = short_wrapper_example != 0;
        boolean byte_wrapper_to_boolean = byte_wrapper_example != 0;
        boolean double_to_boolean = double_example != 0;
        boolean float_to_boolean = float_example != 0;
        boolean double_wrapper_to_boolean = double_wrapper_example != 0;
        boolean float_wrapper_to_boolean = float_wrapper_example != 0;
        boolean char_to_boolean = char_example != 0;
        boolean character_wrapper_to_boolean = character_wrapper_example != 0;
        boolean boolean_wrapper_to_boolean = boolean_wrapper_example;
        boolean string_to_boolean = Boolean.parseBoolean(str);

        //Приведение к обёрточному классу Boolean
        Boolean long_to_boolean_wrapper = long_example != 0;
        Boolean int_to_boolean_wrapper = int_example != 0;
        Boolean short_to_boolean_wrapper = short_example != 0;
        Boolean byte_to_boolean_wrapper = byte_example != 0;
        Boolean long_wrapper_to_boolean_wrapper = long_wrapper_example != 0;
        Boolean integer_wrapper_to_boolean_wrapper = integer_wrapper_example != 0;
        Boolean short_wrapper_to_boolean_wrapper = short_wrapper_example != 0;
        Boolean byte_wrapper_to_boolean_wrapper = byte_wrapper_example != 0;
        Boolean double_to_boolean_wrapper = double_example != 0;
        Boolean float_to_boolean_wrapper = float_example != 0;
        Boolean double_wrapper_to_boolean_wrapper = double_wrapper_example != 0;
        Boolean float_wrapper_to_boolean_wrapper = float_wrapper_example != 0;
        Boolean char_to_boolean_wrapper = char_example != 0;
        Boolean character_wrapper_to_boolean_wrapper = character_wrapper_example != 0;
        Boolean boolean_to_boolean_wrapper = boolean_example;
        Boolean string_to_boolean_wrapper = Boolean.parseBoolean(str);

        //Приведение к классу String
        String long_to_string = "" + long_example;
        String int_to_string = "" + int_example;
        String short_to_string = "" + short_example;
        String byte_to_string = "" + byte_example;
        String long_wrapper_to_string = "" + long_wrapper_example;
        String integer_wrapper_to_string = "" + integer_wrapper_example;
        String short_wrapper_to_string = "" + short_wrapper_example;
        String byte_wrapper_to_string = "" + byte_wrapper_example;
        String double_to_string = "" + double_example;
        String float_to_string = "" + float_example;
        String double_wrapper_to_string = "" + double_wrapper_example;
        String float_wrapper_to_string = "" + double_wrapper_example;
        String char_to_string = "" + char_example;
        String character_wrapper_to_string = "" + character_wrapper_example;
        String boolean_to_string = "" + boolean_example;
        String boolean_wrapper_to_string = "" + boolean_wrapper_example;
    }

    //Задание 10.
    //Показать пример условных операторов
    static void runTask10() {
        String animal_name = "Мурка";
        if (animal_name.equals("Мурка")) {
            System.out.println("Её зовут Мурка.");
        }

        int a = 50;
        if (a > 60) {
            System.out.println("Число больше 60");
        } else {
            System.out.println("Число меньше или равно 60");
        }

        int cond = 77;
        if (cond == 3) {
            System.out.println("Условие равно трём.");
        } else if (cond == 7) {
            System.out.println("Условие равно семи.");
        } else {
            System.out.println("Условие не равно ни трём, ни семи.");
        }
    }

    //Задание 11.
    //Показать пример циклов
    static void runTask11() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от одного до ста включительно составляет " + sum + ".");

        int product = 1;
        int i = 1;
        while (i <= 10) {
            product *= i;
            i++;
        }
        System.out.println("Произведение чисел от одного до десяти включительно составляет " + product);

        System.out.print("Cимволы текущей кодировки c кодами от 48-го по 122-ой включительно:");
        int m = 48;
        do {
            System.out.print(" " + (char) m);
            m++;
        } while (m <= 122);
        System.out.println();
    }

    //Задание 12.
    //Вы – доставщик пиццы, в доме n этажей, m подъездов, k квартир на этаже.
    //Найти на какой этаж и в какой подъезд вам надо зайти если доставить нужно в квартиру t.
    //Если нет такой квартиры в доме то вывести соответствующее сообщение.
    // n, m, k, t вводятся по очереди с клавиатуры.
    static void runTask12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество подъездов в доме и нажмите Enter:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Введите количество этажей в доме и нажмите Enter:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Введите количество квартир на этаже и нажмите Enter:");
        int k = Integer.parseInt(sc.nextLine());
        System.out.println("Введите номер квартиры и нажмите Enter:");
        int t = Integer.parseInt(sc.nextLine());

        if (t > m * n * k) {
            System.out.println("В доме не может быть квартиры с таким номером. Вы ошиблись при вводе.");
        } else {
            int porch = (t / (n * k)) + 1;
            int floor = (t % (n * k)) / k + 1;
            System.out.println("Подъезд - " + porch + ", этаж - " + floor + ".");
        }
    }

    //Задание 13.
    //Вы – улитка и ползете по стебельку длиной l. За день вы поднимаетесь на n метров,
    //за ночь пока спите – спускаетесь на k вниз. Найти на какой день вы доберетесь.
    //Если не доберетесь то написать соответствующее сообщение.
    //l, n, k вводятся по очереди с клавиатуры.
    //Ночь заканчивается утром следующего дня.
    static void runTask13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стебелька и нажмите Enter:");
        double l = Double.parseDouble(sc.nextLine());
        System.out.println("Введите на сколько метров улитка поднимается за день и нажмите Enter:");
        double n = Double.parseDouble(sc.nextLine());
        System.out.println("Введите на сколько метров улитка спускается за ночь и нажмите Enter:");
        double k = Double.parseDouble(sc.nextLine());

        //-вариант 1: через тщательный просчёт расписания улитки :)
        boolean is_night = false;
        double position = 0;
        long current_day = 1;
        while (position < l) {
            if (is_night) {
                position = position - k;
            } else {
                position = position + n;
            }

            System.out.println((is_night ? current_day + 1 : current_day) + "-ые сутки, " + (is_night ? "ночь" : "день") +
                    ", положение - " + position + ".");

            if (position <= 0) {
                System.out.println("В " + current_day + "-ый же день улитка оказалась у основания стебелька," +
                        " она не способна забраться на вершину!");
                break;
            }

            if (is_night) {
                current_day++;
            }
            is_night = !is_night;
        }

        if (position >= l) {
            System.out.println("Чтобы забраться на вершину стебелька, улитке потребуется " +
                    current_day + " дня(-ей).");
        }

        //-вариант 2: через рассчитанную формулу
        if (n < l && k > n) {
            System.out.println("К сожалению улитке не суждено забраться на вершину стебелька.");
        } else if (n > l) {
            System.out.println("Улитка заберётся на вершину стебелька за 1 день.");
        } else {
            long days = (long) Math.ceil((l - n) / (n - k)) + 1;
            System.out.println("Наши поздравления улитке! Она это сделала!" +
                    " Достигла вершины на " + days + "-ый день.");
        }
    }
}