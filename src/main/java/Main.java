public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Ольга";
        post.passport = "4444 № 44444444";
        post.patronymic = "Викторовна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванова";
        post.subscription = "true";
        System.out.println(post.name);
    }
}
