package main.java.com.stackroute.pe2;

public class PowerOfFour {
        /*This method is returning string after confirming whether it is
        power of 4 or not.
         */
        public String checkPowerOfFour(int number)
        {
            if(number == 0)
                return "Number is not a power of 4";
            while(number != 1)
            {
                if(number % 4 != 0)
                    return "Number is not a power of 4";
                number = number / 4;
            }
            return "Number is a power of 4";
        }

    }