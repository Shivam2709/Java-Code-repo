package RecursionMasterClass;

public class NumberToWords {

    public static String convertToWords(int num){
        if(num == 0){
            return "Zero";
        }
        if(num < 0){
            return "minus" + convertToWords(Math.abs(num));
        }

        String words = "";

        //Check for lac
        if(num/100000 > 0) {
            words = words + convertToWords(num/100000) + " " + "lacs";
            num = num%100000;
        }

        //chack for Thousands
        if(num/1000 > 0) {
            words = words + convertToWords(num/1000) +" "+ "thousand";
            num = num % 1000;
        }

        // Hundred
        if(num/100 > 0) {
            words = words + convertToWords(num/100) +" "+ "hundred";
            num = num % 100;
        }

        // Take care of number less than hundred.
        if(num > 0) {
            String [] unitMaps = {"zero", "one", "two", "three", "four", "five","six", "seven",
                                    "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                                    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

            String [] tensMap = {"zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
                                    "eighty", "ninety"};

            if(num < 20) {
                words = words + " " + unitMaps[num];
            }else {
                words = words + " "+tensMap[num/10];
                if(num % 10 > 0) {
                    words = words + " " + unitMaps[num%10];
                }
            }
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(convertToWords(123456));
    }
}
