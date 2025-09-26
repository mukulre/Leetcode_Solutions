 class Main {
    public static void main(String[] args) {
        String name = "  Hello Java Learners  ";
        String sample = "Java is fun. Java is powerful.";

        System.out.println("Length: " + name.length());
        System.out.println("Char at 2: " + name.charAt(2));
        System.out.println("Substring from 2: " + name.substring(2));
        System.out.println("Substring 2 to 7: " + name.substring(2, 7));
        System.out.println("Index of 'Java': " + name.indexOf("Java"));  
        System.out.println("Last Index of 'Java': " + sample.lastIndexOf("Java"));
        System.out.println("Contains 'Learn': " + name.contains("Learn"));
        System.out.println("Starts with '  He': " + name.startsWith("  He"));
        System.out.println("Ends with 'ners  ': " + name.endsWith("ners  "));
        System.out.println("Matches regex '.Java.': " + name.matches(".Java."));
        System.out.println("To Lower Case: " + name.toLowerCase());
        System.out.println("To Upper Case: " + name.toUpperCase());
        System.out.println("Trimmed: " + name.trim());
        System.out.println("Replace 'Java' with 'Python': " + name.replace("Java", "Python"));
        System.out.println("ReplaceAll 'Java' with 'C++': " + sample.replaceAll("Java", "C++"));
        System.out.println("ReplaceFirst 'Java' with 'Kotlin': " + sample.replaceFirst("Java", "Kotlin"));
        String another = "hello java learners";
        System.out.println("Equals: " + name.equals(another));
        System.out.println("Equals Ignore Case: " + name.trim().equalsIgnoreCase(another));
        System.out.println("CompareTo: " + name.compareTo(another));
        System.out.println("CompareTo Ignore Case: " + name.compareToIgnoreCase(another));
        String[] parts = sample.split(" ");
        System.out.println("Split result:");
        for (String part : parts) {
            System.out.println(part);
        }
        String joined = String.join("-", "One", "Two", "Three");
        System.out.println("Joined string: " + joined);
        char[] charArray = name.toCharArray();
        System.out.print("Char Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        String strFromValue = String.valueOf(12345);
        System.out.println("ValueOf example: " + strFromValue);

        String formatted = String.format("I have %d apples and %d oranges", 2, 3);
        System.out.println("Formatted string: " + formatted);
    }
}
