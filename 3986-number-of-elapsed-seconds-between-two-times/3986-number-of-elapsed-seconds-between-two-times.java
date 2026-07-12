class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int T_startsec =0;
        String hrs = startTime.substring(0,2);
        int hrs_int = Integer.parseInt(hrs);
        T_startsec+= hrs_int*3600;

        String min = startTime.substring(3,5);
        int min_int = Integer.parseInt(min);
        T_startsec+= min_int*60;

        String sec = startTime.substring(6,8);
        int sec_int = Integer.parseInt(sec);
        T_startsec+= sec_int;


        int T_endsec =0;
        String hrs_e = endTime.substring(0,2);
        int hrs_int_e = Integer.parseInt(hrs_e);
        T_endsec+= hrs_int_e*3600;

        String min_e = endTime.substring(3,5);
        int min_int_e = Integer.parseInt(min_e);
        T_endsec+= min_int_e*60;

        String sec_e = endTime.substring(6,8);
        int sec_int_e = Integer.parseInt(sec_e);
        T_endsec+= sec_int_e;

        return T_endsec-T_startsec;
    }
}