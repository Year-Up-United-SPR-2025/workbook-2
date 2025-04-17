package com.pluralsight;

public class Main2 {
    public static void main(String[] args) {

//        String trackingCode = "USA-12981-Y-22";
//                             //0123456789A123
//
//        char hasShipped = trackingCode.charAt(10);
//        // hasShipped contains 'Y
//
//        String productCode = "ACME-12213";
//                            //0123456789
//        int dashPosition = productCode.indexOf("-");
//        // dashPosition contains 4

        /// /////////////////////////////////

        String productCode = "ACME-12213";
        String productCode1 = "ACME-3293";
        String productCode2 = "STANDARDCO-113";
        String productCode3 = "STANDARDCO-1213";

        //                    012356789
        int dashPosition = productCode.indexOf("-");
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
// vendor contains ACME and productNum contains 12213
    }
}
