public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0) {
            return -1;
        }
        else {
            int buckets = (int) Math.round(width*height/areaPerBucket) - extraBuckets;
            if(buckets > 0){
                return buckets;
            }
            else {
                return -1;
            }
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
       return getBucketCount(width, height, areaPerBucket, 0);
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
