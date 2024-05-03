public class Classroom{
 //=====================================================================================================================
 public static int TargetVal(int num[],int target){
     for (int i=0;i<num.length;i++){
         if (num[i]==target) {
             return i;
         }

     } return -1;
 }

 //=====================================================================================================================


    public static StringBuffer reverseString(String s){
        StringBuffer sb= new StringBuffer(s);

        return sb.reverse();

    }
 //=====================================================================================================================
    public static void changeCase(String s){
        String s1=s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(s1);
        String str2=s.toUpperCase();

        System.out.println(str2);
    }
 //=====================================================================================================================

    public static int[] decrementArrayElements(int[] numbers){
        for(int i=0;i<=numbers.length;i++){
            numbers[i]--;
            System.out.print(numbers[i]+" ");
            break;
        }
        return numbers;
    }
 //=====================================================================================================================
    public int largest(int arr[], int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        } return max;
 //=====================================================================================================================
    public static double posAverage(int[] numbers) {
        int count=0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=0){
                 count++;

            sum += numbers[i]; }
        }
            double avg = (double) sum / count;

        return avg;
    }
 //=====================================================================================================================
    public static int arraySum(int[] numbers){
           int sum=0;
     for(int i=0;i<numbers.length;i++){
         sum+=numbers[i];
     }

      return sum;
    }



        public static void arrayTraversalReverse ( int[] numbers){
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
        public static void arrayTraversal ( int[] numbers){
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        public static int arrayLength ( int[] numbers){
            return numbers.length;
        }
        public static String theGame ( int n){
            if (n % 2 == 0) {
                return "YOU";
            } else {
                return "OPP";
            }
        }


    public static int fibonacci(int n){


        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            int a=1, b=1;
            for(int i=2;i<=n;i++){
                int c=a+b;
                a=b;
                b=c;
            }

        }return n;
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }

        } return true;
    }
    public static void printPrimeFactorization(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;

                }
            }
        }


    }
    public static boolean is__Prime(int N){
        if(N==1)
            return false;
        for(int i=2; i<N;i++){
            if(N%2==0){
                return false;
            }

        } return true;
    }

    public static boolean is_Prime(int N) {
        if (N == 1)
            return false;
        if (N == 2 || N == 3)
            return true;
        if (N % 2 == 0 || N % 3 == 0)
            return false;
        for (int i = 5; i * i <= 5; i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    static int nextPrime(int n){
        if(n<=1)
            return 2;
        int Prime=n;
        boolean found=false;
        while(!found){
            Prime++;
            if(is_Prime(Prime))
                found=true;
        }
        return Prime;

    }


        public static void utility (String s){

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) % 2 == 0) {
                    System.out.print(s.charAt(i));
                }

            }
//        int i=x;
//        while(i>=0){
//            System.out.print(i+" ");
//            i--;
//        }
//        for(int i=x;i>=0;i--){
//            System.out.print(i+" ");
//        }

        }

        static void printTable ( int n){
            int multiplier = 10;
            while (multiplier > 0) {
                System.out.print(multiplier * n + " ");
                multiplier--;
            }
            System.out.println();
        }


        public static void triangle ( int s){
            for (int i = 0; i < s; i++) {
                for (int j = s; j > i; j--) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }

        }


    static int getPeak(int arr[]){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if( (mid == 0 || arr[mid - 1] <= arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]))
            return mid;
            if (mid > 0 && arr[mid-1]>=arr[mid])
                end=mid-1;
            else
                start=mid+1;
            }
        return -1;

        }


    static int majorityElement(int arr[]){
        int n=arr.length;
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i])
                count++;
        else
            count--;
        if (count == 0) {
            res = arr[i];
            count = 1;
          }
        }
            count=0;
        for(int i=0;i<n;i++)
            if (arr[res]==arr[i])
                count++;
        if(count<n/2)
            res=-1;
        return res;
        }


    static int maxConsecutive(int arr[]){
        int res=0,curr=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curr=0;
            }else{
                curr++;
                res=Math.max(curr,res);
            }
        }
        return res;
    }


    static int maxProfit(int price[]){
        int n= price.length;
        int profit=0;
        for(int i=1;i<n;i++) {
            if (price[i] > price[i - 1])
                profit += (price[i] - price[i - 1]);

        }
        return profit;
    }


    static int trappingWater(int arr[]){
        int n=arr.length;
        int res=0;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
            lmax[i]=Math.max(arr[i],lmax[i-1]);

            rmax[n-1]=arr[n-1];
            for(int i=n-2;i>=0;i--)
                rmax[i]=Math.max(arr[i],rmax[i+1]);

            for(int i=0;i<n-1;i++)
                res=res+(Math.min(lmax[i],rmax[i])-arr[i]);

            return res;

    }


    static int maxSum(int arr[]){
        int n= arr.length;
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=0;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }


    static int maxEven_0dd(int arr[]){
        int n= arr.length;
        int res=1,curr=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]==0)){
                curr++;
                res=Math.max(res,curr);

            } else{
                curr=1;
            }
        }
        return res;
    }


        public static void main (String[] gau){
        int arr[]={4,5,6,7,0,1,2};
        int x=TargetVal(arr,8);
            System.out.println(x);
        }

    }

