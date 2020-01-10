class Cat {
    String name;

    public static void main(String[] args) {
        // make a Cat object and access it
        Cat Cat1 = new Cat();
        Cat1.meow();
        Cat1.name = "";

        // now make a Cat array
        Cat[] myCats = new Cat[3];
        // and put some Cats in it

        myCats[0] = new Cat();
        myCats[1] = new Cat();
        myCats[2] = Cat1;

        // now access the Cats using the array references

        myCats[0].name = "Doogert";
        myCats[1].name = "Broccoli";

        // What is myCats[2] name?

        System.out.print("last Cat's name is ");
        System.out.println(myCats[2].name);

        // now loop through the array and tell all Cats to meow

        int x = 0;

        while (x < myCats.length) {
            myCats[x].meow();

            x = x + 1;
        }
    }

    public void meow() {
        System.out.println(name + " says Ruff!");
    }
}