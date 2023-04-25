class Rome {
    static String units(int units) {
        String result = "";
        switch (units) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
        }

        return result;
    }

    static String tens(int tens) {
        String result = "";
        switch (tens) {
            case 1:
                result = "X";
                break;
            case 2:
                result = "XX";
                break;
            case 3:
                result = "XXX";
                break;
            case 4:
                result = "XL";
                break;
            case 5:
                result = "L";
                break;
            case 6:
                result = "LX";
                break;
            case 7:
                result = "LXX";
                break;
            case 8:
                result = "LXXX";
                break;
            case 9:
                result = "XC";
                break;
        }

        return result;
    }

    static String hundreds(int hundreds) {
        String result = "";
        switch (hundreds) {
            case 1:
                result = "C";
                break;
        }

        return result;
    }

    static String convertToRome(int number) {
        int units = number % 10;
        int tens = (number % 100) / 10;
        int hundreds = (number % 1000) / 100;

        return hundreds(hundreds) + tens(tens) + units(units);
    }

    static int convertToArab(String number) {
        int result = 0;
        switch (number) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
        }

        return result;
    }
}
