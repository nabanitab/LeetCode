package coreJava.deepCloning;


class DeepCopy implements Cloneable {
    private int[] data;

    public DeepCopy(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy clone = (DeepCopy) super.clone();
        clone.data = data.clone();
        return clone;
    }
}
