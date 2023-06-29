package testing;

public class PaintJob {
    public static void main(String[] args) {
//        System.out.println(getBucketCount(1.5, 3.5, 2.0, 1));
        System.out.println(getBucketCount(-1.5, 3.5, 2.0, 1));
/*        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

 */
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket) {
        if (width < 0 || height < 0 || areaPerBucket < 0 || extraBucket < 0) {
            return -1;
        } else {
            double area = width * height;
            double numberofbucket = area / areaPerBucket;
            double buckets =numberofbucket - extraBucket;
            return (int) Math.ceil(buckets);
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        } else {
            double area = width * height;
            double numberofbucket = area / areaPerBucket;
            int nos = (int) Math.ceil(numberofbucket);
            return nos;
        }
    }

    public static int getBucketCount(double areaPerBucket, double area) {
        if (areaPerBucket <= 0 || area <=0) {
            return -1;
        } else {
            double q = areaPerBucket / area;
            int nos = (int) Math.ceil(q);
            return nos;
        }
    }
}
