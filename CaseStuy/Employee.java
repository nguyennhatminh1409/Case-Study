public class Employee {
    String id;
    String name;
    private int age;
    private String phonenumber;
    private String email;
    //Contructer
    public Employee(String id, String name, int age, String phonenumber, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public Employee() {
    }

    //Gán Getter và Setter cho các thuộc tính
    public String getMaNhanVien(){
        return id;
    }
    public void setMaNhanVien(String id){
        this.id = id;
    }
    public String getHoTen(){
        return name;
    }
    public void setHoTen(String name){
        this.name = name;
    }
    public int getTuoi(){
        return age;
    }
    public void setTuoi(int age){
        this.age = age;
    }
    public String getSoDienThoai(){
        return phonenumber;
    }
    public void setSoDienThoai(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getPaymen() {
        return 0;
    }
}
