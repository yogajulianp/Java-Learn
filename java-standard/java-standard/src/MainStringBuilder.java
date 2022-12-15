public class MainStringBuilder {
    public static void main(String[] args) {
        String firstName = "Yoga";
        String lastName = "Prasutiyo";


        //dengan string builder akan lebih baik dimemory
        StringBuilder builder = new StringBuilder(firstName)
                .append(" ").append(lastName);
        System.out.println("Builder " +builder);
    }
}
