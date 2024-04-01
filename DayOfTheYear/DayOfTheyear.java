class DayOfTheyear {
    
    public static  int dayOfYear(String date) {
        String str[] = date.split("-");
        int sum = 0;
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
                while(month>=1)
        {
            if(day!=0){
                sum+=day;
                day = 0;
                month--;
            }
            for(int i = month-1;i>=0;i--)
            {

                if(i == 1)
                {
                    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                        sum+=60;
                        return sum;
                    }else
                    {
                        sum+=59;
                        return sum;
                    }

                    
                }
                else{
                    sum+=days[i];
                }
            }

            month--;
        }

        return sum;
    }
    public static void main(String[] args) {
        String date = "2024-03-10";
        System.out.println(dayOfYear(date));
    }
}