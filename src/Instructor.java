public class Instructor extends User{
    private int imageId;
    private String teaching;
    private String appellation;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String nationalId, int imageId) {
        super(id, firstName, lastName, nationalId);
        this.imageId = imageId;
    }

    public Instructor(int id, String firstName, String lastName, String nationalId, int imageId, String teaching, String appellation) {
        super(id, firstName, lastName, nationalId);
        this.imageId = imageId;
        this.teaching = teaching;
        this.appellation = appellation;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }
}
