package com.company;
//    1) Write a Java program to handle each of the following exception during execution. Write
//    a suitable finally block for the selected exceptions wherever found appropriate.
//    a) InterruptedException
//    b) ArrayIndexOutOfBoundsException
//    c) IllegalArgumentException
//    d) IndexOutOfBoundsException
//    e) NegativeArraySizeException
//    f) NullPointerException
//    g) IllegalAccessException
import java.util.ArrayList;
import java.util.List;

public class Operation1 {
    //    b) ArrayIndexOutOfBoundsException
    void ArrayIndexOutOfBoundsException()
    {
        int arr[]=new int[]{12,23,45,56};

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }

           finally {
                System.out.println("we cant access out of the array");

        }

    }

    void  illegalArgument(int marks)
    {
        try {
            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException();
            System.out.println(marks);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Value displayed within range, end of function reached");
        }

    }




    public void string() {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        try {
            for (int i = 0; i <= l.size(); i++) {
                System.out.println(l.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("String elements displayed, end of function reached");
        }
       }

       void createArray(int size) {
           try {
               int[] arr = new int[size];
               for (int i = 0; i < arr.length; i++) {
                   arr[i] = i;
                   System.out.println(arr[i]);
               }
           } catch (NegativeArraySizeException e) {
               System.out.println(e.getMessage());
           } finally {
               System.out.println("Array elements displayed if size isn't negative, end of function reached");
           }
       }


           void displayString(String str) {
               try {
                   System.out.println("First character of string is " + str.charAt(0));
               } catch (NullPointerException e) {
                   System.out.println(e.getMessage());
               }
               finally {
                   System.out.println("First character displayed if argument isn't null, end of function reached");
               }
           }
    static void one() throws IllegalAccessException {
        System.out.println("Inside One");
        throw new IllegalAccessException(" Demo ");
    }
       void  illegalAcessExecption()
       {
           //    g) IllegalAccessException
           try {
               one();
           }

           catch (IllegalAccessException e) {
               System.out.println("Caught" + e);
           }
           finally {
               System.out.println("illegal execption caught and procedded");
           }

       }



}





