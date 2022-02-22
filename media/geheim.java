private static void _permutationen(String finiss, String remainder){
        if(remainder.length()==0){
        System.out.println(finiss);
        }else{
        for(int i=0;i<remainder.length();i++){
        char current=remainder.charAt(i);
        String newRemainder=remainder.substring(0,i)+remainder.substring(i+1,remainder.length());
        _permutationen(finiss+current,newRemainder);
        }
        }
        }


private static List<String> _permutationenNeu(String finiss, String remainder) {
        if (remainder.length() == 0) {
        return List.of(finiss);
        } else {
        ArrayList<String> sammeln = new ArrayList<>();

        for (int i = 0; i < remainder.length(); i++) {
        char current = remainder.charAt(i);
        String newRemainder = remainder.substring(0, i) + remainder.substring(i + 1, remainder.length());
        sammeln.addAll(_permutationenNeu(finiss + current, newRemainder));
        }

        return sammeln;
        }
}

public static List<String> permutationenNeu(String wort) {
        return _permutationenNeu("", wort);
}

List<String> woerter = permutationenNeu("help");
System.out.println(woerter);
