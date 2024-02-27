class Practice {
    public static void main(String[] args) {
        String name = "Batman";
        System.out.println("Superhero -> " + name);

        String name1 = new String("Robin");
        System.out.println("SideKick -> " + name1);

        String s1 = "Hello";
        String s2 = " World";

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb);

        sb.append(" World");

        System.out.println(sb);
    }
}