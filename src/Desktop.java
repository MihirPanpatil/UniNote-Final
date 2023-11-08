import java.net.URI;

public interface Desktop {

    void browse(URI uri);

    static Desktop getDesktop() {
        return null;
    }

}
