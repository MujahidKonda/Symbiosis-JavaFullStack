class displaysizeofdatatype{
    public static void main(String cp[]){
        System.out.println("S.No.\t Data Type\t Size\t Min. Value\t\t Max. Value\t");
        System.out.println("1\t Byte\t\t" + (Byte.SIZE / 8) + "\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("2\t Short\t\t" + (Short.SIZE / 8) + "\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("3\t Integer\t" + (Integer.SIZE / 8) + "\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("4\t Float\t\t" + (Float.SIZE / 8) + "\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("5\t Long\t\t" + (Long.SIZE / 8) + "\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE);
        System.out.println("6\t Double\t\t" + (Double.SIZE / 8) + "\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
        System.out.println("7\t Character\t" + (Character.SIZE / 8) + "\t" + (int) Character.MIN_VALUE + "\t\t" + (int) Character.MAX_VALUE);
    }
}