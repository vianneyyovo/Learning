
public class SystemPath {
    public static void main(String[] args) {
        String pathName = args[0];

        String pathNameConverter = pathName.toUpperCase();

        String path = System.getenv(pathNameConverter);

        System.out.println(path);
    }
}
