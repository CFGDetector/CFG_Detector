public class test7 {
    protected long fValue1 = getValue(1 + 3);

    private long getValue(int i) {
        return System.currentTimeMillis() * i;
    }
}