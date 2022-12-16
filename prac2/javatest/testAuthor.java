package javatest;

public class testAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Petrov", "Ivanpetrov@mail.ru", 'M');
        System.out.println(a1.toString());
        a1.setEmail("ivPetrov@gmail.com");
        System.out.println(a1.toString());
    }
}
