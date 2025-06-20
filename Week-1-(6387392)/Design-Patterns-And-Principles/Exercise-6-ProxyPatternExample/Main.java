public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        image1.display();
        image1.display();

        Image image2 = new ProxyImage("photo2.jpg");
        image2.display();
    }
}
