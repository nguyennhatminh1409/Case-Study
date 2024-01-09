import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private int id;

    public MenuItem(int id, String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
        List<MenuItem> menu = new ArrayList<>();

        // Thêm món vào menu
        MenuItem coffee = new MenuItem(1,"Cafe Đen", 18,"đồ uống");
        menu.add(coffee);

        MenuItem cafeSua = new MenuItem(2,"Cafe Sữa", 20, "đồ uống");
        menu.add(cafeSua);

        MenuItem bacXiu = new MenuItem(3,"Bạc Xỉu", 25, "đồ uống");
        menu.add(bacXiu);

        MenuItem bacXiuNong = new MenuItem(4,"Bạc Xỉu Nóng", 25, "đồ uống");
        menu.add(bacXiuNong);

        MenuItem traDao = new MenuItem(5,"Trà Đào", 20, "đồ uống");
        menu.add(traDao);

        MenuItem banhSocola = new MenuItem(6,"Bánh Socola", 20, "đồ ăn");
        menu.add(banhSocola);

        MenuItem banhMatcha = new MenuItem(7,"Bánh Matcha", 20, "đồ ăn");
        menu.add(banhMatcha);

        // In ra danh sách menu trước khi sửa
        System.out.println("Danh sách menu trước khi sửa:");
        for (MenuItem item : menu) {
            System.out.println(item.getId() + ".");
            System.out.println("Tên món: " + item.getName());
            System.out.println("Giá: " + item.getPrice());
            System.out.println("Danh mục: " + item.getCategory());
        }

        // Sửa thông tin món trong menu
//        coffee.setPrice(3.0);
//        for (MenuItem item : menu) {
//            System.out.println("ID");
//            System.out.println("Tên món: " + item.getName());
//            System.out.println("Giá: " + item.getPrice());
//            System.out.println("Danh mục: " + item.getCategory());
//        }

        // Xóa món khỏi menu
        Scanner sc = new Scanner(System.in);
        int ic = sc.nextInt();

        menu.remove(ic - 1);

        // In ra danh sách menu sau khi xóa
        System.out.println("Danh sách menu sau khi xóa:");
        for (MenuItem item : menu) {
            System.out.println("Tên món: " + item.getName());
            System.out.println("Giá: " + item.getPrice());
            System.out.println("Danh mục: " + item.getCategory());
        }
    }
}
