package main.java.com.stackroute.pe2;
import java.util.Scanner;
    public class Frequency {
        //To find the frequency in a given string
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the sentence");
            String str = scan.nextLine();
            String[] keys = str.split(" ");
            String[] uniqueKeys;
            int count = 0;
            System.out.println(str);
            uniqueKeys = getUniqueKeys(keys);

            for (String key : uniqueKeys) {
                if (null == key) {
                    break;
                }
                for (String s : keys) {
                    if (key.equals(s)) {
                        count++;
                    }
                }
                System.out.println("Count of [" + key + "] is : " + count);
                count = 0;
            }
        }

        private static String[] getUniqueKeys(String[] keys) {
            String[] uniqueKeys = new String[keys.length];

            uniqueKeys[0] = keys[0];
            int uniqueKeyIndex = 1;
            boolean keyAlreadyExists = false;

            for (int i = 1; i < keys.length; i++) {
                for (int j = 0; j <= uniqueKeyIndex; j++) {
                    if (keys[i].equals(uniqueKeys[j])) {
                        keyAlreadyExists = true;
                    }
                }

                if (!keyAlreadyExists) {
                    uniqueKeys[uniqueKeyIndex] = keys[i];
                    uniqueKeyIndex++;
                }
                keyAlreadyExists = false;
            }
            return uniqueKeys;
        }
    }