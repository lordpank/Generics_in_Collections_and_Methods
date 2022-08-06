public class Main {

    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<>(4);

        magicBox1.add("Колбаса");
        magicBox1.add("Хлеб");
        magicBox1.add("Картошка");
        magicBox1.add("Вино");

        MagicBox<Integer> magicBox2 = new MagicBox<>(4);

        magicBox2.add(8000);
        magicBox2.add(752);
        magicBox2.add(5447);
        magicBox2.add(90562);

        System.out.println("Содержимое 1 коробки " + magicBox1.pick());
        System.out.println("Содержимое 1 коробки " + magicBox1.pick());
        System.out.println();
        System.out.println("Содержимое 2 коробки " + magicBox2.pick());
        System.out.println("Содержимое 2 коробки " + magicBox2.pick());
    }
}