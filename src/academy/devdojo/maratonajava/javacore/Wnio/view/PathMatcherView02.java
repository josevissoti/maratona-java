package academy.devdojo.maratonajava.javacore.Wnio.view;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListClassFiles extends SimpleFileVisitor<Path> {
    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*,View*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (pathMatcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    private void mathcer(Path path, String glob) {
        System.out.println(pathMatcher);
    }
}

public class PathMatcherView02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListClassFiles());
    }
}
