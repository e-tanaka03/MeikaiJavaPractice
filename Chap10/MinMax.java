public class MinMax {
    public static int max(int a, int b){
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static long max(long a, long b){
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static float max(float a, float b){
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static double max(double a, double b){
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static int max(int a, int b, int c){
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }

    public static long max(long a, long b, long c){
        long max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }

    public static float max(float a, float b, float c){
        float max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }

    public static double max(double a, double b, double c){
        double max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }

    public static int max(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static long max(long[] a){
        long max = a[0];
        for(int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static float max(float[] a){
        float max = a[0];
        for(int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static double max(double[] a){
        double max = a[0];
        for(int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static int min(int a, int b){
        if (a < b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static long min(long a, long b){
        if (a < b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static float min(float a, float b){
        if (a < b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static double min(double a, double b){
        if (a < b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static int min(int a, int b, int c){
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static long min(long a, long b, long c){
        long min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static float min(float a, float b, float c){
        float min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static double min(double a, double b, double c){
        double min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static int min(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }

    public static long min(long[] a){
        long min = a[0];
        for(int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }

    public static float min(float[] a){
        float min = a[0];
        for(int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }

    public static double min(double[] a){
        double min = a[0];
        for(int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }
}
