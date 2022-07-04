public class Hw2 {
    public static void main(String[] args) {
        int[] arr = {12, 51, -7, 8, 2, -4, 4};
        // 211 //
        double pSum = 0;
        int countOfP = 0;
        for (int i : arr) {
            if (i >= 0) {
                pSum += i;
                countOfP++;
            }
        }
        double pAMean = pSum / countOfP;
        System.out.println(pAMean);

        // 214 //
        double nSum = 0;
        int countOfN = 0;
        for (int i : arr) {
            if (i <= 0) {
                nSum += i;
                countOfN++;
            }
        }
        double nAMean = nSum / countOfN;
        System.out.println(nAMean);

        // 212 //
        double pSMean = 1;
        for (int i : arr) {
            if (i >= 0) {
                pSMean *= i;
            }
        }
        pSMean /= countOfP;
        System.out.println(pSMean);

        // 213 //
        double nSMean = 1;
        for (int i : arr) {
            if (i <= 0) {
                nSMean *= i;
            }
        }
        nSMean /= countOfN;
        System.out.println(nSMean);

        // 215 //
        int evenIndexNSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexNSum += arr[i];
            }
        }
        System.out.println(evenIndexNSum);

        // 216 //
        int evenIndexNProd = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexNProd *= arr[i];
            }
        }
        System.out.println(evenIndexNProd);

        // 217 //
        int oddIndexNSSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 > 0) {
                oddIndexNSSum += arr[i] * arr[i];
            }
        }
        System.out.println(oddIndexNSSum);

        // 218 //
        int oddIndexNASum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 > 0) {
                int tempAbs;
                if (arr[i] < 0) {
                    tempAbs = -arr[i];
                } else {
                    tempAbs = arr[i];
                }
                oddIndexNASum += tempAbs;
            }
        }
        System.out.println(oddIndexNASum);

        // 219 //
        int k = 3;
        int kMCount = 0;
        for (int i : arr) {
            if (i % k == 0) {
                kMCount++;
            }
        }
        System.out.println(kMCount);

        // 220 //
        int nCount = 0, pCount = 0;
        for (int i : arr) {
            if (i < 0) {
                nCount++;
            } else {
                pCount++;
            }
        }
        System.out.println("-:" + nCount + " +:" + pCount);

        // 221 //
        int a = 1;
        int b = 8;
        int c = 7;
        int d = 15;
        int rangeSum1 = 0;
        for (int i :
                arr) {
            if (i >= a && i < b) {
                rangeSum1 += i;
            }
        }
        System.out.println(rangeSum1);

        // 222 //
        int rangeSum2 = 0;
        for (int i : arr) {
            if (i >= c && i < d) {
                rangeSum2 += i;
            }
        }
        System.out.println(rangeSum2);

        // 223 //
        int rangeCount = 0;
        for (int i : arr) {
            if (i > a && i < b) {
                rangeCount++;
            }
        }
        System.out.println(rangeCount);

        // 224 //
        int kASSum = 0;
        for (int i : arr) {
            int tempAbs;
            if (i < 0) {
                tempAbs = -i;
            } else {
                tempAbs = i;
            }
            if (tempAbs < k) {
                kASSum += tempAbs * tempAbs;
            }
        }
        System.out.println(kASSum);

        // 225 //
        int t = 10;
        int tASProd = 1;
        for (int i : arr) {
            int tempAbs;
            if (i < 0) {
                tempAbs = -i;
            } else {
                tempAbs = i;
            }
            if (tempAbs < t) {
                tASProd *= tempAbs;
            }
        }
        System.out.println(tASProd);

        // 226 //
        int kASCount = 0;
        for (int i : arr) {
            int tempAbs;
            if (i < 0) {
                tempAbs = -i;
            } else {
                tempAbs = i;
            }
            if (tempAbs < k) {
                kASCount++;
            }
        }
        System.out.println(kASCount);

        // 227 //
        double kIMAMean;
        double kIMAMeanSum = 0;
        int kIMAMCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                kIMAMeanSum += arr[i];
                kIMAMCount++;
            }
        }
        kIMAMean = kIMAMeanSum / kIMAMCount;
        System.out.println(kIMAMean);

        // 228 //
        int kIDSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                kIDSum += arr[i];
            }
        }
        System.out.println(kIDSum);

        // 229 //
        int iMVPosProd = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i - arr[i] > 0) {
                iMVPosProd *= arr[i];
            }
        }
        System.out.println(iMVPosProd);

        // 230 //
        double kMESMean;
        double kMESMeanProd = 1;
        int kMESCount = 0;
        for (int i : arr) {
            if (i % k == 0) {
                kMESMeanProd *= i;
                kMESCount++;
            }
        }
        kMESMean = kMESMeanProd / kMESCount;
        System.out.println(kMESMean);
    }
}
