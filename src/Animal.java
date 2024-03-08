public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    public Animal(String type, String name, Size size, String specialCare) {
        setType(type);
        setName(name);
        setSize(size);
        setSpecialCare(specialCare);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        if (size == Size.SMALL){
            this.size = Size.SMALL;
        }else if (size == Size.BIG){
            this.size = Size.BIG;
        }
    }

    public String getSpecialCare() {
        return specialCare;
    }

    public void setSpecialCare(String specialCare) {
        this.specialCare = specialCare;
    }
}
