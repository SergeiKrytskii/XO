package edu.kpi.hexlet.XO;

import edu.kpi.hexlet.XO.model.Field;
import edu.kpi.hexlet.XO.model.Figure;
import edu.kpi.hexlet.XO.model.Point;

import java.util.Random;

public class XORunner {
    public static void main(String[] args) {
// jaax!
        final Field field = new Field();
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                field.setFigure(new Point (i , j) , Figure.X);
                System.out.print(field.getFigure(new Point(i, j))+ " ");
            }
            System.out.println();
        }

        field.setFigure(getMoveCoor(field), Figure.O);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field.getFigure(new Point(i, j))+ " ");
            }
            System.out.println();
        }
    }


        public static Point getMoveCoor (final Field field){
            Random r = new Random();
            if (checkField(field)!= 1)
                return new Point(1 , 1);
            else{
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if ((field.getFigure(new Point(i , j)) == null) && (field.getFigure(new Point(j , i)) == null))
                            return new Point(i,j);
                    }
            }
            }
            return null;

    }

        public static int checkField (final Field field){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 ; j++) {
                    if (field.getFigure(new Point(i , j))!= null)
                        return 1;
                }
            }
            return 0;
        }
//        final char[] chars = {1 ,2 ,3 ,4 ,5};
//        String st ;
//        String str = "" + chars[2];
//        System.out.println(str);
////        int a;
////        char c;
////        for (int i = 0; i < chars.length; i++) {
////            c = chars[i];
////            a = Integer.valueOf(String.valueOf(c));
////        }
////        System.out.println(fromString(chars));
//    }
//
//    public static int fromString(final char[] chars) {
//        // BEGIN (write your solution here)
//        String st = "";
//        if (chars.length == 0)
//            return 0;
//        for (int i = 0; i < 4; i++ ){
//            st+= String.valueOf(chars[i]);
//            System.out.println(st);
//        }
//        return 1;
//        // END
    }

