package ca.ciccc.assignment5.question3;

import java.util.ArrayList;

public class Question3 {
    private final static String EQUATION_FACTOR = "x";

    public void invoke() {
        System.out.println("CHECK 5*x^4 and 5*x^4:");
        System.out.println(checkSingleFactorEquality("5*x^4", "5*x^4"));
        System.out.println(checkMultiFactorPolynomialsEquality("5*x^4", "5*x^4"));
        System.out.println("CHECK 6*x^9 and 8*x^4:");
        System.out.println(checkSingleFactorEquality("6*x^9", "8*x^4"));
        System.out.println(checkMultiFactorPolynomialsEquality("6*x^9", "8*x^4"));
        System.out.println("CHECK 6*x^45 and 5*x^4:");
        System.out.println(checkSingleFactorEquality("6*x^45", "5*x^4"));
        System.out.println(checkMultiFactorPolynomialsEquality("6*x^45", "5*x^4"));
        System.out.println("CHECK THE BIGGEST EXPONENT: 10*x^5 + 8*x^4 + x^2 + 6:");
        System.out.println(biggestExponent(" 10*x^5 + 8*x^4 + x^2 + 6 "));
        System.out.println("ADD 2 POLYNOMIALEQUATIONS: 10*x^5 + 8*x^4 + x^2 + 6 and 9*x^6 + 8*x^4 + x^2 + 6 :");
        System.out.println(addTwoFunctios("10*x^5 + 8*x^4 + x^2 + 6", "9*x^6 + 8*x^4 + x^2 + 6"));
    }

    public static String addTwoFunctios(String PolynomialEquations1,String PolynomialEquations2) {
        String PolynomialEquation = PolynomialEquations1.concat("+");
        PolynomialEquation = PolynomialEquation.concat(PolynomialEquations2);
        return PolynomialEquation;
    }

    public static boolean checkMultiFactorPolynomialsEquality(String multiPolynomialFactor1,String multiPolynomialFactor2) {
        ArrayList<Integer[]> PolynomialFactor1Array = convertSinglePolynomialFactorToArray(multiPolynomialFactor1);
        ArrayList<Integer[]> PolynomialFactor2Array = convertSinglePolynomialFactorToArray(multiPolynomialFactor2);

        if(multiPolynomialFactor1.length() != multiPolynomialFactor2.length()) {
            return false;
        } else {
            for(int i = 0; i < PolynomialFactor1Array.size(); i++) {
                Integer[] SingleFactor1 = PolynomialFactor1Array.get(i);
                Integer[] SingleFactor2 = PolynomialFactor2Array.get(i);

                if(SingleFactor1[i] != SingleFactor2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Integer biggestExponent(String polynomialEquation) {
        int degree = 0;
        int TotalDegree = 0;
        for(int i = 0; i < polynomialEquation.length(); i++) {
            if(polynomialEquation.charAt(i) == '^') {
                degree = Integer.parseInt(String.valueOf(polynomialEquation.charAt(i + 1)));
                if(TotalDegree < degree) {
                    TotalDegree = degree;
                }
            }
        }
        return TotalDegree;
    }

    public static ArrayList<Integer[]> convertSinglePolynomialFactorToArray(String polynomialFactor) {
        ArrayList<Integer[]> multiFactorPolynomial = new ArrayList<>();
        String singleFactor = "";
        for(int i = 0; i < polynomialFactor.length(); i++) {
            if(polynomialFactor.charAt(i) == '-' || polynomialFactor.charAt(i) == '+') {
                if(singleFactor.length() > 4) {
                    Integer[] singleFactorArray = convertSinglePolynomialFactorToAnArray(singleFactor);
                    multiFactorPolynomial.add(singleFactorArray);
                    singleFactor = "";
                } else {
                    singleFactor = singleFactor + polynomialFactor.charAt(i);
                }
            }
        }
        return multiFactorPolynomial;
    }

    public static boolean checkSingleFactorEquality(String singleFactor1, String singleFactor2) {
        Integer[] singleFactor1Array = convertSinglePolynomialFactorToAnArray(singleFactor1);
        Integer[] singleFactor2Array = convertSinglePolynomialFactorToAnArray(singleFactor2);

        if(((singleFactor1Array[0].equals(singleFactor2Array[0])) && (singleFactor2Array[1].equals(singleFactor1Array[1])))) {
            return true;
        }

        return false;
    }

    public static Integer[] convertSinglePolynomialFactorToAnArray(String singlePolynomialFactor) {
        final int DEFAULT_COEFFICIENT = 0;
        final int DEFAULT_EXPOENT = 0;

        Integer[] singlePolynomialFactorComponents = {DEFAULT_COEFFICIENT, DEFAULT_EXPOENT};
        int indexOfExponent = singlePolynomialFactor.indexOf('^');
        int indexOfMultiplication = singlePolynomialFactor.indexOf('*');

        String coefficientString = singlePolynomialFactor.substring(0, indexOfMultiplication);
        String exponentString = singlePolynomialFactor.substring(indexOfExponent + 1, singlePolynomialFactor.length());

        Integer coefficient = Integer.valueOf(coefficientString);
        Integer exponent = Integer.valueOf(exponentString);

        singlePolynomialFactorComponents[0] = coefficient;
        singlePolynomialFactorComponents[1] = exponent;

        return singlePolynomialFactorComponents;
    }
}
