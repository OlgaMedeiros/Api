public class main {

        public static void main(String[] args) {
            Post post = new Post();

            post.name = "Иван";
            post.patronymic = "Иванович";
            post.surname = "Иванов";
            post.phone = "+7 (917)-215-26-89";
            post.passport = "6403 № 1241256";
            post.subscription = true;

            post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 16;
            post.birthday.year = 1999;


        }
    }

