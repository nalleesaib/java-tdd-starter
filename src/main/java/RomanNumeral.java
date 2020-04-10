//
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class RomanNumeral {
//
//    public static String convert(int arabicNumber) {
//
////        switch (arabicNumber) {
////            case 1:
////                return "I";
////            case 4:
////                return "IV";
////            case 9:
////                return "IX";
////            case 3:
////                return "III";
////            case 6:
////                return "VI";
////            case 7:
////                return "VII";
////            case 8:
////                return "VIII";
////            case 10:
////                return "X";
////            default:
////                return "V";
////        }
//
//        return getRomanNumber(arabicNumber);
//    }
//
//    private static Map<Integer, String> getRomanBasicNumber() {
//        Map<Integer, String> basicRomanData = new HashMap<>();
//        basicRomanData.put(1, "I");
//        basicRomanData.put(2, "II");
//        basicRomanData.put(3, "III");
//        basicRomanData.put(4, "IV");
//        basicRomanData.put(5, "V");
//        basicRomanData.put(6, "VI");
//        basicRomanData.put(7, "VII");
//        basicRomanData.put(8, "VIII");
//        basicRomanData.put(9, "IX");
//        basicRomanData.put(10, "X");
//        basicRomanData.put(40, "XL");
//        basicRomanData.put(50, "L");
//        basicRomanData.put(90, "XC");
//        basicRomanData.put(100, "C");
//        basicRomanData.put(400, "CD");
//        basicRomanData.put(500, "D");
//        basicRomanData.put(900, "CM");
//        basicRomanData.put(1000, "M");
//
//        return basicRomanData;
//    }
//
//    private static String getRomanNumber(Integer arabicNumber){
//
//        if(arabicNumber <= 10 ){
//            return getRomanBasicNumber().get(arabicNumber);
//        }
//
//
//        //getRoman Basic Datas Key
//        Set<Integer> keys = getRomanBasicNumber().keySet();
//        StringBuilder convertedNumber = new StringBuilder();
//        for (Integer key : keys) {
//            int valForKey = 0;
//            while(arabicNumber >= key){
//                valForKey++;
//                arabicNumber -= key;
//            }
//
//            for (int i = 1; i <= valForKey ; i++) {
//                convertedNumber.append(getRomanBasicNumber().get(key));
//            }
//        }
//
//        return  convertedNumber.toString();
//    }
//}
