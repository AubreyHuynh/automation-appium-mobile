import java.util.regex.*;

public class Lab_06_04 {
    public static void main(String[] args) {
        String url = "https://google.net";
        analyzeURL(url);
    }

    public static void analyzeURL(String url) {
        // Check if the URL starts with "http://" or "https://"
        if (url.startsWith("http://")) {
            System.out.println("Protocol: HTTP");
        } else if (url.startsWith("https://")) {
            System.out.println("Protocol: HTTPS");
        } else {
            System.out.println("Invalid URL. Protocol not specified.");
            return;
        }

        // Extract domain name
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(".", startIndex);

        // Validate domain format
        String domainName = url.substring(startIndex, endIndex);
        if (!isValidDomain(domainName)) {
            System.out.println("Invalid domain format.");
            return;
        }

        System.out.println("Domain Name: " + domainName);

        // Check if the URL ends with ".com" or ".net"
        if (url.endsWith(".com")) {
            System.out.println("Top-level domain: .com");
        } else if (url.endsWith(".net")) {
            System.out.println("Top-level domain: .net");
        } else {
            System.out.println("Unsupported top-level domain.");
        }
    }

    // Function to validate domain format
    public static boolean isValidDomain(String domain) {
        String domainPattern = "^[a-zA-Z0-9-\\.]+$"; // Regex pattern for domain validation
        Pattern pattern = Pattern.compile(domainPattern);
        Matcher matcher = pattern.matcher(domain);
        return matcher.matches();
    }
}
