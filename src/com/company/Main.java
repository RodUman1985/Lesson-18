package com.company;

public class Main {

    public static void main(String[] args) {
	// Строки
        String s = "Waaagh!!!!";
        //получение символа по его индексу
        System.out.println(s.charAt(2));
        //получение массива из строки
        for (char c:s.toCharArray()) {
            System.out.print(c);
            System.out.println();
        }
        // длинна сторки
        System.out.println(s.length());
        // строки  в  Java  все иммутабельны
        s.toLowerCase(); //приводит строку к нижнему регистру

        String s2= s.toLowerCase();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.toUpperCase());
        // выделение части строки (опредиление подстроки)
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        // замена одной подстроки на другую
        System.out.println(s.replace("aa","0"));
        System.out.println(s.replace('a', '0'));
        System.out.println(s.replaceAll("a","0"));
        //разбиение строки по указанным разделителям
        s="victoris out mortis";
        String[]words= s.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        // форматирование строк
       String name= "Garvel";
        int age = 200;
        //флаги форматирования
        //%s - подстановка строки
        //%d - подстановка целого числа
        //%f - опдстановка вещественного числа
        //%c - подстановка одного символа

       String s3= String.format(" 45%% My name is  %s. I am %d years old.%1$s is a good boy", name,age);// %% - печатает
        // знак процента (для нескольких - четное количество)
        System.out.println(s3);
        System.out.printf("Age: %d\n",120);

        System.out.printf("%1.2s 12\n","hello");
        // первое число- миню ширина строки, второе- длинна форматируемой строки

        System.out.printf("%010d\n",123);
        System.out.printf("%10.3f",3.1415);
        //вывод таблицы умножения
        System.out.println();
        for (int i=1; i<=9;i++) {
            for (int j=1; j<=9;j++){
                System.out.printf("%d x %d = %2d  ",j,i,i*j);
            }
            System.out.println();
        }
        // символы управления кареткой
        // \n -  переход на новую строку
        // \t - табуляция
        // \b -  backspace
        System.out.print("\\Hello\nJava\t!!!\b");
        System.out.println();
        String sss = "khjjlkj"+"ada";
        StringBuffer b =new StringBuffer(1024);
        b.append("fhfhf");
        b.append("+dadad");
        b.append("hghgh");
        System.out.println(b);
        // StringtBгffer - потокобезопасен. StringBuilder - не потокобезопасен. Во всем остальном они идентичны
        


    }
}
