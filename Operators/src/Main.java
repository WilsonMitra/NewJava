class Arithmeticoperator {

    public static void main (String[] args){
        int result = 1+2;
        System.out.println(" 1+2 = " + result);
        // now the result is 3

        int original_result =  result; // now here the original_result value is 3
        //using substration operator
        result = result-1;
        System.out.println( original_result + "-1=" + result);
        // now the result is 2

        original_result = result;
        // using multiplication operator

        result = result * 2;
        System.out.println( original_result+ "*2=" + result);
        // now the result is 4

        original_result = result;
        // using division operator

        result = result/2;
        System.out.println(original_result+ "/2=" + result);
        // now the result is 2

        original_result = result;
        // using modulus operator and modulus gives you the remainder and not the quotient
        result = result%2;
        System.out.println(original_result+"%2=" + result);

    }
}
