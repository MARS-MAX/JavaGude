import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    private static final String RESOURCES = "src/resources/";

    public static void main(final String... args) throws IOException {
        final Path path = Paths.get(RESOURCES + args[0]);
        List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line: lines) {
            final String [] colums = line.split(",");
            final double amount = Double.parseDouble(colums[1]);
            total+=amount;
        }
        System.out.println("The total amount of all transactions is " +total);
    }
}
