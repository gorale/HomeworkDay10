package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void sumDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int n: ");
        int n = sc.nextInt();
        int sum = 0;
        while (true){
            
        }
    }

    /**
     * Random number
     */
    public static void randomNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(10);
        System.out.println(ran);
        while (true) {
            int num = sc.nextInt();
            if (num < ran) {
                System.out.println("Too low, try again.");
                continue;

            }else if(num > ran){
                System.out.println("Too high, try again.");
                continue;
            }else{
                System.out.println("ok");
                break;
            }


        }

    }


    /**
     * Second max
     */
    public static void secondLargestElement() {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int maxSecond = 0;
        while (true) {
            int num = sc.nextInt();
            if (num > 0) {
                if (max > num) {
                    continue;
                }

                maxSecond = max;
                max = num;


            } else if (num == 0) {
                System.out.println(maxSecond);
                break;
            }
        }
    }

    /**
     * Bank
     *
     * @param x
     * @param p
     * @param y
     */
    public static void bank(int x, float p, int y) {
        int count = 0;
        while (true) {

            if (x < y) {
                count++;
                x += x * (p / 100);
                continue;

            } else {
                System.out.println(count);
                break;
            }
        }

    }

    /**
     * Athlete
     *
     * @param n
     * @param m
     */
    public static void athlete(float n, float m) {
        int count = 1;
        while (true) {

            if (n < m) {
                n = (float) (n * 1.1);
                count++;
            } else {
                System.out.println(count);
                break;
            }
        }

    }

    /**
     * Fibonacci
     *
     * @param a
     */
    public static void fibonacci(int a) {
        int n1 = 0;
        int n2 = 1;
        int count = 1;
        while (true) {


            int n = n1 + n2;
            n1 = n2;
            n2 = n;
            if (n < a) {
                count++;
                continue;
            }

            if (a == n) {
                System.out.println(count + 1);
                break;
            } else if (n > a) {
                System.out.println(-1);
                break;
            }

        }

    }

    /**
     * Multiple Of Three
     *
     * @param n
     */
    public static void multipleOfThree(int n) {
        int i = 1;
        while (i != n) {

            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }

    /**
     * Table Ascii
     */
    public static void tableAscii() {
        byte n = 32;
        char k;
        int count = 0;
        while (true) {
            k = (char) n;
            count++;
            n++;
            System.out.print(" " + k);
            if (count % 10 == 0) {
                System.out.println("\n");
            }
            if (n == 123) {
                break;

            }
        }
    }

    /**
     * Smallest Integer K
     *
     * @param n
     */
    public static void smallestIntegerK(int n) {
        while (true) {
            if ((n & (n - 1)) == 0) {
                int k = 1;
                int count = 0;
                while (k != n) {
                    k *= 2;
                    count++;
                }
                System.out.println(count);
                break;
            }
            n++;

        }
    }

    /**
     * Exact Power Of 2
     */
    public static void exactPowerOf2() {
        int count = 0;
        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter int n: ");
            int n = sc1.nextInt();

            count++;
            if ((n & (n - 1)) == 0) {
                System.out.println("number: " + n);
                break;
            }
        }
        System.out.println("count: " + count);
    }

    /**
     * Multiple Of Two In Descending
     *
     * @param n
     */
    public static void multipleOfTwoInDescending(int n) {
        while (true) {
            if (n >= 0) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }

                n--;
            } else {
                break;
            }
        }
    }

    /**
     * Integers In Descending
     *
     * @param n
     */
    public static void integersInDescending(int n) {

        while (true) {
            if (n > 0) {
                System.out.println(n);
                n--;
            } else {
                break;
            }
        }

    }

    /**
     * Integer Powers
     *
     * @param n
     */
    public static void integerPowers(int n) {
        int i = 1;
        while (true) {
            if ((i & (i - 1)) == 0) {
                if (i <= n) {
                    System.out.println(i);
                } else {
                    break;
                }

            }
            i++;
        }
    }

    /**
     * Smallest Natural Divisor
     *
     * @param n
     */
    public static void smallestNaturalDivisor(int n) {
        if (n > 2) {
            int i = 2;
            while (true) {
                if (n % i == 0) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
    }

    /**
     * while break
     */
    public static void loopWhile(int n) {
        int i = 1;
        while (true) {

            System.out.println(i);
            i++;
            if (i == 11) {
                break;
            }
        }
        int j = 1;
        while (true) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
            if (j == 21) {
                break;
            }
        }
        int e = 1;
        while (true) {
            int a = e * e;
            if (a > n) {

                break;
            }
            System.out.println(a);
            e++;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        loopWhile(n);

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        smallestNaturalDivisor(n);

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        integerPowers(n);

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        integersInDescending(n);

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        multipleOfTwoInDescending(n);


//        exactPowerOf2();

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        smallestIntegerK(n);

//        tableAscii();

//        System.out.println("Enter int n: ");
//        int n = sc.nextInt();
//        multipleOfThree(n);

//        System.out.println("Enter int a: ");
//        int a = sc.nextInt();
//        fibonacci(a);

//        System.out.println("Enter int n: ");
//        float n = sc.nextFloat();
//        System.out.println("Enter int m: ");
//        float m = sc.nextFloat();
//        athlete(n,m);

//        System.out.println("Enter int x: ");
//        int x = sc.nextInt();
//        System.out.println("Enter int p: ");
//        float p = sc.nextFloat();
//        System.out.println("Enter int y: ");
//        int y = sc.nextInt();
//        bank(x, p, y);

//        secondLargestElement();

//        randomNumber();


        sumDigit();

    }
}
