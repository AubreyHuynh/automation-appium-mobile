package Java.Labs.lab_6;

public class Lab_06_04 {
    public static void main(String[] args) {
        String url = "https://google.com";
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
        String domainName = url.substring(startIndex, endIndex);
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
}
