package main.java.com.stackroute.pe2;
public class StudentAvgGrade {
        /*
        This method will compute Minimum of Student Grades
         */
        public int studentMin(int number,int studentArray[])
        {
            int minStudent=studentArray[0];
            for( int i=1; i<number; i++)
            {
                if( (studentArray[i] > 100) || (studentArray[i] < 1) )
                {
                    return -1;
                }

                if( minStudent > studentArray[i] )
                {
                    minStudent =studentArray[i];

                }
            }
            return minStudent;
        }

        /*
        This method will compute Maximum of Student Grades
         */
        public int studentMax(int number,int studentArray[])
        {
            int maxStudent=studentArray[0];
            for( int i=1; i<number; i++)
            {
                if( (studentArray[i] > 100) || (studentArray[i] < 1) )
                {
                    return -1;
                }

                if( maxStudent < studentArray[i])
                {
                    maxStudent =studentArray[i];
                }
            }
            return maxStudent;
        }

        /*
        This method will compute Average of Student Grades
         */
        public String studentAvg(int number,int studentArray[])
        {
            double avgStudent;
            double sum=0;
            for( int i=0; i<number ;i++ )
            {
                if( (studentArray[i] > 100) || (studentArray[i] < 1) )
                {
                    return "-1";
                }
                sum=sum+studentArray[i];
            }
            avgStudent=sum/number;
            return Double.toString(avgStudent)+"0";
        }

    }
